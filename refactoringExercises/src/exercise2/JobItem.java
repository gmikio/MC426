package exercise2;

public class JobItem {

    // Criar uma classe "laborItem"
	private int quantity;
	private int unitPrice;
	private boolean isLabor;
    private Employee employee;

	public JobItem(int quantity, int unitPrice, boolean isLabor, Employee employee) {
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.isLabor = isLabor;
		this.employee = employee;
	}

    public class LaborItem{
        private Employee employee;
        
        public LaborItem(JobItem jobItem){
            this.employee = jobItem.employee
        }
        public int getUnitPrice() {
            return employee.getRate();
        }

    }

	public int getTotalPrice() {
		return quantity * getUnitPrice();
	}

	public int getQuantity() {
		return quantity;
	}

    // Sobreescrever esta classe
    // Att: Não sei como realizar a sobrecarga ou sobreposição de método aqui sem alterar o "App.Java"
	public int getUnitPrice() {
		return (isLabor) ? employee.getRate() : unitPrice;
	}

	public Employee getEmployee() {
		return employee;
	}
}
