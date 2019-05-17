/**
  * Testing the 'Relation' class.
  *
  * Each object's output is compared to an expected output
  * (derived by hand). If the two results match, each test 
  * will pass.
  *
  * Author: Joseph Sturm
  * Date:   5/17/2019
  */

public class RelationTests {

    /** Runs tests of 'Relation' class */
    public static void main(String[] args) {
        // Antireflexive.
        // Symmetric.
        // Antisymmetric.
        // Transitive.
        int[][] mat1 = {{0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}};
                        
        // Reflexive.
        // Symmetric.
        // Transitive.
        int[][] mat2 = {{1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 1, 1}};
                        
        // Reflexive.
        // Symmetric.
        // Antisymmetric.
        // Transitive.
        int[][] mat3 = {{1, 0, 0, 0},
                        {0, 1, 0, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 1}};
                        
        // Antireflexive.
        // Symmetric.
        int[][] mat4 = {{0, 1, 1, 1},
                        {1, 0, 1, 1},
                        {1, 1, 0, 1},
                        {1, 1, 1, 0}};

        // Transitive.
        int[][] mat5 = {{1, 1, 1, 0},
                        {0, 1, 1, 0},
                        {0, 1, 1, 0},
                        {0, 0, 0, 0}};

        // None.
        int[][] mat6 = {{1, 1, 1, 0},
                        {0, 1, 1, 0},
                        {0, 1, 0, 0},
                        {0, 0, 0, 0}};

        // None.
        int[][] mat7 = {{1, 0, 0, 1},
                        {1, 0, 1, 0},
                        {0, 0, 0, 1},
                        {1, 0, 0, 0}};

        // Reflexive.
        // Antisymmetric.
        int[][] mat8 = {{1, 1, 1, 0},
                        {0, 1, 0, 0},
                        {0, 0, 1, 1},
                        {1, 0, 0, 1}};

        // Reflexive.
        // Symmetric.
        // Transitive.
        int[][] mat9 = {{1, 0, 0, 0},
                        {0, 1, 1, 0},
                        {0, 1, 1, 0},
                        {0, 0, 0, 1}};
        
        System.out.println("Relation tests:");
        
        // Test matrix 1.
        Relation rmat1 = new Relation(mat1);
        if (rmat1.get_reflexive()     == false &&
            rmat1.get_antireflexive() == true  &&
            rmat1.get_symmetric()     == true  &&
            rmat1.get_antisymmetric() == true  &&
            rmat1.get_transitive()    == true) {
        /////////////////////////////////////////
            System.out.println("mat1: pass");
        } else {
            System.out.println("mat1: fail");
        }
        
        // Test matrix 2.
        Relation rmat2 = new Relation(mat2);
        if (rmat2.get_reflexive()     == true  &&
            rmat2.get_antireflexive() == false &&
            rmat2.get_symmetric()     == true  &&
            rmat2.get_antisymmetric() == false &&
            rmat2.get_transitive()    == true) {
        /////////////////////////////////////////
            System.out.println("mat2: pass");
        } else {
            System.out.println("mat2: fail");
        }
        
        // Test matrix 3.
        Relation rmat3 = new Relation(mat3);
        if (rmat3.get_reflexive()     == true  &&
            rmat3.get_antireflexive() == false &&
            rmat3.get_symmetric()     == true  &&
            rmat3.get_antisymmetric() == true  &&
            rmat3.get_transitive()    == true) {
        /////////////////////////////////////////
            System.out.println("mat3: pass");
        } else {
            System.out.println("mat3: fail");
        }
        
        // Test matrix 4.
        Relation rmat4 = new Relation(mat4);
        if (rmat4.get_reflexive()     == false &&
            rmat4.get_antireflexive() == true  &&
            rmat4.get_symmetric()     == true  &&
            rmat4.get_antisymmetric() == false &&
            rmat4.get_transitive()    == false) {
        /////////////////////////////////////////
            System.out.println("mat4: pass");
        } else {
            System.out.println("mat4: fail");
        }
        
        // Test matrix 5.
        Relation rmat5 = new Relation(mat5);
        if (rmat5.get_reflexive()     == false &&
            rmat5.get_antireflexive() == false &&
            rmat5.get_symmetric()     == false &&
            rmat5.get_antisymmetric() == false &&
            rmat5.get_transitive()    == true) {
        /////////////////////////////////////////
            System.out.println("mat5: pass");
        } else {
            System.out.println("mat5: fail");
        }
        
        // Test matrix 6.
        Relation rmat6 = new Relation(mat6);
        if (rmat6.get_reflexive()     == false &&
            rmat6.get_antireflexive() == false &&
            rmat6.get_symmetric()     == false &&
            rmat6.get_antisymmetric() == false &&
            rmat6.get_transitive()    == false) {
        /////////////////////////////////////////
            System.out.println("mat6: pass");
        } else {
            System.out.println("mat6: fail");
        }
        
        // Test matrix 7.
        Relation rmat7 = new Relation(mat7);
        if (rmat7.get_reflexive()     == false &&
            rmat7.get_antireflexive() == false &&
            rmat7.get_symmetric()     == false &&
            rmat7.get_antisymmetric() == false &&
            rmat7.get_transitive()    == false) {
        /////////////////////////////////////////
            System.out.println("mat7: pass");
        } else {
            System.out.println("mat7: fail");
        }
        
        // Test matrix 8.
        Relation rmat8 = new Relation(mat8);
        if (rmat8.get_reflexive()     == true  &&
            rmat8.get_antireflexive() == false &&
            rmat8.get_symmetric()     == false &&
            rmat8.get_antisymmetric() == true  &&
            rmat8.get_transitive()    == false) {
        /////////////////////////////////////////
            System.out.println("mat8: pass");
        } else {
            System.out.println("mat8: fail");
        }
        
        // Test matrix 9.
        Relation rmat9 = new Relation(mat9);
        if (rmat9.get_reflexive()     == true  &&
            rmat9.get_antireflexive() == false &&
            rmat9.get_symmetric()     == true  &&
            rmat9.get_antisymmetric() == false &&
            rmat9.get_transitive()    == true) {
        /////////////////////////////////////////
            System.out.println("mat9: pass");
        } else {
            System.out.println("mat9: fail");
        }
    }
}