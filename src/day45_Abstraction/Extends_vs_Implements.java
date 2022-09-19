package day45_Abstraction;

// extends:

class A{

}

class B extends A{

}

// for interface

interface Z{

}

interface X{

}

interface Y extends X, Z{

}

//implements

class D implements X,Y,Z{

}

// extends vs implements; extends first then implements

public class Extends_vs_Implements extends A implements X,Y,Z{

}
