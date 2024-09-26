import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String choose;
		
		do {
			System.out.println("Enter the name of a movie");
			String title = keyboard.nextLine();
			
			System.out.println("Enter the rating of the movie");
			String rating = keyboard.nextLine();
			
			System.out.println("Enter the number of tickets sold for this movie");
			int soldTickets = keyboard.nextInt();
			
			Movie movie = new Movie(title, rating, soldTickets);
			
			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			keyboard.nextLine(); 
			choose = keyboard.nextLine();
			
			System.out.println("Goodbye");
		} while(choose.equals("y"));
	}

}
