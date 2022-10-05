package oopWithNLayeredApp;

import oopWithNLayeredApp.Core.Logging.DatabaseLogger;
import oopWithNLayeredApp.Core.Logging.Logger;
import oopWithNLayeredApp.Core.Logging.MailLogger;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = new Product(1, "Iphone Xr", 10.000);
		Logger[] loggers = { new DatabaseLogger(), new MailLogger() };

		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
