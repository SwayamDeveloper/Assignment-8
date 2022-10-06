package com.exe.onceagainonetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Courses.class);
        Configuration con1 = new Configuration().configure().addAnnotatedClass(Teacher.class);
        
        SessionFactory sf = con.buildSessionFactory();
        Session session=sf.openSession();  
          
               
       Courses C = new Courses();
       C.setCId(1);
       C.setCourseName(" java ");
       
       Courses C1 = new Courses();
       C1.setCId(2);
       C1.setCourseName("python");

       
       Courses C2 = new Courses();
       C2.setCId(3);
       C2.setCourseName("Angular");

       Teacher s1 = new Teacher();
       s1.setId(1);
       s1.setTeacherName("Mrudula");
       
       s1.getLaptop().add(C);
       s1.getLaptop().add(C1);
       s1.getLaptop().add(C2);   
       Transaction t=session.beginTransaction(); 
        
        
        session.persist(s1);    
//        Updating query
//        Teacher tr = (Teacher)session.get(Teacher.class, 1);
//        tr.setTeacherName("Mridula Mam");
//        System.out.println("---------Updated Successfully---------");
//        session.getTransaction().commit();
//        t.commit();   
        
        // Delete query
//        Teacher Id = (Teacher)session.get(Teacher.class, 1);
//        session.delete(Id);
//        System.out.println("---------Deleted Successfully---------");
//        session.getTransaction().commit();
        
        session.close();  
          
        System.out.println( "Hello World!" );
    }
}
