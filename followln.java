import ch.aplu.jgamegrid.*;
import ch.aplu.robotsim.*;
import java.awt.*;

public class followln implements LightListener
{
  // start attributes
  private Gear gear = new Gear();
  // end attributes

  public followln()
  {
    LegoRobot robot = new LegoRobot();
    LightSensor ls = new LightSensor(SensorPort.S3);
    robot.addPart(gear);
    robot.addPart(ls);
    ls.addLightListener(this,500);
    gear.forward();
  }
  // start methods
  public void bright(SensorPort port , int level)
  {
    gear.rightArc(0.15);
  }
  public void dark(SensorPort port , int level)
  {
    gear.leftArc(0.15);
  }
  public static void main(String[] args)
  {
    new followln();
  } 
  public static void _init(GameGrid gg)
  {
    GGBackground bg= gg.getBg();
    bg.setPaintColor(Color.blue);
    bg.fillArc(new Point(250,250),50,0,360);
    bg.fillArc(new Point(250,350),100 , 0, 360);
  }
  // end methods
}