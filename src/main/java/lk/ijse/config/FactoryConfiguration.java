package lk.ijse.config;

import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Student.class);
        /*api methana eka class eken classs ekt mapping krnne ntuw apita puluwan configuration.xml file
        * eke add krnna*/
        sessionFactory = configuration.buildSessionFactory();
    }
     public static FactoryConfiguration getFactoryConfiguration(){
         return factoryConfiguration==null ? factoryConfiguration=new FactoryConfiguration() : factoryConfiguration;

     }
     public Session getSession(){
        return sessionFactory.openSession();
     }
}
