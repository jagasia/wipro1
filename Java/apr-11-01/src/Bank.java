
public class Bank {
	public void withdraw(int amount) throws InvalidAmountException
	{
		if(amount>30000)
		{
//			throw new NumberFormatException("Amount cannot be greater than 30k");
			throw new InvalidAmountException("Invalid amount. So enter only upto 30k");
		}else
		{
			System.out.println("Remember to collect the cash");
		}
	}
}
