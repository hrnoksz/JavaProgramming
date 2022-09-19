package week06;

public class InterviewQuestion {

    public static void main(String[] args) {

        String[] steps = {"x/","y/","../","z/","./"};

        System.out.println(minSteps(steps));
    }
    public static int minSteps(String[] steps){
        int stepCounts = 0;
        for (String eachStep : steps) {

            switch (eachStep){
                case "./":
                    break;
                case "../":
                    stepCounts--;
                    break;
                default:
                    stepCounts++;
                    break;
            }
        }
        return stepCounts;
    }
}
/*
 Task 5 :     Number of Steps to Main directory  --- Interview Task

                 We have a record of every time a change of directory is performed.The different change directory functions
                 are as follow ;

                     ../  Move to parent folder of current folder
                     ./   Remain in the same folder
                     x/   Move to the child folder named x


                     Write a method to Find the minimum steps required to go back to main directory from current folder.
                     The sequence of operations performed after entering the main directory provided


                     Input : {"x/","y/","../","z/","./"}
                            Main Folder---> x ----> z

                     Output : 2
 */