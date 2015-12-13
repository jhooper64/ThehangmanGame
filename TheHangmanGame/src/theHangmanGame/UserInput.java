package theHangmanGame;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput 
{
											// ArrayList
    ArrayList<String> userList ; 
    boolean chosen;
    
    										//Constructor   
    public UserInput()
    {
        userList = new ArrayList<String>();
    }
    
    										// Adds and stores the entered letter in the Arraylist
    public void letterChosen( String letter )
    {
        userList.add( letter );
    }
    
    										// Checks if the entered letter has been chosen before
    public boolean hasBeenChosen( String letter)
    {
        chosen = userList.contains( letter );
        return chosen;
    }
    
    
    public char getNewLetter() 
    {
        Scanner scan = new Scanner( System.in);
    
        char let;
        boolean chosen;
        String convert;   							 // used to convert let into a String
        
        do
        {   
            System.out.println("Please enter a letter.");
            let = scan.next().charAt(0); 			//Java for Dummies. Using charAt to obtain the character at a specific location in a String
            convert = "" + let;
            chosen = hasBeenChosen(convert);
            
            if(!chosen)
            {
                letterChosen(convert);
            }
            else
            {   
                System.out.println("You've already used that one. Please enter a different letter.");
                
            }
            //int numbers = 0;
            
            //if (let == numbers)
            //{
            	//System.out.println("This is not a letter. Try again.");
            //}
            //else
            //{
            	
            //}
                        
        }
        									// Repeat the process until all six chances have been exhausted.
        while(chosen);
        
        return let;  
    }
}
