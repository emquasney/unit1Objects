import java.util.Random;
public class DieSim
{
   public static void main(String[] args)
   {
      Random dice = new Random();
      int roll = 1 + dice.nextInt(6);
      System.out.println("You have rolled a " + roll);
   }
}