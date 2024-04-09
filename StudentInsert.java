
package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentInsert {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getsessionFactory();
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Student stud = new Student();
		stud.setSno(1);
		stud.setSname("Karthik");
		stud.setMarks(95);
		
		s.persist(stud); //Insert into StudentInfo Table
		
		tx.commit();
		s.close();

	}

}
