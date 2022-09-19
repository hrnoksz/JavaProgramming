package day40_FinalKeyword;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){
        if(circle.getRadius() < 5){
            return; // exits the method
        }
        this.circle = circle;
    }

    public Square getSquare(){
        return square;
    }

    public void setSquare(Square square){
        if(square.getSide() < 1){
            return;
        }
        this.square = square;
    }
}
