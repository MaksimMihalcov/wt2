package task9;

public class Main {
    public static void main(String[] args){
        var bucket = new Bucket();
        bucket.balls.add(new Ball(10, Color.Green));
        bucket.balls.add(new Ball(11, Color.Red));
        bucket.balls.add(new Ball(17, Color.Blue));
        bucket.balls.add(new Ball(25, Color.Blue));
        bucket.balls.add(new Ball(17, Color.Red));
        bucket.balls.add(new Ball(3, Color.Green));
        System.out.println("Total ball weight in bucket: " + bucket.getTotalBallsWeight());
        System.out.println("Total ball count in bucket: " + bucket.getTotalBlueBallsCount());
    }

}