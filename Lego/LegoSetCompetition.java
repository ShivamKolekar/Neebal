import java.util.Scanner;

public class LegoSetCompetition {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Lego Set Competition!");

        // Collect names and pieces for three lego sets
        System.out.println("Enter the name of Lego Set 1:");
        String setName1 = scanner.nextLine();

        System.out.println("Enter the number of pieces in Lego Set 1:");
        int setPieces1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the name of Lego Set 2:");
        String setName2 = scanner.nextLine();

        System.out.println("Enter the number of pieces in Lego Set 2:");
        int setPieces2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the name of Lego Set 3:");
        String setName3 = scanner.nextLine();

        System.out.println("Enter the number of pieces in Lego Set 3:");
        int setPieces3 = Integer.parseInt(scanner.nextLine());

        int day = 1;
        boolean tieBreaker = false;
        boolean set1completeby1=false;
        boolean set1completeby2=false;
        boolean set2completeby1=false;
        boolean set2completeby2=false;
        boolean set3completeby1=false;
        boolean set3completeby2=false;
        
        
        int tieBreakerRounds = 0;

        CompetitionLog player1Log = new CompetitionLog(1, "", setName1 + "," + setName2 + "," + setName3, 0);
        CompetitionLog player2Log = new CompetitionLog(2, "", setName1 + "," + setName2 + "," + setName3, 0);

        int beforetiepieces1= 0;
        int beforetiepieces2= 0;
        
