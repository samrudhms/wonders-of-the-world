
import java.util.Arrays;
import java.util.Scanner;

public class FindNameLambda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of names
        String[] names = {"Sam", "Riya", "Arjun", "Meera", "Rahul", "Priya"};

        
        System.out.println(" List of Names: " + Arrays.toString(names));

       
        System.out.print("Enter a name to search: ");
        String searchName = sc.nextLine();
        boolean found = Arrays.stream(names)
                .anyMatch(name -> name.equalsIgnoreCase(searchName));

        
        if (found) {
            System.out.println(" Name '" + searchName + "' found in the list!");
        } else {
            System.out.println(" Name '" + searchName + "' not found.");
        }

        sc.close();
    }
}
