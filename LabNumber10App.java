import java.util.ArrayList;
import java.util.Scanner;

//The Application stores a list of 10 movies and displays them by category
//the user can enter any of the following categories to display the films in the list that match the category: animated, drama, horror, Scifi
//After the list is displayed, the user is asked if he or she wants to continue. If no, the program ends.

public class LabNumber10App {

	private static ArrayList<Movie> myMovies = new ArrayList<>(10);

    static {
        myMovies.add(new Movie("Something about Mary", "drama"));
        myMovies.add(new Movie("Top Gun", "Animated"));
        myMovies.add(new Movie("The Godfather", "Drama"));
        myMovies.add(new Movie("A Few Good Men", "Scifi"));
        myMovies.add(new Movie("Iron Man", "Horror"));
        myMovies.add(new Movie("The Shack", "Adventure"));
        myMovies.add(new Movie("Spaceballs", "Animated"));
        myMovies.add(new Movie("Smokey and the Bandit", "Animated"));
        myMovies.add(new Movie("The Incredibles", "Animated"));
        myMovies.add(new Movie("Halloween", "Horror"));
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("We have 10 movies, please select: Animated, Drama, Horror and Scifi");{

            String title = null;
            String category = null;

            String yourChoice = "yes";

            while (yourChoice.equalsIgnoreCase("yes")) {

                System.out.println("What genre are you interested in?");
                category = scnr.nextLine().toLowerCase();

                printMatchingMovies(category);

                System.out.println("\nWould you like to continue? (yes or no)");
                yourChoice = scnr.nextLine();
            }

            System.out.println("Goodbye!");
            scnr.close();
        }
    }

    private static void printMatchingMovies(String category){
        for(Movie movie : myMovies){
            if(movie.getCategory().toLowerCase().matches(category)){
                System.out.println(movie.getTitle());
            }
        }
    }

}