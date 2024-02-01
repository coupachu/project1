import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static String index = "";
    public static String selection = "";
    public static void main(String[] args) {
        ArrayList<String> taskList = new ArrayList<>();

        String userInput = "";
        String selection = "";
        while (!userInput.equals("0")){
            printOptions();
            userInput = input.nextLine();
            if (userInput.equals("0")){
                break;
            } else if (userInput.equals("1")) {
                addTask(taskList);
            } else if (userInput.equals("2")) {
                removeTask(taskList);
            } else if (userInput.equals("3")) {
                updateTask(taskList);
            } else if (userInput.equals("4")) {
                System.out.println(taskList);
            } else {
                System.out.println("please try again.");
            }
        }
    }
    static void printOptions(){
        System.out.println("(1) add task\n(2) remove task\n(3) update task\n(4) list all tasks\n(0) Exit");
    }
    static void addTask(ArrayList a){
        System.out.println("type a task to add");
        selection = input.nextLine();
        a.add(selection);
    }
    static void removeTask(ArrayList a){
        System.out.println("type an index to remove");
        selection = input.nextLine();
        a.remove(Integer.parseInt(selection));
    }
    static void updateTask(ArrayList a){

        System.out.println("type an index to update");
        index = input.nextLine();
        System.out.println("type the new value");
        selection = input.nextLine();
        a.set(Integer.parseInt(index),selection);
    }
}