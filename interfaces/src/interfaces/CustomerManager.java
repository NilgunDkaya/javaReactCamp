package interfaces;

public class CustomerManager {
	
	//Dependency Injection
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
			this.loggers = loggers;
	}
	
	//Loosly - Tightly Coupled (Gev�ek - Kat� Ba�l�l�k)
	public void add(Customer customer) {
		System.out.println("M��teri eklendi : " +customer.getFirstName());
		
		//Utils class�nda runLoggers methodunu static yapt���m�z i�in
		//bu �ekilde kullanabiliyoruz
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : " +customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
