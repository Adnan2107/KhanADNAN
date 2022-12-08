package hiberstudent.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hiberstudent.studententities.student;
import hiberstudent.studentservice.HibernateUtil;

public class App {

Session session=HibernateUtil.getSession();
student s1= new student();
s1.setSname("Adnan");

student s2= new student();
s2.setSname("Aman");


student s3= new student();
s3.setSname("Moin");

Transaction tx=session.beginTransaction();
session.save();
tx.commit();
session.close();
}