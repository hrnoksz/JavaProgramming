package week11;

public class ParkingMeter {

    public int timeLeft = 0;
    public int maxTime;

    public ParkingMeter(int number) {
        maxTime = number;
    }

    public boolean add(int i) {
        boolean flag = false;
        if (i == 25) {
            if (!(timeLeft + 30 > maxTime)) {
                timeLeft += 30;
                flag = true;
            }
        }
        return flag;
    }

    public void tick() {
        if (timeLeft > 0)
            timeLeft -= 1;
    }

    public boolean isExpired() {

        return timeLeft == 0 ? true : false;
    }

    public String toString() {
        return "ParkingMeter{" +
                "timeLeft=" + timeLeft +
                ", maxTime=" + maxTime +
                '}';
    }
}

/*
Write a class named ParkingMeter containing:
Two instance variables named timeLeft and maxTime of type int. The value of timeLeft should be initialized to 0.
A constructor accepting a single integer parameter whose value is used to initialize the maxTime instance variable.
A method named add that accepts an integer parameter.
If the value of the parameter is equal to 25, the value of timeLeft is increased by 30; otherwise,
no increase is performed.
Furthermore, the increase occurs only if the value of timeLeft will not exceed the value of maxTime.
add returns a boolean value: true if timeLeft was increased, false otherwise.
A method named tick that accepts no parameters and returns no value.
tick decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.
A method named isExpired that accepts no parameters.
isExpired returns a boolean value: true if the value of timeLeft is equal to 0; false otherwise.
 */