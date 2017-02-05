package project;
import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double amount;
		double tendered;
		// In case the program was sent 2 parameters in command line
		if (args.length == 2) {
			amount = Double.parseDouble(args[0]);
			tendered = Double.parseDouble(args[1]);
		}
		// If no parameters were sent via command line
		else {
			System.out.print("Please enter the price of the item: ");
	        String line = keyboard.nextLine ();
	        // This loop catches the exception in case anything but a number was entered
			while (true) {
	               try {
	            	   amount = Double.parseDouble(line);
	                    break;
	                }
	                catch (NumberFormatException e) {

	                }
	            System.out.print("Error! Please enter a number: ");
	            line = keyboard.nextLine ();
	        }
			System.out.print("How much money was tendered by the customer? ");
	        line = keyboard.nextLine ();
	        // This loop also catches the exception in case anything but a number was entered
			while (true) {
	               try {
	            	   tendered = Double.parseDouble(line);
	                   break;
	                }
	                catch (NumberFormatException e) {

	                }
	            System.out.print("Error! Please enter a number: ");
	            line = keyboard.nextLine ();
	        }
		}

		System.out.println(makeChange(amount, tendered));

		keyboard.close();
	}

	public static String makeChange(double amount, double tendered) {
		String errorMessage = "";
		boolean error = false;
		double change = 0;
		int changeBills = 0;
		double changeCoins = 0;
		int changeTwentyDollarBills = 0;
		int changeTenDollarBills = 0;
		int changeFiveDollarBills = 0;
		int changeOneDollarBills = 0;
		int changeQuarters = 0;
		int changeDimes = 0;
		int changeNickels = 0;
		int changePennies = 0;
		// To give errors when amount in not less than tendered
		if (amount > tendered) {
			error = true;
			errorMessage = "Amount tendered is less than the price of the item!";
		} else if (amount == tendered) {
			error = true;
			errorMessage = "Amount tendered is exactly the same as the price of the item. No change needed!";
		} // To calculate the change in various bills and coins using / and %
		else {
			change = tendered - amount;
			changeBills = (int) change;
			changeCoins = change - changeBills;
			changeTwentyDollarBills = changeBills / 20;
			changeBills = changeBills % 20;
			changeTenDollarBills = changeBills / 10;
			changeBills = changeBills % 10;
			changeFiveDollarBills = changeBills / 5;
			changeBills = changeBills % 5;
			changeOneDollarBills = changeBills;
			changeQuarters = (int) (changeCoins / .25);
			changeCoins = changeCoins % .25;
			changeDimes = (int) (changeCoins / .10);
			changeCoins = changeCoins % .10;
			changeNickels = (int) (changeCoins / .05);
			changeCoins = changeCoins % .05;
			changePennies = (int) Math.round(changeCoins * 100);
		}
		// Building the output string
		String output = "Amount: " + String.format("%.2f", amount) + ", ";
		output += "Tendered: " + String.format("%.2f", tendered) + ", ";
		output += "Result: ";
		if (error) {
			output += errorMessage;
		} else {
			boolean first = true;
			if (changeTwentyDollarBills > 0) {
				if (first) {
					first = false;
				} else {
					output += ", ";
				}
				output += changeTwentyDollarBills + " twenty dollar bill";
				if (changeTwentyDollarBills > 1) {
					output += "s";
				}
			}
			if (changeTenDollarBills > 0) {
				if (first) {
					first = false;
				} else {
					output += ", ";
				}
				output += changeTenDollarBills + " ten dollar bill";
				if (changeTenDollarBills > 1) {
					output += "s";
				}
			}
			if (changeFiveDollarBills > 0) {
				if (first) {
					first = false;
				} else {
					output += ", ";
				}
				output += changeFiveDollarBills + " five dollar bill";
				if (changeFiveDollarBills > 1) {
					output += "s";
				}
			}
			if (changeOneDollarBills > 0) {
				if (first) {
					first = false;
				} else {
					output += ", ";
				}
				output += changeOneDollarBills + " one dollar bill";
				if (changeOneDollarBills > 1) {
					output += "s";
				}
			}
			if (changeQuarters > 0) {
				if (first) {
					first = false;
				} else {
					output += ", ";
				}
				output += changeQuarters + " quarter";
				if (changeQuarters > 1) {
					output += "s";
				}
			}
			if (changeDimes > 0) {
				if (first) {
					first = false;
				} else {
					output += ", ";
				}
				output += changeDimes + " dime";
				if (changeDimes > 1) {
					output += "s";
				}
			}
			if (changeNickels > 0) {
				if (first) {
					first = false;
				} else {
					output += ", ";
				}
				output += changeNickels + " nickel";
				if (changeNickels > 1) {
					output += "s";
				}
			}
			if (changePennies > 0) {
				if (first) {
					first = false;
				} else {
					output += ", ";
				}
				if (changePennies > 1) {
					output += changePennies + " pennies";
				} else {
					output += changePennies + " penny";
				}
			}

		}
		return output;
	}
}
