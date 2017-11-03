import java.util.ArrayList;
import java.util.Scanner;

public class Discount {
	ArrayList<Integer> productItemList = new ArrayList<Integer>();
	
	public static void main(String args[]) {
		Discount d = new Discount();
		
		System.out.println("Hello this is our POS!\n");	
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.println("Enter \"a\" to add item");
			System.out.println("Enter \"d\" to delete item");
			System.out.println("Enter \"e\" to exit");
			
			String command = sc.nextLine();
			command = command.toLowerCase();
			
			if(command.equals("d")) {
				System.out.println("\nPlease enter product number: ");	
				int item = sc.nextInt();
				
				d.deleteItem(item);
				
				sc.nextLine();
			}
			else if(command.equals("a")) {
				System.out.println("\nPlease enter product number: ");	
				int item = sc.nextInt();
				
				d.addItem(item);
				sc.nextLine();

			}
			else if(command.equals("e")) {
				System.out.println("Bye!");	
				break;
			}
			else {
				System.out.println("Invalid option!");
			}
			
			
			d.printProductList();
			
		}
		
		sc.close();
	}
	
	public String echo(String s) {
		return s;
	}

	public void addItem(int item) {
		productItemList.add(item);
	}

	public int getNumberOfItems() {
		return productItemList.size();
	}

	public void deleteItem(int item) {
		int idx = productItemList.indexOf(item);
		
		if(idx >= 0) {
			productItemList.remove(idx);
		}
	}
	
	public void printProductList() {
		int productItemSize = getNumberOfItems();
		for(int i=0; i<productItemSize; i++) {
			System.out.println(String.valueOf(i) + ". " + String.valueOf(productItemList.get(i)));
		}
	}
}
