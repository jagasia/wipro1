
public class App2 {

	public static void main(String[] args) {
		Bank sbi=new Bank();
//		try
//		{
//			sbi.withdraw(31000);
//		}catch(NumberFormatException nfe)
//		{
//			System.out.println(nfe.getMessage());
//		}
//		catch(InvalidAmountException iae)
//		{
//			System.out.println(iae.getMessage());
//		}
		try {
			sbi.withdraw(32000);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
