import java.util.Scanner;
public class GoingOut 
{

	private int randNum;
	private double money;
	private String decision;

	public GoingOut()
	{
		randNum = -1;
		money = -1.0;
		decision = new String("");
	}

	public static void main(String[] args) 
	{
		GoingOut going = new GoingOut();
		going.decide();
		going.printOut();
	}
	public void decide()
	{
		Scanner in = new Scanner (System.in);
		randNum = (int)(Math.random()*3)+3;
		System.out.print("How much money do you have? ");
		money = in.nextDouble();
		if (randNum == 3 && money<=15.0)
			decision = ("bowl at Homestead Lanes");
		else if (randNum == 3 && money>15.0)
			decision = ("bowl at Bowlmor");
		else if (randNum == 4 && money<=15.0)
			decision = ("dine at Tam Café");
		else if (randNum == 4 && money>15.0)
			decision = ("dine at Elephant Bar");
		else if (randNum == 5)
			decision = ("stay in and watch TV");
		in.close();
		
	}
	public void printOut()
	{
		System.out.printf("Based on our random number %d and the $%.2f you have, lets %s!", randNum, money, decision);
	}

}
