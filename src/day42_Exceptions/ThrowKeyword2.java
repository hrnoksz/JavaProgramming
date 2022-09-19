package day42_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        throw new NoSuchElementException("There is no such element as break");
        //System.out.println("hello world"); compile error==> checked exception
        //                                                    after creating exception by using throw keyword,
        //                                                    we cannot run print statement

        //throw new Rectangle(5, 7);


    }
}
