
//public class InvalidAmountException extends RuntimeException
public class InvalidAmountException extends Exception
{
	InvalidAmountException(String message)
	{
		super(message);
	}
}
