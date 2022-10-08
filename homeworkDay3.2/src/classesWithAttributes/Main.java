package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Product product1 = new Product(1 , "kalem","uçlu kalem",100, 5,null);
		
		Product product = new Product();
		product.setName("kalem");
		product.setDescription("uçlu kalem"); 
		product.setId(1);
		product.setPrice(100);
//		product.setKod(null);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		
	}

}