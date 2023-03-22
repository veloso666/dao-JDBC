package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;
import model.dao.impl.SellerDaoJDBC;

public class Program {

	public static void main(String[] args) {
		
		
		//SellerDao sellerDao = DaoFactory.createSellerDao();
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = new Seller();
		seller = sellerDao.findById(3);
		
		System.out.println(seller);
				
	}

}
