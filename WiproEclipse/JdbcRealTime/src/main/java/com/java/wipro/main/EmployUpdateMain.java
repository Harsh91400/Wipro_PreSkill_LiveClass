package com.java.wipro.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.wipro.dao.EmployDao;
import com.java.wipro.dao.EmployDaoImpl;
import com.java.wipro.model.Employ;
import com.java.wipro.model.Gender;

public class EmployUpdateMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter Employ no : ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name : ");
		employ.setName(sc.next());
		System.out.println("Enter Employ Gender {MALE, FEMALE} : ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Employ Dept : ");
		employ.setDept(sc.next());
		System.out.println("Enter Employ desig : ");
		employ.setDesig(sc.next());
		System.out.println("Enter Employ Basic : ");
		employ.setBasic(sc.nextDouble());
		
		EmployDao employDao = new EmployDaoImpl();
		try {
			System.out.println(employDao.updateEmployDao(employ));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
