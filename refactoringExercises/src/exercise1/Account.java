package exercise1;

public class Account {

	// ...
	private int daysOverdrawn;

    public static final int REGULAR_ACCOUNT = 0;
	public static final int PREMIUM_ACCOUNT = 1;
	
	private int accountType;
	
	public boolean isPremium() {
		if (this.accountType == PREMIUM_ACCOUNT)
			return true;
		return false;
	}

	public double overdraftCharge() {
		if (isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}
			return result;
	    }
	    else {
	    	return daysOverdrawn * 1.75;
	    }
	}
	  
	public double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += overdraftCharge();
	    }
	   return result;
	}
}