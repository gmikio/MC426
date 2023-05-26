package exercise5;

// Feature Envy
public class Basket {

	// ..
    // Este método não é desta classe
    // Esta classe está roubando, ou, "invejando" este método
	float getTotalPrice(Item i) {
		float price = i.getPrice() + i.getTax();
		if (i.isOnSale())
			price = price - i.getSaleDiscount() * price;
		return price;
	}
}
