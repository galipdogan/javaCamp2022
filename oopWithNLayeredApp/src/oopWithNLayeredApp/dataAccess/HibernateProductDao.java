package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		// sade ve sadece db erisim kodlari buraya yazilir... SQL ile yapilacak

		System.out.println("Hibernate ile veritabanina eklendi.");
	}
}
