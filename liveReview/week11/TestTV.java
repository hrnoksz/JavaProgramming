package week11;

import java.util.ArrayList;

public class TestTV {

    public static void main(String[] args) {

        TV Samsung = new TV(); // new keyword invokes our constructor with no parameters

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolume(3);
        System.out.println(Samsung);

        TV LG = new TV();
        LG.turnOn();
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG);

        TV Sony = new TV(3, 5, false);

        //ArrayList
        ArrayList<TV> tvList = new ArrayList<>();
        tvList.add(Samsung);
        tvList.add(LG);
        tvList.add(Sony);
        for(TV eachTv : tvList){ //eachTv: becomes object reference for our TV objects
            System.out.println("Is the TV on? " + eachTv.on);
        }
    }
}
