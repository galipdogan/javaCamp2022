package oopWithNLayeredApp.business;
import java.util.List;

import oopWithNLayeredApp.Core.Logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[]loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		//is kurallari
		if(product.getUnitPrice()<10) {
			
			throw new Exception("Fiyat 10 liradan dusuk olamaz");
		}
		productDao.add(product);
		for (Logger logger : loggers) {// once database sonra mail yollandin
			logger.log(product.getName());
		}
	}
}
