/*Joseph Hoffman
CSC 220
Program 5
*/
package csc220.program5.hoffmajd2020;
import java.awt.*;

public class Airplane extends csc220.program5.GameCharacter{

   public Airplane(Integer x, Integer y, Integer size, int moveInterval) {
       super(x, y, size, size, moveInterval, new csc220.program5.hoffmajd2020.List<Point>());
       animationPath.add(new Point(x, y));
       animationPath.add(new Point(x + 100, y));
       animationPath.add(new Point(x, y + 100));
       animationPath.add(new Point(x + 100, y + 100));

   }//end of contructor
   public void draw(Graphics g) {
       int over = getOver();
       int down = getDown();
       g.setColor(Color.RED);
       g.fillOval(over, down, 90, 20);
       g.fillOval(over + 20, down - 20, 20, 60);
       g.fillOval(over + 65, down -10, 15, 40);
       g.setColor(Color.BLACK);
       g.drawLine(over + 5,down - 10, over - 5, down + 30);
       g.drawLine(over - 5,down - 10, over + 5, down + 30);
   }// end of draw
}// end of Airplane class
