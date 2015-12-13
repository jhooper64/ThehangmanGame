//Game inspired by Java: How to Program by Paul & Harvey Deitel and Java: All-in-One For Dummies by Doug Lowe.

package theHangmanGame;


import java.util.Scanner;

public class GameMain 
{
	public static void main( String[] args) 			//Main method for the entire program.
    {
        Scanner scan = new Scanner( System.in);
                        

        													// VARIABLES
        int WrongGuessCount = 0;
        boolean bool = false;
        
        
        
        beginGame();										//Calling the method beginGame.
        
        GameWords word = new GameWords();					//Creating an instance word.
        System.out.println("Your hint is: " + word.getHint());
        UserInput input = new UserInput();					//Creating an instance input.
        
        while (WrongGuessCount < 6 && !word.isSolved())		//While statement that says that wrong guesses less than six and if the the word is not solved.
        {
            System.out.println(word);
            char ch = input.getNewLetter();
            
            if (!word.update(ch))							//(144, Deitel) Reversing the meaning of the condition. 
            {
            	WrongGuessCount = WrongGuessCount + 1 ;
            	
            	
        }
        if (word.isSolved())								//If word is solved then print.
        {
            System.out.println("Great job! You won!");
        
        }
        else
        {
            System.out.println("The little fellow is hung! Sorry, you lost!");		//Else print.
            
        	PictureLibrary pic = new PictureLibrary();
		
        	pic.getGraphics7();								//Display pic 7.
        	}
        }
    }
        
    public static void beginGame()							//Bigins the game with system print statement and displays pic 1.
    {
        System.out.println( "Welcome to Hangman Game. You have six tries before the little fellow dies." );
            
        PictureLibrary pic = new PictureLibrary();
			
        pic.getGraphics1();
    }
        
}
