import java.util.*;

public class ShoppingList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of items.");
		int no = sc.nextInt();
		
		ArrayList<String> shoppingItems = new ArrayList();
		
		System.out.println("Enter " + no + " items.");
		for(int i = 0; i < no; i++) {
			String items = sc.next();
			shoppingItems.add(items);
		}
		
		System.out.println("Enter Number of Purchased items.");
		int k = sc.nextInt();
		
		System.out.println("Enter " + k + " Number of Purchased items.");
				
		for(int i = 0; i < k; i++) {
			String purchasedItem = sc.next();
		if(shoppingItems.contains(purchasedItem)) 
			shoppingItems.remove(purchasedItem);
			
		}
		
	
		for(String finalRes: shoppingItems) {
			System.out.print(finalRes + " ");
		}
	}

}
