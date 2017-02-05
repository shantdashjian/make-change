import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double amount;
		double tendered;
		System.out.print("Please enter the price of the item: ");
		amount = keyboard.nextDouble();
		System.out.print("How much money was tendered by the customer? ");
		tendered = keyboard.nextDouble();

		if (amount > tendered) {
			System.out.println("Amount tendered is less than the price of the item!");
		} else if (amount == tendered) {
			System.out.print("Amount tendered is exactly the same as the price of the item. No change needed!");
		}

	}
}
