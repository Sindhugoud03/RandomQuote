import java.util.*;
public class RandomQuote {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] quotes = {
            "The only limit to our realization of tomorrow is our doubts of today.",
            "The future belongs to those who believe in the beauty of their dreams.",
            "Do not watch the clock. Do what it does. Keep going.",
            "The harder you work for something, the greater you’ll feel when you achieve it.",
            "Don’t stop when you’re tired. Stop when you’re done."
        };
        System.out.print("Do you want to generate quote: ");
        String str = sc.nextLine().toLowerCase();
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        
        System.out.println("Random Quote: " + quotes[index]);

        
        
    }
}    

