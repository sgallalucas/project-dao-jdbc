package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		List<Department> list = new ArrayList<>();
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao(); 
		
		System.out.println("----- TEST findById -----");
		Department dep = depDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n----- TEST findAll -----");
		list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n----- TEST insert -----");
		Department dep2 = new Department(null, "Tecnology"); // O id (primeiro parâmetro do argumento) recebe null por ser auto incrementado no banco de dados.
		depDao.insert(dep2);
		System.out.println("Inserted! new department id: " + dep2.getId());
	}

}
