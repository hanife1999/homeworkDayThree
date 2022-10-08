package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validetior = new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersiz");
		}
		
		
	}

}
