// Importing our utilities
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Starting our menu class
public class Main {
    
    // Create the hashmap to set up all the possible rows
    Map<Integer, MenuRow> menu = new HashMap<>();

    // Create a new public class called menu to set up the number of rows
    public Main(MenuRow[] rows) {
        int i = 0;
        for (MenuRow row : rows) {
            // Build HashMap for lookup convenience
            menu.put(i++, new MenuRow(row.getTitle(), row.getAction()));
        }
    }

    // Get a value from our function up above to check what menu item it        is
    public MenuRow get(int i) {
        return menu.get(i);
    }

    // Iterate through the hashmap and print the items in the menu
    public void print() {
        for (Map.Entry<Integer, MenuRow> pair : menu.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue().getTitle());
        }
    }

    // Starts the new driver class
    public static void main(String[] args) {
        Driver.main(args);
    }

}

// Now we start what goes in the menu function
class MenuRow {
    String title;       
    Runnable action;

    // Setting up a constructor for the rows and looking for the menu
    public MenuRow(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    // Start to set up our getters for the title and the actions using          what we defined up above
    public String getTitle() {
        return this.title;
    }
    public Runnable getAction() {
        return this.action;
    }

    // Start to use the runnable
    public void run() {
        action.run();
    }
}

// Now we start the real initalization and start the class running
class Driver {

  // Getting all the rows ready and displaying the thing that will shown      up on the console
    public static void main(String[] args) {
        
        // Now we initialize the rows
        MenuRow[] rows = new MenuRow[]{
                new MenuRow("Leave the Program!🚪", () -> main(null)),
                new MenuRow("Swapper Lab!🔀", () -> IntByReference.main(null)),  
                new MenuRow("Want Matrices?🤓", () -> Matrix.main(null)),
                new MenuRow("Waiting in the Queue.🙄", () -> QueueTester.main(null)),
                new MenuRow("Calculating. Now.🤖", () -> Calculator.main(null)),
                new MenuRow("Sorting!!!➡️", () -> Sorts.main(null)),
           new MenuRow("Grace QuaterBack: Slection Sort✌️", () -> SelectionSort.main(null)),
          new MenuRow("Grace Wide Reciever: Merge Sort( ◑‿◑)ɔ┏🍟--🍔┑٩(^◡^ )", () -> MergeSort.main(null)),
          new MenuRow("Grace Tight End: Insertion Sort💯", () -> InsertionSort.main(null)), 
          new MenuRow("Grace CornerBack: Insertion Sort🤡", () -> BubbleSort.main(null)), 
        };

        // Starting to build the menu
        Main menu = new Main(rows);

        // Run menu forever, exit condition contained in loop
        while (true) {
            System.out.println("      Grace's Data Structures Labs     ");
            
            // This command allows us to actually display those rows                    that we created up above
            menu.print();

            // Scan for input
            try {
                Scanner sc = new Scanner(System.in);
                int selection = sc.nextInt();

                // menu action
                try {
                    MenuRow row = menu.get(selection);
                    // stop menu condition
                    if (row.getTitle().equals("Exit"))
                        return;
                    // run option
                    row.run();
                } catch (Exception e) {
                    System.out.printf("Invalid selection %d\n", selection);
                }
            } catch (Exception e) {
                System.out.println("Not a number");
            }
        }
    }
}