


import java.lang.runtime.ObjectMethods;
import java.util.Scanner;


public class MovieDriver {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		 
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
		function movie () {
		
		Movie objem = new Movie();
		
		
		
		 
		objem.getTitle();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a Title of a Movie");
		
		String response;
		response = scan.nextLine();
		objem.setTitle(response); 
		
		
		
		System.out.println("Enter the Movie's Rating: ");
		String rating;
		rating = scan.nextLine();
		objem.setRating(rating);
		System.out.println("enter the number of tickets sold for this movie ");
		int tickets;
		tickets = scan.nextInt();
		objem.setSoldTickets(tickets);
		System.out.println(objem.toString()); 
		
		
		
		System.out.println("Do you want to enter another? (y or n)");
		
		String reply ;
		reply = scan.nextLine();
		if(reply == "y") {movie();}else {System.out.println(" ");}
	}

}
