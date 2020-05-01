package Examples;

public class Exampke2 {

	public Exampke2() {
		// TODO Auto-generated constructor stub
	}

}


public class tp {

	public tp() {
		// TODO Auto-generated constructor stub
	}

}

 abstract class Player {
    String firstName,lastName;

	public Player(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getName() {
		return firstName+" "+lastName;
	} 
	abstract int getRating();
}

 class CricketPlayer extends Player{
	double averageRuns;
	public CricketPlayer(String firstName, String lastName, double averageRuns) {
		super(firstName, lastName);
		this.averageRuns=averageRuns;
		// TODO Auto-generated constructor stub
	}
	@Override
	int getRating() {
	    if (averageRuns > 55) {return 7;}
	    else	if (averageRuns > 50) { return 6;}
	    else	if (averageRuns > 40) { return 5;}
	    else	if (averageRuns > 30) { return 3;}
	    else	if (averageRuns > 20) { return 2;}
	    else	{return 1;}
	   
	}	
}
 
 class FootballPlayer extends Player{
	 int goals;

	public FootballPlayer(String firstName, String lastName, int goals) {
		super(firstName, lastName);
		this.goals = goals;
	}

	@Override
	int getRating() {
		 if (goals > 20) {return 5;}
		    else	if (goals > 15) { return 4;}
		    else	if (goals> 10) { return 3;}
		    else	if (goals > 5) { return 2;}
		    
		    else	{return 1;}
	}
	
	 
 }
