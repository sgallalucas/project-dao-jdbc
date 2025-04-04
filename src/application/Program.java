package application;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		List<Seller> list = new ArrayList<>();
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("----- test1: seller findById -----\n");
		Seller sel = sellerDao.findById(3);
		System.out.println(sel);

		System.out.println("\n----- test2: seller findByDepartment -----\n");
		Department department = new Department(2, null);
		list = sellerDao.findByDepartment(department);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n----- test3: seller findAll -----\n");
		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
		/*
		System.out.println("\n----- test4: seller insert -----\n");
		Seller sel2 = new Seller(null, "Dimas", "dimas@gmail.com", new Date(), 10000.0, new Department(4, null));
		sellerDao.insert(sel2);
		System.out.println("Inserted! new seller id: " + sel2.getId());
		*/
		System.out.println("\n----- test4: seller update -----\n");
		sel = sellerDao.findById(1);
		sel.setName("Luana Orange");
		sellerDao.update(sel);
		System.out.println("Update completed!");
	}
}
