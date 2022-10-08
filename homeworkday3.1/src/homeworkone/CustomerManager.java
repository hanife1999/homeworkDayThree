package homeworkone;

public class CustomerManager {
	
	private Customer customer;
	private CrediManager crediManager;
	
	public CustomerManager(Customer customer, CrediManager crediManager) {
		customer =customer;  
		crediManager=crediManager;
	}
	public void save() {
		System.out.println("Müşteri kaydedildi :");
	}
	public void delete() {
		System.out.println("Müşteri silindi :" );
	}
	public void update() {
		System.out.println("Müşteri güncellendi :" );
	}
	public void giveCredi() {
		crediManager.calculate();
		System.out.println("Kredi verildi");
	}
}
