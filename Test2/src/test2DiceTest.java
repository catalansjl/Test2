import java.util.Scanner;

public class test2DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
				
		Scanner input = new Scanner(System.in);		
		
		int numDices;	
		int numGuess;
		
		 System.out.printf("Please enter a number of dices \n");
		 numDices = input.nextInt();  
		 
		 System.out.printf("Welcome to the guess a number game, please type in a number between 0 and 10 \n");
		 numGuess = input.nextInt();  		 
		 
		 test2Dice myDiceNumber = new test2Dice(numDices);	
		 
		 test2Dice myRandomNumber = new test2Dice(numGuess);	
		
		int compNumber = myDiceNumber.Throw();	
		
		int compNumber2 = myRandomNumber.GetANumber();
		
		if (compNumber2 = compNumber)		
			System.out.printf("You have win \n");
		else	
			System.out.printf("You have lost \n");
		 
		
		 
   }	 
}




		
		
		
		
		
	