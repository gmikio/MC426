package exercise5;

public class Item {
    private int price;

	public int getFinalPrice() {
		float finalPrice = getPrice() + getTax();
		if (isOnSale())
			finalPrice = finalPrice - i.getSaleDiscount() * finalPrice;
		return finalPrice;
	}
    
    public int getPrice(){
        return price;
    }

	public int getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isOnSale() {
		// TODO Auto-generated method stub
		return false;
	}

	public float getSaleDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	//...
}
