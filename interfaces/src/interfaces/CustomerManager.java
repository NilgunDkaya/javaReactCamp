package interfaces;

public class CustomerManager {
	
	//Dependency Injection
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
			this.loggers = loggers;
	}
	
	//Loosly - Tightly Coupled (Gevþek - Katý Baðlýlýk)
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : " +customer.getFirstName());
		
		//Utils classýnda runLoggers methodunu static yaptýðýmýz için
		//bu þekilde kullanabiliyoruz
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : " +customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
