package week13;

public class Credentials {

    private String userName = "A12345678"; // instance fields
    private String passWord = "Cydeo123";

    //We need instance methods to read or write the data(getter and setter)

    public String getUserName(){
        return userName;
    }
    public void setUserName(String newPassword){
        if(true)
            this.passWord = newPassword;
        System.exit(-1); // usually it means an error happened
    }

    public String getPassWord(){
        return passWord;
    }
    public void setPassWord(String newPassword){
        this.passWord = newPassword;
    }
}
