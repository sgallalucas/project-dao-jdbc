package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao(); 
		
		System.out.println("----- TEST findById -----");
		Department dep = depDao.findById(2);
		System.out.println(dep);
	}

}
