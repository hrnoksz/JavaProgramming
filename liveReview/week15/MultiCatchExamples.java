package week15;

public class MultiCatchExamples {

    public static void main(String[] args) {

        // more specialized exception class statement should be first in the order

        String word = "Java";

        try {
            System.out.println(word.substring(20)); // unchecked exception IndexOutOfBoundsException
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getClass().getSimpleName());
            System.out.println("Reason: "+e.getMessage());
        }
        catch (Throwable t){ // parent of all exceptions
                            // parent exception type cannot be placed before the child exception type
            System.out.println(t.getClass().getSimpleName());
            System.out.println("Reason: "+t.getMessage());
        }


    }
}
