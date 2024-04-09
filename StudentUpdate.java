package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class StudentUpdate {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getsessionFactory();
		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();

//		Method 1
//		Student stud = s.get(Student.class,1);
//		stud.setMarks(98);
//		s.merge(stud);	//s.update(stud) prior to hibernate 6
//		Method 2 - Using HQL (HIbernate Query Language) is applied on Model(Class) not on table

		MutationQuery query = s.createMutationQuery("update Student set marks=:m where sname=:sn");
		query.setParameter("m", 70);
		query.setParameter("sn", "Shubham");
		query.executeUpdate();

		tx.commit();
		s.close();

	}

}
