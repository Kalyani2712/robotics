import ch.aplu.robotsim.*;
class steps 
{
steps()
{
  
 TurtleRobot Robot = new TurtleRobot();
 for (int i=0;i<4;i++ ) 
 {
  Robot.forward(20);
  Robot.right(90);
  Robot.forward(20);
  Robot.left(90);
  
} // end of for
Robot.exit();
}
public static void main(String[] args)
{
new steps();
  }

  }