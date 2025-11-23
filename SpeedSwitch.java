
import ch.aplu.robotsim.*;
  public class SpeedSwitch
  {
  SpeedSwitch()
  {
  TurtleRobot robot = new TurtleRobot();
  for(int k =1; k < 6 ; k++)
  {
  int speed;
      switch (k) 
      {
        case  1:
            speed=20 ;
          break;
        case  2:
             speed =40;
            break;
        case 3:
          speed=60;
          break;
        case 4:
          speed=80;
          break;
        default: 
                speed=50;
      } // end of switch
      System.out.println("k = " + k + " → Speed = " + speed);
      robot.setTurtleSpeed(speed);
      robot.forward(200);
      robot.right(90);
    }
    robot.exit();
 }   
  public static void main(String[] args)
  {
  new SpeedSwitch();
    }
    }