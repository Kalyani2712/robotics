import ch.aplu.robotsim.*;
import ch.aplu.util.*;

public class pathfind
{
 pathfind()
{
 LegoRobot robot = new LegoRobot();
 Gear gear= new Gear();
 robot.addPart(gear);
 TouchSensor ts1 = new TouchSensor(SensorPort.S3);
 TouchSensor ts2 = new TouchSensor(SensorPort.S3);
 robot.addPart(ts1);
 robot.addPart(ts2);
 gear.forward();
 while (!QuitPane.quit()) { 
 boolean t1=ts1.isPressed();
 boolean t2=ts2.isPressed();
 if (t1 && t2) {
    gear.backward(500);
    gear.left(1200);
    gear.forward();
 } // end of if
 else {
 if (t1) 
 {
    gear.backward(500);
    gear.left(400);
    gear.forward();  
 } 
 else {
 if (t2) {
     gear.backward(500);
    gear.left(100);
    gear.forward();
 } // end of if
  
 } // end of if-else
    } 
    Tools.delay(20);
 } // end of while
 robot.exit();
  }
  
  
public static void main(String[] args)
{
    new pathfind();
  }
  static{
       RobotContext.setLocation(10,10);
       RobotContext.setStartDirection(5);
       RobotContext.setStartPosition(100,240);
       RobotContext.useObstacle(RobotContext.channel);
    
    }
    
  }
  