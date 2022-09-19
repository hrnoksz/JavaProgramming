package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        try {

            System.out.println(employee.getSalary()); // Null pointer exception

        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){ //RuntimeException is parent of all the unchecked exceptions, and it cannot be
                                    // placed before the child exception type
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("-------------------------------------------");

        System.out.println("Test2 started");
        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test2 completed");

    }
}
