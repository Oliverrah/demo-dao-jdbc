package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		System.out.println("=== TESTE 1: seller findById ====");
		
		SellerDao sd = DaoFactory.createSellerDao();
		
		System.out.println(sd.findById(7));

	}

}
