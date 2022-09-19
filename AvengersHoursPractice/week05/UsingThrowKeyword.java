package week05;

public class UsingThrowKeyword {

    public static void main(String[] args) {

        /*
        We can use throw keyword to create exception object (unchecked type)
         */

        String userName = "harun";

        if(userName.isEmpty()){
            throw new RuntimeException("Username cannot be empty");
        }

    }
}
