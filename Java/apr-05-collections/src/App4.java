import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items:");
		int noOfItems=sc.nextInt();
		List<Item> itemList=new ArrayList<Item>();
		for(int i=0;i<noOfItems;i++)
		{
			String input=sc.nextLine();
			if(input.equals(""))
				input=sc.nextLine();
			
			String[] arr = input.split(",");
			Item item=new Item(arr[0], Double.valueOf(arr[1]), arr[2]);
			itemList.add(item);
		}
		
		System.out.println("Enter a search type:\r\n" + 
				"1.By Type\r\n" + 
				"2.By Price");
		
		ItemBO ibo=new ItemBO();
		int choice=sc.nextInt();
		List<Item> result =new ArrayList<>();
		switch(choice)
		{
		case 1:		//by type
			System.out.println("Enter the type:");
			String type=sc.nextLine();
			if(type.equals(""))
				type=sc.nextLine();
			result = ibo.findItem(itemList, type);					
			break;
		case 2:		//by price
			System.out.println("Enter the Price:");
			double price=sc.nextDouble();
			result=ibo.findItem(itemList, price);
			break;
		default:
			System.out.println("Invalid choice");
			System.exit(0);
			break;
		}
		
		if(result.isEmpty())			//result.size()==0
		{
			System.out.println("No such item is present");
		}else
		{
			System.out.format("%-20s %-5s %s\n","Name","Price","Type");
			for(Item i:result)
			{
				System.out.format("%-20s %-5s %s\n",i.getName(),i.getPrice(),i.getType());
			}
		}
	}

}
