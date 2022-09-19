package day24_CustomMethod_Return;

public class practice {

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7};
            int num=10;
            System.out.println(contains(arr,num));
        }
        public static boolean contains(int[] arr,int num){
            boolean contain=false;
            for (int i : arr) {
                if(i==num){
                    contain=true;
                    break;
                }
            }
            return contain;
        }

    }

