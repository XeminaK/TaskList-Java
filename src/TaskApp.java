import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskApp {

	public static void main(String[] args) {
		
		boolean quit = false; //prime the loop
		
		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("Kathy", "Do the laundry", "4/10/15"));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Task Manager!");
		System.out.println("");
		
		while (!quit) {
			System.out.println("1. List tasks");
			System.out.println("2. Add task");
			System.out.println("3. Delete task");
			System.out.println("4. Mark task Complete");
			System.out.println("5. Quit");
			System.out.println("");
			System.out.println("What would you like to do? (Choose a number)");
			
			int answer = sc.nextInt(); //Input needed from user
			
			if(answer==1) { //list tasks
				
				sc.nextLine(); //garbage line
				int counter = 1;
				for(Task t: taskList) {
					System.out.println(counter++ + "." + t);
				}
				
				//Return to main menu prompt
				System.out.println("");
				System.out.println("Return to the main menu? (Y/N)");
				String ans = sc.nextLine();
				
				if(ans.equalsIgnoreCase("Y")) {
					continue;
				} else {
					quit = true;
				}
				
			} else if (answer == 2) { //add task
				
				sc.nextLine(); //garbage line
				System.out.println("ADD TASK");
				System.out.println("");
				
				System.out.println("Team Member Name:");
				String name = sc.nextLine(); //name input
				
				System.out.println("Task Description:");
				String desc = sc.nextLine(); //desc input
				
				System.out.println("Due Date:");
				String date = sc.nextLine(); //date input
				
				taskList.add(new Task(name, desc, LocalDate.parse(date));
				
				//Return to main menu prompt
				System.out.println("");
				System.out.println("Return to the main menu? (Y/N)");
				String ans = sc.nextLine();
				
				if(ans.equalsIgnoreCase("Y")) {
					continue;
				} else {
					quit = true;
				}
			} else if (answer == 3) { //delete task
				System.out.println("DELETE TASK");
				//print out your current Array
				int counter = 1;
				for(Task t: taskList) {
					System.out.println(counter++ + "." + t);
				}
				System.out.println("Which task would you like to delete? (Choose a number)");
				int indexNumber = sc.nextInt(); //input for delete option
				
				//show the user which option they selected
				System.out.println("You have chosen the following task:");
				System.out.println("");
				System.out.println(taskList.get(indexNumber-1)); //syso the number you selected
				System.out.println("");
				System.out.println("Are you sure you want to delete this task? (Y/N)");
				sc.nextLine(); //garbage line
				String ans2 = sc.nextLine();
				
				if (ans2.equalsIgnoreCase("Y")) {
					taskList.remove(indexNumber-1);
				} else {
					continue;
				} //end deletion option
				
				//Return to main menu prompt
				System.out.println("");
				System.out.println("Return to the main menu? (Y/N)");
				String ans = sc.nextLine();
				
				if(ans.equalsIgnoreCase("Y")) {
					continue;
				} else {
					quit = true;
				}
				
			} else if(answer == 4) { //change the task to complete status
				System.out.println("MARK TASK COMPLETE");
				System.out.println("");
				
				//print out your current Array
				int counter = 1;
				for(Task t: taskList) {
					System.out.println(counter++ + "." + t);
				}
				System.out.println("Which task would you like to change to complete?(Choose a number)");
				int indexNumber = sc.nextInt(); //input for change status option
				//show the user which option they selected
				System.out.println("You have chosen the following task:");
				System.out.println("");
				System.out.println(taskList.get(indexNumber-1)); //syso the number you selected
				System.out.println("");
				System.out.println("Are you sure you want to change the status of this task? (Y/N)");
				sc.nextLine(); //garbage line
				String ans2 = sc.nextLine();
				
				if (ans2.equalsIgnoreCase("Y")) {
					taskList.get(indexNumber-1).setCompleted(true);
				} else {
					continue;
				}
				
				//Return to main menu prompt
				System.out.println("");
				System.out.println("Return to the main menu? (Y/N)");
				String ans = sc.nextLine();
				
				if(ans.equalsIgnoreCase("Y")) {
					continue;
				} else {
					quit = true;
				}
				
			} else if(answer == 5) {
				quit = true;
				
			} else {
				System.out.println("Please choose again");
			}
			
		
		}//end while loop
		
		System.out.println("Have a good day!");
		sc.close();

	}

}
