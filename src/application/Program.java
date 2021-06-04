package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		System.out.println("=== TESTE 1: seller findById ====");		
		SellerDao sd = DaoFactory.createSellerDao();		
		System.out.println(sd.findById(7));
		
		System.out.println("\n === TESTE 2: seller findByDepartment ====");
		Department dep = new Department(3, null);		
		List<Seller> list = sd.findByDepartment(dep);	
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n === TESTE 3: seller findAll ====");
		list = sd.findAll();
		for(Seller s : list){
			System.out.println(s);
		}
		
		System.out.println("\n === TESTE 4: seller insert ====");
		
		Seller seller = new Seller(null, "Mariana", "mariana@gmail.com", new Date(), 2.500, dep);
		sd.insert(seller);
		System.out.println("Inserted, new id = " + seller.getId());

	}

}
