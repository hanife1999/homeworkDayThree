package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepositoıry {

	@Override
	public void add() {
		System.out.println("MySql eklendi");
		
	}

}
