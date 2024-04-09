package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

public class StudentList {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getsessionFactory();
		Session s = sf.openSession();

		SelectionQuery<Student> query = s.createSelectionQuery("from Student", Student.class);
		List<Student> studList = query.list();

		for (Student stud : studList) {
			System.out.println(stud);
		}

	}

}
