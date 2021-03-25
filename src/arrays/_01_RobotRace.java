package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[2];
	//3. use a for loop to initialize the robots.
		for(int i=0;i<robots.length;i++) {
			robots[i] = new Robot();
		}
	//4. make each robot start at the bottom of the screen, side by side, facing up
		for(int i=0;i<robots.length;i++) {
			robots[i].setSpeed(5);
			robots[i].setX(i*100+75);
			robots[i].setY(500);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		boolean won = false;
		int winner = 0;
		while(!won) {
			for(int i=0;i<robots.length;i++) {
				int distance = rand.nextInt(50);
				robots[i].move(distance);
				if(robots[i].getX()==(i*100+75)&&robots[i].getY()<=250) {
					robots[i].setAngle(90);
				}
				else if(robots[i].getY()<=250 && robots[i].getX()>=i*100+600) {
					robots[i].setAngle(180);
				}
				else if(robots[i].getX()>=i*100+600 && robots[i].getY()>=500) {
					robots[i].setAngle(-90);
				}
				if(robots[i].getY()>=500 && robots[i].getX()<=i*100+75) {
					winner = i;
					won = true;
					break;
				}
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
		System.out.println("Robot " + winner + " has won!");
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
