package com.info.NumberGuessingGame;

import java.util.*;



public class NumberGuessingGame {


		public static void main(String args[])

		{
			int lowvalue=1;
			int highvalue=100;
			
			int maxattempt=3;
			int roundsWon=0;
			int totalAttempts=0;
			Scanner sc=new Scanner(System.in);

			Random random=new Random();
			
			

			boolean playGame=true;
			System.out.println("Welcome to the Number Guessing Game!");
			while(playGame)
			{
				int number=random.nextInt(highvalue-lowvalue+1)+lowvalue;
				int minattempt=0;
				
				System.out.println("I'm thinking of a number between " + lowvalue + " and " + highvalue + ".");
				while(minattempt < maxattempt)
				{
					System.out.print("Enter the Gaues number :");
					int gauesNumber=sc.nextInt();
					
					minattempt++;
					
					totalAttempts++; //total  number of attempt will be count
					if(gauesNumber==number)
					{
						
						System.out.println("Congratulations you gaues number in  "+ minattempt +"attempts");
						roundsWon++;
						break;
						
						
					}
					else if(gauesNumber < number)
					{
						
						
						System.out.println("Number is low! Please try again");
					}
					else
					{
						System.out.println("Number is high! Please try again");
					}

					
		
				
					if(minattempt>=maxattempt)
					{
						System.out.print("");
						System.out.println("Sorry you have attempt, You've reached the maximum number of attempts. The correct number was " + number + ".");
					}
				}
				 System.out.print("Do you want to play again? (yes/no): ");
		           
				 String playAgainResponse = sc.next().toLowerCase();
		            if (playAgainResponse.equals("yes")) {
		                playGame = true;
		            }
		            else if(playAgainResponse.equals("no")){
		            	 System.out.println("Thanks for playing!");
		                 System.out.println("Rounds played: " + (totalAttempts / maxattempt));
		                 System.out.println("Rounds won: " + roundsWon);
		            	 
		            }
		            else {
		            	System.out.print("You have enter wrong input");
		            	playGame = false;
		            }
			}
			
			sc.close();
		}


	}

