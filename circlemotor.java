import ch.aplu.robotsim.*;
public class circlemotor
{
circlemotor()
{
LegoRobot robot = new LegoRobot();
Motor motA= new Motor(MotorPort.A);
Motor motB= new Motor(MotorPort.B);
robot.addPart(motA);
robot.addPart(motB);
motA.setSpeed(60);
motB.setSpeed(30);
while (true) {
motA.forward();
motB.forward(); 
} // end of while
}
public static void main(String[] args ) {
      new circlemotor();
}
}