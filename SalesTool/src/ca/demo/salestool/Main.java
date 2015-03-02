package ca.demo.salestool;

public class Main {
	public static void main(String[] args) {
		SalesData data = new SalesData();

		displayGreeting();
		data.display();
		
		System.out.println("Wieder was neues");
	}

	private static void displayGreeting() {
		System.out.println("HELLO HAPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA.");
		System.out.println("--------------------------");
	}
}
