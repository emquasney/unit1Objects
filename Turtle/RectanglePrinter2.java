import java.awt.Rectangle;
public class RectanglePrinter2
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0,0,200,400);
      Rectangle r2 = new Rectangle(0,0,200,400);
      r2.translate(25,60);
      System.out.println(r1);
      System.out.println(r2);
   }
}