package day11_Switch;

public class QuestionOfDay {
    public static void main(String[] args) {

                int firstVariable, secondVariable = 1;

                firstVariable = (secondVariable>1)? 2 : 1;

                switch (firstVariable){
                    case 0:
                        System.out.println(0);
                        break;
                    case 1:
                        System.out.println(1);
                    case 2:
                        System.out.println(2);
                        break;
                    case 3:
                        System.out.println(3);
                        break;
                }
            }
        }

