import java.util.Random;
// Jorell Socorro, Programmer
public class RPGSimulator {
		
	public static void main(String args[]) throws InterruptedException
	{
		Random rand1 = new Random();
		Random rand2 = new Random();
		//**********************Randomizer object for the cloaking****************************
		Random rand3 = new Random();
								
		String mission1 = "Capture the Castle";
		String mission2 = "Enter the Hidden City";
		String mission3 = "Rescue the Princess";
		String mission4 = "Traverse the Forest";
		String mission5 = "Locate the Tunnel Entrance";
		//*******************The initialization of the two other missions***************************
		String mission6 = "Defeat the Demon Lord";
		String mission7 = "Exterminate Goblins";
		
		String player1 = "Jorell", player2 = "Dark-Jorell";
							
		char letter = '\0', role = '\0';
		//******************adding variables for players uses cloak********************8
		int cloak1 = 0;
		int cloak2 = 0;
		
		// initial health and treasures for the two players
		int number = 0, mission = 0, health1 = 100, health2 = 100;
		int treasure1 = 100, treasure2 = 100, encounter = 0;


		// define your role
		role = (char)(rand1.nextInt(26) + 'a');
		//System.out.println("Role Var:"+role);
		if(role >= 'a' && role <= 'm') 
		{
			player1 = "Jorell\t";
			player2 = "Dark-Jorell";
		}
		else 
		{
			player1 = "Jorell\t";
			player2 = "Dark-Jorell";
		}
		System.out.println("you are the " + player1);
		// define your mission
		number = rand2.nextInt(7) + 1;
		//number = 4;
		//System.out.println("Number Var:"+number);
		System.out.print("your mission is: ");
		switch(number)
		{
		  case 1: System.out.println(mission1); mission = 1; break;
		  case 2: System.out.println(mission2); mission = 2; break;
		  case 3: System.out.println(mission3); mission = 3; break;
		  case 4: System.out.println(mission4); mission = 4; break;
		  case 5: System.out.println(mission5); mission = 5; break;
		  //******************Added two missions here************************
		  case 6: System.out.println(mission6); mission = 6; break;
		  case 7: System.out.println(mission7); mission = 7; break;
		}
		System.out.println("");
		
		
		//*********************If its mission 1 increase the health too 100***********************
		if(mission == 1) {
			//Randomizer if the player or the opponent will use the cloak
			cloak1 = (rand3.nextInt(2)+1);
			cloak2 = (rand3.nextInt(2)+1);
			if(cloak1 == 1) {
				//player gets to use the cloak
				health1 += 100;
				System.out.println("The player used the cloak\n");

			}
			if(cloak2 == 1) {
				//opponent gets to use the cloak
				health2 += 100;
				System.out.println("The opponent used the cloak\n");

			}
		}
		
		// let the game simulation commence (limit the # of encounters)
		for (encounter = 1; encounter <= 20; encounter++)
		{
			//***************Changed the randomizer to add e and f*********************
			letter = (char)(rand1.nextInt(8) + 'a'); //its the same as adding 1 to not include 0
			number = rand2.nextInt(10) + 1;
			System.out.println("mission" + mission);
			// randomly encounter the enemy
			
			 
			
			 if(letter == 'a' || letter == 'b')
			//if(mission == 1 || mission == 2 || mission == 3)
			{
			  health1 -= 10;
			  health2 += 15;
			  treasure1 += 10;
			  treasure2 -= 10;
			  //Thread.sleep(5000);
			  //System.out.println("The Letter:"+letter);
			  System.out.print("battle: " + encounter);
			  System.out.println("\t" + "health" + "\t" + "treasure");
			  System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
			  System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
			  System.out.println("");
			  //encounter++;
			
			}	
				
		else if(letter == 'c' || letter == 'd')
		{
		  health1 += 20;
		  health2 -= 30;
		  treasure1 += 40;
		  treasure2 -= 20;
		  //Thread.sleep(500);
		  //System.out.println("The Letter:"+letter);
		  System.out.print("battle: " + encounter);
		  System.out.println("\t" + "health" + "\t" + "treasure");
		  System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
		  System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
		  System.out.println("");
		  //break;
		}
			 
		//********************Added a unique interaction between the players****************************
		else if(letter == 'e' || letter == 'f') {
			//System.out.println("The Letter:"+letter);
			System.out.print("battle: " + encounter);
			System.out.println("\t" + "health" + "\t" + "treasure");
			System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
			System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
			System.out.println("Both " + player1 + " and "+player2 + " encounter each other, they said hi "
					+ "and contiuned their own buisness with each other, \nnothing much happens....except "
					+ "losing -5 health and treasure as a default\n");
		}
			 
		//*******************Occurs only in the forest map, the player will dodge the opponent****************
		else if((letter == 'g' || letter == 'h') && mission == 4  ){
			//System.out.println("The Letter:"+letter);
			System.out.print("battle: " + encounter);
			System.out.println("\t" + "health" + "\t" + "treasure");
			System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
			System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
			System.out.println(player1+" dodges the "+player2+" both, lose 5 health and treasure\n");
		}	 
		else
		{
		  health1 += 30;
		  health2 -= 20;
		  treasure1 -= 30;
		  treasure2 += 20;
		  //Thread.sleep(500);
		  //System.out.println("The Letter:"+letter);
		  System.out.print("battle: " + encounter);
		  System.out.println("\t" + "health" + "\t" + "treasure");
		  System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
		  System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
		  System.out.println("");

		  //break;
		 }
		//Over time both lose health over time with a rate of 5
		 health1 -= 5;
		 health2 -= 5;
		 treasure1 -= 5;
		 treasure2 -= 5;
		 
		 //*******************When the encounter reaches 5 ONLY add health and treasure ONCE*********************
		 if (encounter == 5) {
			 health1 += 10;
			 health2 += 10;
			 treasure1 += 20;
			 treasure2 += 20;
			 System.out.println("Bonus TIME!!!");
			 System.out.println("\t"+"\t" + "health" + "\t" + "treasure");
			 System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
			 System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
			 System.out.println("");
			 
		 }
		 
		 if (health1 <= 0 || health2 <= 0 || treasure1 <= 0 || treasure2 <= 0)
		 {
		  //System.out.print("encounter: " + encounter + " action status: ");
		  break;
		 }
		}
		System.out.println("simulation has ended\n");
		System.out.println("results:\n");
		System.out.println("\t\t" + "health" + "\t" + "treasure");
		System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
		System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
		//See how many times the players encountered each other
		System.out.println("This is the encounter meter:"+encounter);
	}
}

