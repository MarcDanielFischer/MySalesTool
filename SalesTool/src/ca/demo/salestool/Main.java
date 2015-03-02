package ca.demo.salestool;

public class Main {
	public static void main(String[] args) {
		System.out.println("new Change");
		SalesData data = new SalesData();

		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People!");
		System.out.println("This app shows sales data.");
		System.out.println("--------------------------");
	}
}
