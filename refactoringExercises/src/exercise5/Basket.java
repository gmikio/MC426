package exercise5;

// Feature Envy
public class Basket {

	// ..
    // Este método não é desta classe
    // Esta classe está roubando, ou, "invejando" este método


	float getTotalFinalPrice(Item* items) {
        // Meti python pra corrigir memo é isso
        // Função *de verdade* para calcular a soma dos itens, no plural, de uma cesta de compras
        float totalFinalPrice = 0;
        for item in items:
            totalFinalPrice += item.getFinalPrice();
		return totalFinalPrice;
	}
}
