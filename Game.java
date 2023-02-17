// Stone Paper Scissor game.
package demo;
import java.util.Random;
import java.util.Scanner;

public class Game {
public static void main(String[] args)
{
	Random random = new Random();
	int number = random.nextInt(3);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Welcome in Stone Paper Scissors game ");
		System.out.println("1) Stone ");
		System.out.println("2) Paper ");
		System.out.println("3) Scissor");
		//System.out.println("4) Exit");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1:
		{
			if(number == 2)
				System.out.println("Your choic = Stone\nComputer's choice = Scissor\nYou win the game.");
			else if (number == 0)
				System.out.println("Your choic = Stone\nComputer's choice = Stone\nNo one is winner");
			else if (number == 1)
				System.out.println("Your choic = Stone\nComputer's choice = Paper\nYou are losser");
			break;
		}
		case 2:
		{
			if(number == 0)
				System.out.println("Your choic = Paper\nComputer's choice = Stone\nYou win the game.");
			else if (number == 1)
				System.out.println("Your choic = Paper\nComputer's choice = Paper\nNo one is winner");
			else if(number == 2)
				System.out.println("Your choic = Paper\nComputer's choice = Scissor\nYou are losser");
			break;
		}
		case 3:
		{
			if(number == 1)
				System.out.println("Your choic = Scissor\nComputer's choice = Paper\nYou win the game.");
			else if(number == 0)
				System.out.println("Your choic = Scissor\nComputer's choice = Stone\nYou are loser.");
			else if(number == 2)
				System.out.println("Your choic = Scissor\nComputer's choice = Scissor\nNo one is winner.");
			break;
		}
		default :
		{
			System.out.println("You are entering wrong choice");
			break;
		}
		}
}
}
