package co.edu.udea.drai.expsw.modelo.cnf;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import co.edu.udea.drai.iw.util.exception.IwDaoException;

public class HibernateSessionFactory {

	private static HibernateSessionFactory instance = null;
	private static SessionFactory sessionFactory = null;
	private static Configuration configuration = new Configuration();
	
	
	private HibernateSessionFactory() { 
		
	}
	
	public static HibernateSessionFactory getInstance(){
		if (instance == null)
			instance = new HibernateSessionFactory();
		
		return instance;
	}
	//public Session getSession() throws IwDaoException{
	public Session getSession(){
		try{
			if (sessionFactory == null){
				configuration.configure("co/edu/udea/drai/expsw/modelo/cnf/hibernate.cfg.xml");
				sessionFactory = configuration.buildSessionFactory();
			}
		} catch (HibernateException e){
                       // throw new IwDaoException(e);
                            System.out.println(e.toString());
		}
		return sessionFactory.openSession();
	}
}