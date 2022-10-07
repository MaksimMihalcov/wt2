package task9;

public class Ball {
    public long weight;
    public Color color;

    public Ball(long weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public Ball(){
    }
}

enum Color{
    Blue, Green, Red
}
