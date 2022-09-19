package day17_While_DoWhile;

public class _13_BranchingStatement_Continue {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if(i == 'C'){
               continue;
            }
            System.out.println(i); // A B D E
        }

        System.out.println("----------------------------------");
        // print all even numbers 1 ~ 10
        for (int i = 1; i <= 10 ; i++) { //i:1,2,3,4,5,6,7,8,9,10
            if(i%2 != 0){ // 1, 3, 5, 7, 9
                continue; // skip
            }
            System.out.print(i+ " "); // 2,4,6,8,10
        }
        System.out.println();


        System.out.println("-------------------------------------");
        // print all odd numbers 1 ~ 10

        for (int i = 1; i <= 10 ; i++) {
            if(i%2 == 0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();




    }
}
