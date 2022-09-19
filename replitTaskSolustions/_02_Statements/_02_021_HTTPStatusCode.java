package _02_Statements;

import java.util.Scanner;

public class _02_021_HTTPStatusCode {

    public static void main(String[] args) {

        System.out.println("Enter status code:");
        Scanner scan=new Scanner (System.in);
        int status= scan.nextInt();
        scan.close();
        String result = (status == 200)? "OK" :(status == 201)? "Created" :(status == 202)? "Accepted"
                :(status == 301)? "Moved Permanently" :(status == 303)? "See Other" :(status == 304)? "Not Modified"
                :(status == 307)? "Temporary Redirect" :(status == 400)? "Bad Request" :(status == 401)? "Unauthorized"
                :(status == 403)? "Forbidden" :(status == 404)? "Not Found" :(status == 410)? "Gone"
                :(status == 500)? "Internal Server Error" :(status == 503)? "Service Unavailable" : "Invalid status code!";

        System.out.println(result);

    }
}
/*
HTTP is the protocol that governs communications between servers and web clients (i.e. browsers).
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
Some of the codes and their meanings are listed below:

STATUS CODES

200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
Given an int variable status write a switch statement to display the status code message.
If an invalid status code is entered display Invalid status code!

Example:

Display message: "Enter status code:"
input: 200

Display message: "OK"
 */