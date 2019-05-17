/**
  * 'Relation' represents a relation on a set.
  *
  * Calling the 'Relation(int[][] matrix)' constructor automatically
  * stores the matrix and its dimension and initializes the fields
  *     - reflexive
  *     - antireflexive
  *     - symmetric
  *     - antisymmetric
  *     - transitive
  * to 'true' or 'false' indicating whether the relation demonstrates
  * each property.
  *
  * Calling the 'toString()' method returns (as a formatted string)
  * a summary of the relation's properties.
  *
  * Author: Joseph Sturm
  * Date:   5/17/2019
  */
  
public class Relation {
    
    private int[][] matrix;          // matrix representation of a relation
    private int dim;                 // number of columns, rows in matrix
    private boolean reflexive;       // indicates if relation is reflexive
    private boolean antireflexive;   // indicates if relation is antireflexive
    private boolean symmetric;       // indicates if relation is symmetric
    private boolean antisymmetric;   // indicates if relation is antisymmetric
    private boolean transitive;      // indicates if relation is transitive

    /** Constructs a Relation object from a matrix.
      * Parameter 'matrix' must be a square, 0-1, 2D array of integers. */
    public Relation(int[][] matrix) {
        // If matrix not square, print error message and exit program.
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("matrix must be square.");
        }
        this.matrix = matrix;
        this.dim = matrix.length;
        check_reflexive();
        check_antireflexive();
        check_symmetric();
        check_antisymmetric();
        check_transitive();
    }

    public String toString() {
        return "Reflexive?     " + this.reflexive + "\n"
             + "Antireflexive? " + this.antireflexive + "\n"
             + "Symmetric?     " + this.symmetric + "\n"
             + "Antisymmetric? " + this.antisymmetric + "\n"
             + "Transitive?    " + this.transitive;
    }
    
    public void print_matrix() {
        for (int i = 0; i < this.dim; i++) {
            System.out.print("\n");
            for (int j = 0; j < this.dim; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
        }
        System.out.println("\n");
    }
    
    public int[][] get_matrix() {
        return matrix;
    }
    
    public int get_dim() {
        return dim;
    }
    
    public boolean get_reflexive() {
        return reflexive;
    }
    
    public boolean get_antireflexive() {
        return antireflexive;
    }
    
    public boolean get_symmetric() {
        return symmetric;
    }
    
    public boolean get_antisymmetric() {
        return antisymmetric;
    }
    
    public boolean get_transitive() {
        return transitive;
    }

    /** Initializes the 'reflexive' field. */
    private void check_reflexive() {
        for (int i = 0; i < this.dim; i++) {
            // If any diagonal entry is 0, reflexive is false; return.
            if (this.matrix[i][i] == 0) {
                this.reflexive = false;
                return;
            }
        }
        this.reflexive = true;
    }
    
    /** Initializes the 'antireflexive' field. */
    private void check_antireflexive() {
        for (int i = 0; i < this.dim; i++) {
            // If any diagonal entry is 1, antireflexive is false; return.
            if (this.matrix[i][i] == 1) {
                this.antireflexive = false;
                return;
            }
        }
        this.antireflexive = true;
    }

    /** Initializes the 'symmetric' field. */
    private void check_symmetric() {
        for (int i = 0; i < this.dim; i++) {
            for (int j = 0; j < this.dim; j++) {
                // If any (i, j), (j, i) pair is not equal, 
                // symmetric is false; return.
                if (this.matrix[i][j] != this.matrix[j][i]) {
                    this.symmetric = false;
                    return;
                }
            }
        }
        this.symmetric = true;
    }

    /** Initializes the 'antisymmetric' field. */
    private void check_antisymmetric() {
        for (int i = 0; i < this.dim; i++) {
            for (int j = 0; j < this.dim; j++) {
                // If i == j or the current entry is zero, next iteration.
                if (i == j || this.matrix[i][j] == 0) {
                    continue;
                }
                // If any (i, j), (j, i) pair is equal, 
                // antisymmetric is false; return.
                if (this.matrix[i][j] == this.matrix[j][i]) {
                    this.antisymmetric = false;
                    return;
                }
            }
        }
        this.antisymmetric = true;
    }

    /** Initializes the 'transitive' field. */
    private void check_transitive() {
        // Create Warshall matrix.
        int[][] w = new int[this.dim][this.dim];
        // Copy matrix to Warshall matrix.
        for (int i = 0; i < this.dim; i++) {
            for (int j = 0; j < this.dim; j++) {
                w[i][j] = this.matrix[i][j];
            }
        }
        // Find transitive closure of matrix.
        for (int k = 0; k < this.dim; k++) {
            for (int i = 0; i < this.dim; i++) {
                for (int j = 0; j < this.dim; j++) {
                    w[i][j] =     (w[i][j] == 1)
                              || ((w[i][k] == 1)
                              &&  (w[k][j] == 1)) ? 1 : 0;
                }
            }
        }
        // If the transitive closure is not equivalent to matrix,
        // transitive is false;  return.
        for (int i = 0; i < this.dim; i++) {
            for (int j = 0; j < this.dim; j++) {
                if (w[i][j] != this.matrix[i][j]) {
                    this.transitive = false;
                    return;
                }
            }
        }
        this.transitive = true;
    }
}