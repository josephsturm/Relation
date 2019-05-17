# The Relation Class

### Introduction:
---
Relations on a single set (*R: A -> A*) can demonstrate the following mathematical properties:

+ Reflexivity
+ Antireflexivity
+ Symmetry
+ Antisymmetry
+ Transitivity

The *Relation* class represents such a relation. Objects of type *Relation* store:

+ A matrix representation of the relation
+ The dimension of the matrix representation
+ Booleans to indicate whether the relation demonstrates each property

### Using the Relation Class:
---
Users should create and interface with *Relation* objects using the public methods described below.

##### **public Relation(int[][] matrix)**
Constructor. Takes a 2D array of integers as a parameter. Returns an object of type *Relation*. Invisibly initializes the boolean instance variable for each property.

##### **public String toString()**
Returns a formatted string that lists each property and indicates whether it is demonstrated by the relation.

##### **public boolean get_reflexive()**
Returns *true* if the relation is reflexive, otherwise *false*.

##### **public boolean get_antireflexive()**
Returns *true* if the relation is antireflexive, otherwise *false*.

##### **public boolean get_symmetric()**
Returns *true* if the relation is symmetric, otherwise *false*.

##### **public boolean get_antisymmetric()**
Returns *true* if the relation is antisymmetric, otherwise *false*.

##### **public boolean get_transitive()**
Returns *true* if the relation is transitive, otherwise *false*.

### Authors:
---
Joseph Sturm 
5/17/2019