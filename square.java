import ch.aplu.robotsim.*;
public class square
{
square()
{
TurtleRobot robot = new TurtleRobot();
int i = 0;
while (i < 4)
{
robot.forward(50);
robot.right(90);
i++;
}
robot.exit();
 
} // end of while
public static void main(String[] args) {
       new square();
}
  }