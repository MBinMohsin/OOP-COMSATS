package banking;
public class BankingSystem{
	static final String storedAccountNumber="12258";
	static final String storedPin = "0000";
	public static class LoginProcessor{
		static boolean result;
		static boolean authenticate(String accountNumber, String pin){
			if (accountNumber.equals(storedAccountNumber)&&pin.equals(storedPin)){
				result=true;
			}
			return result;
		}
		
		
	}
	
}
