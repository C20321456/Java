package Lab1;
import Lab1.TennisPlayer;
import java.util.*;
public class SportsPlayer{
    private String dob;
    private String category;
    private String country;
    private Scanner sc = new Scanner(System.in);

    public SportsPlayer(String dob, String category, String country){
        this.dob = dob;
        this.category = category;
        this.country = country;
    }

    public SportsPlayer(){
        setDob();
        setCategory();
        setCountry();
    }

    public void setDob(){
        System.out.println("Enter date of birth: ");
        this.dob = sc.nextLine();
    }

    public String getDob(){
        return dob;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(){

        System.out.println("Male or Female?: ");
        this.category = sc.nextLine();;

    }

    public String getCountry(){
        return country;
    }

    public void setCountry(){

        System.out.println("Country: ");
        this.country = sc.nextLine();

    }

    public String showNationality()
	    {
	    	return getCountry();
	    }
	   
	    public String showAge()
	    {
	    	return getDob();
	    }

    public static void main(String[] args){
        System.out.println("Making new Sports Player");
        SportsPlayer sp1 = new SportsPlayer();
        System.out.println("Date of birth: " + sp1.getDob());
        System.out.println("Gender: " + sp1.getCategory());
        System.out.println("Country: " + sp1.getCountry() + "\n\n");

        System.out.println("Making new Tennis Player");
        TennisPlayer tplayer1 = new TennisPlayer();
        System.out.println("Height: " + tplayer1.getHeight()+
        "\nBorn: "+tplayer1.getBorn()+
        "\nDOB: "+tplayer1.getDob()+
        "\nCoach: "+tplayer1.getPlayerCoach()+
        "\nPrize Money: "+tplayer1.getPrizeMoney());
      
        System.out.println("Playing for: " + tplayer1.showNationality());
        System.out.println("Age: " + tplayer1.showAge());
    }
}