import java.awt.Color;
public class TurtleLab
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        //Picture pic = new Picture("GrumpyCat.jpg");
        //turtle.setPicture(pic);
        //Setting picture was worth a try
        turtle2.setPenColor(Color.RED);
        turtle.penDown();
        turtle.turn(45);
        turtle2.turn(-45);
        turtle.forward(100);
        turtle2.forward(100);
        turtle.turn(-90);
        turtle2.turn(90);
        turtle.forward(50);
        turtle2.forward(50);
        turtle.turn(-45);
        turtle2.turn(45);
        turtle.forward(35);
        turtle2.forward(35);
        turtle2.turn(180);
        turtle2.hide();
        turtle.penUp();
        turtle.turn(-90);
        turtle.forward(20);
        turtle.penDown();
        turtle.setPenColor(Color.BLUE);
        turtle.turn(90);
        turtle.backward(20);
        turtle.forward(40);
        turtle.turn(-90);
        turtle.forward(20);
        turtle.turn(-90);
        turtle.forward(40);
        turtle.turn(90);
        turtle.forward(20);
        turtle.turn(90);
        turtle.forward(40);
    }
}
