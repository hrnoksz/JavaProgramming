package week07;

public class _05_Task02 {

    public static void main(String[] args) {

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <= i; j++) {
                if(j%2==1){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();

        }


    }
}
/*
1
10
101
1010
10101
101010

we have 6 rows, 6 columns
pattern: for odd columns print "1", for even columns "0"
 */