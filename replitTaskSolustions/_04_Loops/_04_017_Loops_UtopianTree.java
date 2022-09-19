package _04_Loops;

public class _04_017_Loops_UtopianTree {

    public static void main(String[] args) {

        int growth = 0;

        for(int i = 1; i <= 10; i++){
            if(i <= 3){
                growth+=1;
                System.out.println("year "+i+" - growth 1 cm \ntree size: " + growth+"cm");

            }else{
                growth += 2;
                System.out.println("year "+i+" - growth 2 cm\ntree size: "+growth+"cm");
            }
        }

    }
}
/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year.
Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm
 */