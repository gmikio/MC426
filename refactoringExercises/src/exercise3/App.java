package exercise3;

public class App {

	public static void main(String[] args) {

		Person john = new Person();
		// ...
		// Person manager = john.getManager(); -> Errado
        
        // Forma correta de obter "Manager":
        Person manager = Department.getManager();

	}
}
