package week01;

public class StringManipulator {

    public String str; // attribute


    public StringManipulator(String str) { // one parameter constructor
        this.str = str;
    }
    public void firstTwoChars(){
       str = str.toUpperCase().substring(0,2);
    }

    public String tripler(){
        str = ""+str.charAt(str.length()-2)+str.charAt(str.length()-1);
        str = str.repeat(3);
        return str;
    }
    public void reverse(){

    }
}
