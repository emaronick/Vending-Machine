import java.io.*;
import java.util.*;
public class Product

	{
	// The name of the snack.
	private static String snackName;
	public static String getSnackName()
		{
		return snackName;
		}
	// The cost of the snack (in cents).
	private static int costInCents;
	public static int getCostInCents()
		{
		return costInCents;
		}
	
	//public static int[] getPrice()
	private static double price;
	public static double getPrice()
		{
		return price;
		}
	public static void countNumberOfLines() throws IOException
		{
	//make counter for how many number of products their are in the vending machine
	int count = 0;
	File productList = new File ("snacks.txt");
	Scanner input = new Scanner (productList);
	while (input.hasNextLine()) {
		String line = input.nextLine();
		count++;
		}
	
	}
}
