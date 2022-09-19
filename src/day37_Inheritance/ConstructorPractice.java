package day37_Inheritance;

class A{
    public A(int a){
        System.out.println("A");
    }
}
class B extends A{

    public B(){
        super(9); // it is used calling for parents' constructor
        System.out.println("B");
    }
}
public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();
        System.out.println(obj);
    }
}
