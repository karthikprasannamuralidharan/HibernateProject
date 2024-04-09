package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
import org.hibernate.query.SelectionQuery;

public class StudentDelete {
	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getsessionFactory();
		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();

//		Method 1
//		Student stud = new Student();
//		stud.setSno(5);
//		s.remove(stud);

//		Method 2
//		Student stud = s.get(Student.class, 1);
//		s.remove(stud);

//		Method 3
		SelectionQuery<Student> query = s.createSelectionQuery("from Student where marks >=:m", Student.class);
		query.setParameter("m", 95.0);
		List<Student> studList = query.list();

		for (Student stud : studList) {
			s.remove(stud);
		}

		tx.commit();
		s.close();
	}

}
