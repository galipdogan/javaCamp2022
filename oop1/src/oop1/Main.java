package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj="Vade Oranı";

		Product product1=new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3=new Product();
		product3.setName("Delonghi Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");
		
		//System.out.println(product1.name));
		System.out.println("<ul>");
		Product[] products= {product1,product2,product3};
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("<ul>");
		
		
		IndividualCustomer individualCustomer= new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("5555554512");
		individualCustomer.setFirstName("Galip");
		individualCustomer.setLastName("Dogan");
		
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("KodlamaIo");
		corporateCustomer.setPhone("5555555555");
		corporateCustomer.setTaxNumber("112213132");
		
		
		Customer[] customers= {individualCustomer,corporateCustomer};
		
		
	}

}
