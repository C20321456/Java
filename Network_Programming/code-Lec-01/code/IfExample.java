import java.util.Scanner; // program uses class Scanner
public class IfExample{
 // main method begins execution of Java application
 public static void main( String[] args ){
// create a Scanner to obtain input from the command window
Scanner input = new Scanner( System.in );
int grade; // first number to add
System.out.print( "Enter the student grade: " ); // prompt
grade = input.nextInt(); // read first number from user

if ( grade >= 60 )
System.out.println( "Passed" );

}
}
