package oopIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram", 10);	//referans oluþturma, instance creation, örnek oluþturma
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo");
		product2.setUnitPrice(16000);
		product2.setDetail("32 GB Ram");
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		
		
		
		
		/*
		 * 3, "HP 5", 10000, "8 GB Ram"
		 *  Product product3 = new Product();
		 * Product[] products = {product1, product2, product3};
		 * 
		 * for (Product product : products) { System.out.println(product.getName()); }
		 * 
		 * System.out.println(products.length);
		 * 
		 * 
		 * Category category1 = new Category(); category1.id = 1; category1.name =
		 * "Bilgisayar";
		 * 
		 * Category category2 = new Category(); category2.id = 2; category2.name =
		 * "Ev&Bahçe";
		 * 
		 * Category category3 = new Category(); category3.id = 3; category3.name =
		 * "Evcil Hayvan";
		 * 
		 * ProductManager productManager = new ProductManager();
		 * productManager.addToCart(product1); productManager.addToCart(product2);
		 * productManager.addToCart(product3);
		 */
		
		

	}

}
