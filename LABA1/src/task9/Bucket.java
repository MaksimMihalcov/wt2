package task9;

import java.util.ArrayList;

public class Bucket {
    public ArrayList<Ball> balls;
    public  Bucket(){
        balls = new ArrayList<Ball>();
    }

    public int getTotalBallsWeight(){
        var tw = 0;
        for(Ball ball : balls)
           tw += ball.weight;
        return tw;
    }

    public int getTotalBlueBallsCount(){
        var tw = 0;
        for(Ball ball : balls)
            if(ball.color == Color.Blue)
                tw++;
        return tw;
    }
}
