package java_8;

public class Order {
	private int id;
	private String CustomerName;
	private double Amount;
	private String Status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Order(int id,String CustomerName, double Amount, String Status) {
		this.id=id;
		this.CustomerName=CustomerName;
		this.Amount=Amount;
		this.Status=Status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", CustomerName=" + CustomerName + ", Amount=" + Amount + ", Status=" + Status + "]";
	}

	
	
}
