package base;

import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import domain.RateDomainModel;
import org.hibernate.Query;
import java.util.ArrayList;
import java.util.List;



public class RateDAL {


	public static double getRate(int rate) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		RateDomainModel rates = null;
		double Interest = 0.0;
		
		try {
			tx = session.beginTransaction();
			session.save(rate);
			tx.commit();
			
			int CreditScore = rate;
			if (CreditScore >= 500) {
				CreditScore = 350;
			}
			else if (CreditScore >= 600) {
				CreditScore = 600;
			}
			
		} catch (HibernateException e) {
			if (tx != null){
				tx.rollback();
			}
			
			e.printStackTrace();
			
		} finally {
			
		}
			session.close();
		
		return Interest;
	}
	
		public static double row() {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = null;	
			ArrayList<RateDomainModel> rate = new ArrayList<RateDomainModel>();
			
			try {
				tx = session.beginTransaction();	
				
				List ratedomain = session.createQuery("from ratedomainmodel").list();
				
				for (Object Rate : ratedomain) {
					
					RateDomainModel interestrate = (RateDomainModel) Rate;
					
					rate.add(interestrate);
					
					
				}
				
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
				
			} finally {
				
				session.close();
				
			}		
				return row();
		}
	}


