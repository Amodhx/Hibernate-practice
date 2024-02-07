package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embeded.Fullname;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*object create ekede database eke wdth krnn puluwan......
        *
        * etkota api database mysql pattha balanna oni na api java object mapping
        * gana balagattama hari*/

// Step
//        01) dependency adding (hibernate and myslq connector)

//        02) file > project structute > facets > add hibernate.cfg.xml file
//        or we can create normal text file and rename correctly and we have get first code form google

//        03)cfg tika hdanna oni iit psse (driver class, URL , username, psswrd, dialet)

//        04)create krnn oni table name eken class ekak eeke con,get,set add krnn oni

//        05)session gdak create krgnn onnhne project ekatama eka session ekak tibbama athine e nisa
//         FactoryCOnfiguration kyl class ekk hdnw sessoin singlton widihata ganna
        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

//        06) crud operations

//        Save
        Student student = new Student();
        student.setId(4);
        Fullname fullname = new Fullname("AD","asd");
        student.setName(fullname);
        student.setAddress("Kaluthara");
//        Serializable save = (Serializable) session.save(student);
//        System.out.println("bshuabdadna  :"+save);
        //transaction.commit();
        //session.close();

//        getAll
       System.out.println(session.createQuery("from Student").getResultList());
        ArrayList<Student> arrayList = (ArrayList<Student>) session.createQuery("from Student").getResultList();
        System.out.println(arrayList.size());

//        getValues by id
        System.out.println(session.get(Student.class, 0));

//        getRowCount
        System.out.println(session.createQuery("select count(*) from Student").uniqueResult());

//        get methods in hibernate
        System.out.println(session.get(Student.class, 2));
        System.out.println(session.load(Student.class, 1));
        System.out.println(session.find(Student.class, 0));
        Student student1 = session.get(Student.class,1);
        System.out.println(student1);
    }
}