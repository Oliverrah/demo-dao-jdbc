package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Department department = new Department(null, "Audio");

		List<Department> listOfDepartments = new ArrayList<>();
		
		DepartmentDao dp = DaoFactory.createDepartmentDao();
		
		
		System.out.println("\n === TEST 1 : INSERT  =====");
		dp.insert(department);
		System.out.println("Inserted, id of department: " + department.getId());
		
		
		department.setName("Mouses");
		System.out.println("\n === TEST 2 : UPDATE =====");
		dp.update(department);
		System.out.println("Updated");
		
		
		System.out.println("\n === TEST 3 : DELETE =====");
		dp.deleteById(9);
		System.out.println("Deleted");
		
		System.out.println("\n === TEST 4 : FIND BY ID =====");
		System.out.println(dp.findById(3));
		
		
		System.out.println("\n === TEST 5 : FIND ALL =====");
		listOfDepartments = dp.findAll();
		
		for(Department d : listOfDepartments) {
			System.out.println(d);
		}
	}

}
