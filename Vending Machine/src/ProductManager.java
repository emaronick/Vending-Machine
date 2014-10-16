
public class ProductManager
	{
	private static String nextItemCode = "A1";
	private static String itemCode;
	private static Product product;
	private int quantity;
	
	public static String getItemCode()
		{
		return itemCode;
		}
	
	public static Product getProduct()
		{
		return null;
		}
	
	public static void incrimentItemCode()
		{
		
		}
	
	public static boolean isInStock()
		{
		return true;
		}
	
	public static boolean vendItem()
		{
		return true;
		}
	}