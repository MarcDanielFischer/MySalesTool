package ca.demo.salestool;

/**
 * Represent the sales data for a given period.
 */
public class SalesData {
	int data[] = {-1, 0, 4, 42, 84};
	
	public void display() {
		System.out.println("Data: ");

		int sum = 0;
		for (int i: data) {
//			System.out.println("Next value: " + data[i]); // now thats the wrong index usage
			System.out.println("Next value: " + i); 
			sum += i;
		}
		
		System.out.println("Sum is: " + sum);
	}
	
	public void newMethod(){
		System.out.println("This is an example new method");
	}
}
