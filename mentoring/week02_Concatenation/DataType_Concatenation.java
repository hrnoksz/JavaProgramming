package week02_Concatenation;

public class DataType_Concatenation {

    public static void main(String[] args) {

        // dataType name;
        String name ;  //declaring a variable
        name="Zeynep"; //initializing a variable
        int num=100;
        System.out.println(num + num);// 200

        //addition
        //number + number
        //concatenation-- gives us String
        //String+data
        //data+String
        //String+String

        String school="Cydeo";

        System.out.println( school + "School" + 3 ); //CydeoSchool3
        System.out.println( school + "School" + 2 + (3 + 5) );// CydeoSchool28
        System.out.println( 4 + 456 + school + 'a');//460Cydeoa
        System.out.println("-----------------------------------");
        System.out.println( 4 + 456 + school + ('b' + 2));//460Cydeo100 ==> in ASCII table 'b' = 98 ==> 98 + 2 = 100
        System.out.println( 4 + 456 + school + ('A' + 2));//460Cydeo67 // 'A' we should look at ASCII table
        System.out.println("------------------------------------");
        System.out.println( 4 + 456 + school + 'A' + 2);//460CydeoA2 // 'A' we should look at ASCII table
        System.out.println( 'a' + 'b');  //195
        System.out.println(1 + 2);//3
        System.out.println( 'a' + "" + 'b'); //ab
        //easy way to convert a char to string is to add "" (empty String)


    }
}
