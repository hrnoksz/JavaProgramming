package week05;

public class DynamicSubstring {

    public static void main(String[] args) {

        // substring method(): It takes index location of the char, returns you a new string

        String searchResult = "result count:12345";
        //searchResult = searchResult.substring(searchResult.indexOf(":")+1); // takes the beginning index then rest of the string
        //System.out.println(searchResult);
        int colonIndex = searchResult.indexOf(":");
        System.out.println(colonIndex);
        searchResult = searchResult.substring(colonIndex+1);
        System.out.println(searchResult);

        //in indexOf("") if there are one more than same character?
        System.out.println("-----------------------------------------------");
        String searchResultTwo = " username:oscar search result count:12345 : more ";
        int firstColon = searchResultTwo.indexOf(":");
        System.out.println(firstColon);
        int lastColon = searchResultTwo.indexOf(":", firstColon+1);
        System.out.println(lastColon);

        System.out.println(searchResultTwo.substring(lastColon+1, lastColon+6));
        // lastColon+1: beginning index
        // lastColon+6: ending index

        String today = "I coded a lot of [java] today";
        String result = today.substring(today.indexOf("[")+1, today.indexOf("]") );
        System.out.println(result);





    }
}
