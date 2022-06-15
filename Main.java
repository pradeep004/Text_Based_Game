package textBasedGame;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please the charecter name :");
		String name = sc.nextLine();
		System.out.println("Please the enter the health of the character :");
		int health = Integer.parseInt(sc.nextLine());
		System.out.println("please enter the characte's favorite line:");
		String catchPhrase = sc.nextLine();
		
		Characters ch = new Characters(name, health,catchPhrase);
		ch.getInfo();
		
		System.out.print("Enter the map size ofvalue X:");
		int X = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the  map size Y:");
		int Y = Integer.parseInt(sc.nextLine());
		
		Random rand = new Random();
		int currentX = rand.nextInt(X+1);
		int currentY = rand.nextInt(Y+1);
		
		
		map m = new map(X, Y, currentX,currentY);
		m.getInfo();
		
		int winX = rand.nextInt(X+1);
		int winY = rand.nextInt(Y+1);
		System.out.println("the winning points are:"+ winX +","+ winY);
		
		String direction;
		while(m.getCurrentX() != winX || m.getCurrentY() != winY) {
			System.out.print("Please enter a direction N, E, S, or W:");
			direction = sc.nextLine();
			m.move(direction);
			m.getInfo();
			
		}
		System.out.println("You've reached your destination");
		
	}

}
