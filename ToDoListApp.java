import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    // Create an ArrayList to store tasks
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    removeTask(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Function to add a task
    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task description: ");
        String task = scanner.next();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    // Function to display tasks
    private static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Function to remove a task
    private static void removeTask(Scanner scanner) {
        displayTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove.");
        } else {
            System.out.print("Enter the task number to remove: ");
            int taskNumber = scanner.nextInt();
            if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                String removedTask = tasks.remove(taskNumber - 1);
                System.out.println("Task '" + removedTask + "' removed successfully.");
            } else {
                System.out.println("Invalid task number. Please try again.");
            }
        }
    }
}

