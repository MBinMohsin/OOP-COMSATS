package util;
public class PinValidator{
	public class Rules{
		public boolean isValid(String pin){
			boolean valid=false;
			if(pin.length() == 4 && pin.matches("\\d+")){
				valid=true;
			}
			return valid;
		}
	}

}
