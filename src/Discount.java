import java.util.ArrayList;
import java.util.Scanner;

public class Discount {
	ArrayList<Integer> productItemList = new ArrayList<Integer>();
	
	public static void main(String args[]) {
		Discount d = new Discount();
		
		System.out.println("Hello this is our POS!\n");	
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("\nPlease enter product number: ");	
			int item = sc.nextInt();
			
			d.addItem(item);
			
			d.printProductList();
		}
		
//		System.out.println("Going to exit");
//		sc.close();
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
