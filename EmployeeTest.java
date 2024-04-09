package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class EmployeeTest {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getsessionFactory();
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Employee emp = new Employee();
//		emp.setEmpId(1);
		emp.setEmpName("Maxwell");
		emp.setEmpSalary(95000);
		
		s.persist(emp);
		
		
		tx.commit();
		s.close();

	}

}
