package theHangmanGame;

public class GameWords 
{
	String hint; 									//Variables
	String visible;
	String thewords;

	public GameWords()								//Two arrays holding both the game words and their hints.
	{
	    String [] wordList = {"western meadowlark", "ponderosa", "crabtown", "sapphire", "big sky country"};
	    String [] hintList = {"Montana State Bird", "Montana State Tree", "The Original Name of Helena", "Gemstone Mined in Montana", "Montana State Slogan"};
	    
	    int rand;
	    rand = (int) (Math.random()*6);				//Using Math.random to make sure not to exceed 6 chances.
	    
	    thewords = wordList[rand];					//Renaming the arrays.
	    hint = hintList[rand];
	    
	    int wordLength = thewords.length();			//Keeping track of the word length
	    
	    visible = "";
	   
	    for ( int count = 0; count < thewords.length(); count++)	//For loop to keep track of the word length count.
	    {
	        char ch = thewords.charAt(count);		//From Java for Dummies book, converting the string "thewords" into a char. 
	        
	        if ( ch == ' ' )
	            visible += ch;
	        else
	            visible += '*';
	    }
	}

	public String getHint()							//Returns hint	
	{
	    return hint;
	}

	public String toString()						//Returns visible
	{
	    // String s = "";
	    // for(int i = 0; i < wordLength; i++)
	    //    s = s + "_ ";
	    // return s;
	    
	    return visible;
	}

	    // provided by Group 4 and 8
	    public boolean update(char ch)				//char arrays that update the word length and makes them visible to the user.
	    {
	        char[] secretArray = new char [thewords.length()];
	        char[] visibleArray = new char [thewords.length()];
	        
	        String str = "";
	        boolean contains = false ;
	        
	        
	        for(int c = 0; c < thewords.length(); c++)		//For loop used to update the count of the thewords length.
	        {
	            secretArray[c] = thewords.charAt(c);		
	            visibleArray[c] = visible.charAt(c);
	        }
	        
	        												//For loop is used in updating the empty visible array.		 
	        for(int i = 0; i < thewords.length();i++)
	        {
	            
	            if(secretArray[i] == ch)					//An if statement to check the array with the char.
	            {
	                visibleArray[i] = ch;
	                contains = true;
	            }
	        }
	        												//Changing the visible array into the visible string.
	        for(int m=0; m < thewords.length(); m++ )
	        {
	            str = str + visibleArray[m];
	        }
	        visible = str;
	        
	        return contains;
	   }
	    													//This is a method to check if the secret word is solved.
	    public boolean isSolved()
	    {   
	        return thewords.equalsIgnoreCase(visible);
	    }
}
