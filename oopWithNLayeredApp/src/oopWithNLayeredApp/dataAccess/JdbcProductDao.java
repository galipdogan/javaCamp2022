package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		// sade ve sadece db erisim kodlari buraya yazilir... SQL ile yapilacak
		
		System.out.println("Jbdc ile veritabanina eklendi.");
	}
}
