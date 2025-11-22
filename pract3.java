import ch.aplu.robotsim.*;
public class pract3
{
public pract3()
{

LegoRobot robot = new LegoRobot();
Motor motA = new Motor(MotorPort.A);
Motor motB = new Motor(MotorPort.B);
robot.addPart(motA);
robot.addPart(motB);

System.out.println("MotA forward , motB Forward ");
motA.forward();
motB.forward();
Tools.delay(2000);



System.out.println("motA stop");
motA.stop();
Tools.delay(2000);

System.out.println("motB stop"); 
motB.stop();
Tools.delay(2000);

System.out.println("motA forward , motB backward");
motA.backward();
motB.forward();
Tools.delay(2000);


System.out.println("motA backward");
motA.backward();    
Tools.delay(2000);
System.out.println("existing");
robot.exit();

  }
public static void main(String[] args) {
new pract3();
  
}  

static
{
RobotContext.showStatusBar(30);
}



  }