package day35_Encapsulation;

public class CredentialObject {

    public static void main(String[] args) {

        Credential obj = new Credential("Harun", "abcdefg111#");
        obj.getPassword();
        System.out.println(obj.getPassword());

        System.out.println(obj);
    }
}
