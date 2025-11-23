//Random moves 
import ch.aplu.robotsim.*;
public class  RandomMove
{
  RandomMove()
  {
    TurtleRobot robot = new TurtleRobot();
    for(int i=0; i<7 ; i++)
    {
      double a = Math.random();
      if(a < 0.5)
        robot.right(90);
      else 
        robot.left(90);
      robot.forward(100);   
      
    }
    robot.exit();
  }
  public static void main(String[] args)
  {
    new RandomMove();
  }
  
}