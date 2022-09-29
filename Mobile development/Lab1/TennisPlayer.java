package Lab1;
import java.util.Scanner;
public class TennisPlayer extends SportsPlayer{
    private String height;
    private String born;
    private String playerCoach;
    private String lowestATP;
    private String prizeMoney;
    private String plays;
    Scanner sc = new Scanner(System.in);

    public TennisPlayer()
    {
        super();
       
        setHeight();
        setBorn();
        setPlayerCoach();
        setLowestATP();
        setPrizeMoney();
        setPlays();
    }
   
    public String getHeight()
    {
        return height;
    }
   
    public String setHeight()
    {
        System.out.println("Enter Height: ");
        String passedHeight = sc.nextLine();
        //sc.close();
        this.height = passedHeight;
        return passedHeight;
    }
   
    public String getBorn()
    {
        return born;
    }
   
    public String setBorn()
    {
        
        System.out.println("Enter City and country born in: ");
        String passedBorn = sc.nextLine();
        //sc.close();
        this.born = passedBorn;
        return passedBorn;
    }
   
    public String getPlayerCoach()
    {
        return playerCoach;
    }
   
    public String setPlayerCoach()
    {
        
        System.out.println("Enter Coach name: ");
        String passedCoach = sc.nextLine(); 
        //scanner.close();
        this.playerCoach = passedCoach;
        return passedCoach;
    }
   
    public String getLowestATP()
    {
        return lowestATP;
    }
   
    public String setLowestATP()
    {
        System.out.println("Enter lowest ATP: ");
        String passedATP = sc.nextLine();
        //scanner.close();
        this.lowestATP = passedATP;
        return passedATP;
    }
   
    public String getPrizeMoney()
    {
        return prizeMoney;
    }
   
    public String setPrizeMoney()
    {
        
        System.out.println("Enter Prize money amount: ");
        String passedPrizeMoney = sc.nextLine();
        //scanner.close();
        this.prizeMoney = passedPrizeMoney;
        return passedPrizeMoney;
    }
   
    public String getPlays()
    {
        return plays;
    }
   
    public String setPlays()
    {
        // 
        System.out.println("Enter hand played with: ");
        String passedPlays = sc.nextLine();
        //scanner.close();
        this.prizeMoney = passedPlays;
        return passedPlays;
    }
}
