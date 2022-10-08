package interfaces;

public class CustomerManager { 
	private ICustomerDal custoemrDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.custoemrDal = customerDal;
	
	}
	void add() {//iş kodları yazılır
		custoemrDal.add();
		
	}

}
