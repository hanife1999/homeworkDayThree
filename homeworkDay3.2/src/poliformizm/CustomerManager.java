package poliformizm;

public class CustomerManager {
	private BaseLogger  logger ;

	public CustomerManager(BaseLogger baseLogger) {
		super();
		this.logger = baseLogger;
	}


	public void Add() {
		System.out.println("Müşteri eklendi");
		logger.Log("Log mesajı");
		
	}

}
