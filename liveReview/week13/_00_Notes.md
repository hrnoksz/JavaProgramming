##JAVA OOP CONCEPTS
##Encapsulation
###What is encapsulation?
1. Data Hiding
    - Hiding the data by providing private access modifiers
2. How do we perform? (**PIQ**)
    - make all class fields private
    - create public getter: to read the data
    - create public setter: to write the data
3.Encapsulation helps us to manipulate the data field with certain conditions
4.conditions in setter method, we usually customize getter method output format, return the data in a certain format

###Read Only
   -Only provide getter to your class, and it will be read only (immutable: not changing)
###Write Only
   -We can provide only setter to our class to make it write only
4. Conditions in setter method, we usually customize getter method output format
return the data in a certain

##Inheritance

A class inherit the properties/methods of parent class
we use extends keyword for it
Builds a 'IS A' relationship

What can be inherited?
All public variables, methods
All protected var. and met.
All default var. and mets. only if super and sub class are in the same package

What can Not be inherited?
private variables and methods, however you can reach these with public getter/setters
constructors: subclass first calls super class constructor

In real life application we will mostly use 'protected' access modifier for inheritance

Benefits:
Encapsulation: protect instance variables from invalid values
Inheritance: it provides code reusability and maintainability
-maintainability: we put common fields and methods to parent class (one place) 
(Page Object models: we will have a parent class)

Constructors:
superclass constructor always execute before the subclass constructor
this() also needs to be the first statement, super() and this() can NOT be in the same constructor