        while (player1Log.getPiecesBuilt() <= (setPieces1+setPieces2+setPieces3) || player2Log.getPiecesBuilt() <= (setPieces1+setPieces2+setPieces3) )
        {
        	//System.out.println(player1Log.toString());
            //System.out.println(player2Log.toString());
        	a:if(tieBreaker)
        	{
        		System.out.println("Enter the name of Lego Set 1:");
                setName1 = scanner.nextLine();

                System.out.println("Enter the number of pieces in Lego Set 1:");
                setPieces1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the name of Lego Set 2:");
                setName2 = scanner.nextLine();

                System.out.println("Enter the number of pieces in Lego Set 2:");
                setPieces2 = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the name of Lego Set 3:");
                setName3 = scanner.nextLine();

                System.out.println("Enter the number of pieces in Lego Set 3:");
                setPieces3 = Integer.parseInt(scanner.nextLine());
                tieBreaker=false;
        	}
            int piecesBuilt1 = getPlayerInput(scanner, 1, day);
            int piecesBuilt2 = getPlayerInput(scanner, 2, day);

            player1Log.setPiecesBuilt(player1Log.getPiecesBuilt() + piecesBuilt1);
            player2Log.setPiecesBuilt(player2Log.getPiecesBuilt() + piecesBuilt2);

            if(set1completeby1==false)
            {
            if (player1Log.getPiecesBuilt() >= setPieces1) {
                player1Log.setCompleteSets(player1Log.getCompleteSets() + setName1+","); ;
                player1Log.setIncompleteSets(player1Log.getIncompleteSets().replace(setName1+",",""));
                set1completeby1=true;
            }
            }
            
            
            
            if(set1completeby2==false)
            {
            if (player2Log.getPiecesBuilt() >= setPieces1) {
                player2Log.setCompleteSets(player2Log.getCompleteSets() +setName1+","); ;
                player2Log.setIncompleteSets(player2Log.getIncompleteSets().replace(setName1+",",""));
                set1completeby2=true;
            }
            }
            
            //System.out.println(player1Log.toString());
            //System.out.println(player2Log.toString());

            if(set2completeby1==false)
            {
            if (player1Log.getPiecesBuilt() >= (setPieces1 + setPieces2)) {
                player1Log.setCompleteSets(player1Log.getCompleteSets() +setName2+",");
                player1Log.setIncompleteSets(player1Log.getIncompleteSets().replace(setName2+",",""));
                set2completeby1=true;
            }
            }

            if(set2completeby2==false)
            {
            if (player2Log.getPiecesBuilt() >= (setPieces1 +setPieces2)) 
            {
                player2Log.setCompleteSets(player2Log.getCompleteSets() +setName2+",");
                player2Log.setIncompleteSets(player2Log.getIncompleteSets().replace(setName2+",", ""));
                set2completeby2=true;
            }
            }
            
            if(set3completeby1==false)
            {	
            if(player1Log.getPiecesBuilt() >= (setPieces1 +setPieces2 +setPieces3))
            {
                player1Log.setCompleteSets(player1Log.getCompleteSets() +setName3);
                player1Log.setIncompleteSets(player1Log.getIncompleteSets().replace(setName3,""));
                set3completeby1=true;
            }
            }

            
            if(set3completeby2==false)
            {	
            if(player2Log.getPiecesBuilt() >= (setPieces1 +setPieces2 +setPieces3)) 
            {
                player2Log.setCompleteSets(player2Log.getCompleteSets() +setName3);
                player2Log.setIncompleteSets(player2Log.getIncompleteSets().replace(setName3,""));
                set3completeby2=true;
            }
    
            /*String Completeset1=player1Log.getCompleteSets();
            System.out.println(Completeset1);
            if((Completeset1.charAt(Completeset1.length()-1))==',')
			{
            	Completeset1=removeLastChar(Completeset1);     
            	player1Log.setCompleteSets(Completeset1);
            
            }
            
            String Completeset2=player1Log.getCompleteSets();
            if((Completeset2.charAt(Completeset2.length()-1))==',')
			{
            	Completeset2=removeLastChar(Completeset2);     
            	player2Log.setCompleteSets(Completeset2);
            
            }*/
            
                if (player1Log.getPiecesBuilt() >= (setPieces1+setPieces2+setPieces3) && player2Log.getPiecesBuilt() >= (setPieces1+setPieces2+setPieces3) ) 
                {
                	//System.out.println("test");
                	//System.out.println(player1Log.getPiecesBuilt()+" "+player2Log.getPiecesBuilt());
                    System.out.println("The competition ended in a tie! There will be a tiebreaker round.");
                    tieBreaker = true;
                    //day = 1;

                    // Reset lego sets for tiebreaker round
                    player1Log.setCompleteSets("");
                    player2Log.setCompleteSets("");
                    player1Log.setIncompleteSets(setName1 + "," + setName2 + "," + setName3);
                    player2Log.setIncompleteSets(setName1 + "," + setName2 + "," + setName3);
                    beforetiepieces1= beforetiepieces1 + player1Log.getPiecesBuilt();
                    beforetiepieces2= beforetiepieces2 + player2Log.getPiecesBuilt();
                    player1Log.setPiecesBuilt(0);
                    player2Log.setPiecesBuilt(0);
                    set1completeby1=false;
                    set1completeby2=false;
                    set2completeby1=false;
                    set2completeby2=false;
                    set3completeby1=false;
                    set3completeby2=false;
                    tieBreakerRounds++;
                    a: continue ;
 
                }
 
            	
                else if (player1Log.getPiecesBuilt() >= setPieces1+setPieces2+setPieces3) 
                {
                	player1Log.setPiecesBuilt(player1Log.getPiecesBuilt() +beforetiepieces1);
                	player1Log.setIncompleteSets("None");
                	//player2Log.setCompleteSets(setName3);
                    System.out.println("Player 1 is the winner!");
                    System.out.println("\nCongratulations to Player 1 for winning the Lego Set Competition!");
                    System.out.println("Additional information about the competition results is below");
                    System.out.println(player1Log.toString());
                    System.out.println(player2Log.toString());
                    break;
                } 
                
                else if (player2Log.getPiecesBuilt() >= setPieces1+setPieces2+setPieces3) 
                {
                	player2Log.setPiecesBuilt(player2Log.getPiecesBuilt() + beforetiepieces2);
                	player2Log.setIncompleteSets("None");
                	System.out.println("Player 2 is the winner!");
                    System.out.println("\nCongratulations to Player 2 for winning the Lego Set Competition!");
                    System.out.println("Additional information about the competition results is below");
                    System.out.println(player1Log.toString());
                    System.out.println(player2Log.toString());
                    break;
                }

               
                /*if (piecesBuilt1 >= setPieces1+setPieces2+setPieces3 && piecesBuilt2 >= setPieces1+setPieces2+setPieces3) 
                {
                    System.out.println("The competition ended in a tie! There will be a tiebreaker round.");
                    
                }*/
            
                day++;

        }

        //Print competition results
        /*System.out.println("\nCongratulations to Player " + (player1Log.getCompleteSets().equals("1,2,3") ? "1" : "2") + " for winning the Lego Set Competition!");
        System.out.println("Additional information about the competition results is below");

        System.out.println("\nPlayer 1 completed the following sets: " + player1Log.getCompleteSets());
        System.out.println("Player 1 did not complete the following sets: " + (player1Log.getIncompleteSets().isEmpty() ? "None" : player1Log.getIncompleteSets()));
        System.out.println("Player 1 built a total of " + player1Log.getPiecesBuilt() + " pieces");

        System.out.println("\nPlayer 2 completed the following sets: " + player2Log.getCompleteSets());
        System.out.println("Player 2 did not complete the following sets: " + (player2Log.getIncompleteSets().isEmpty() ? "None" : player2Log.getIncompleteSets()));
        System.out.println("Player 2 built a total of " + player2Log.getPiecesBuilt() + " pieces");*/

    }
     
        System.out.println("\nThe competition lasted " + (day + tieBreakerRounds) + " days");

    }
    
    public static String removeLastChar(String s) 
    {
        return (s == null || s.length() == 0)
          ? null 
          : (s.substring(0, s.length() - 1));
    }

  
    public static int getPlayerInput(Scanner scanner, int playerNumber, int day) {
        System.out.println("Enter the number of pieces Player " + playerNumber + " used for building on day " + day + ":");
        return Integer.parseInt(scanner.nextLine());
    }
}