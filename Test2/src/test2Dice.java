import java.util.Random;

public class test2Dice {	
		
	private int Dice;	
	private int Dice1;	
	private int Dice2;	
	
	
	public test2Dice( int numDices)
	{
		 Dice = numDices;
		 Dice1 = numDices;
		 Dice2 = numDices;
	}
	
	public int Throw()
	{
		return (Dice.Throw() + Dice1.Throw() + Dice2.Throw() / 3;			
	}	
	
		
	public int GetANumber()
	{
		int game = 0 + (int) (Math.random() * 10);
		return game;		
	}
	
}
