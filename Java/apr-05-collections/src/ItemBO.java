import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemBO {
	
	public List<Item> findItem(List<Item> itemList, String type)
	{
		List<Item> result=new ArrayList<Item>();
		for(Item i:itemList)
		{
			if(i.getType().equals(type))
			{
				result.add(i);
			}
		}
		return result;
	}
	public List<Item> findItem(List<Item> itemList, Double price)
	{
		List<Item> result=new ArrayList<>();
		Iterator<Item> it = itemList.iterator();
		while(it.hasNext())
		{
			Item i = it.next();
			if(i.getPrice().equals(price))
			{
				result.add(i);
			}
		}
		return result;
	}

}
