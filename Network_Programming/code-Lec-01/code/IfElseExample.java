import java.util.Scanner; // program uses class Scanner 
public class IfElseExample{
 	 public static void main( String[] args ){
			Scanner input = new Scanner( System.in );
			int grade; // first number to add
			System.out.print( "Enter the student grade: " ); // prompt
			grade = input.nextInt(); // read first number from user
			
		    if ( grade >= 60 )
				System.out.println( "Passed" );
			else
				System.out.println( "Failed" );
		}	
	}