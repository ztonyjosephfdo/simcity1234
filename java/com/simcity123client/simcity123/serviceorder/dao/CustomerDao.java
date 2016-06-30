package com.simcity123client.simcity123.serviceorder.dao;

import com.simcity123client.simcity123.serviceorder.model.*;
import com.simcity123client.simcity123.HibernateUtil;
import org.hibernate.criterion.Example;
import org.hibernate.SessionFactory;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CustomerDao
{

   final static Logger logger = Logger.getLogger(CustomerDao.class);

   public List getCustomer(Customer instance)
   {
      {
         org.hibernate.Session hibernateSession = HibernateUtil
               .getSessionFactory().openSession();
         List<Customer> results = null;
         try
         {
            Criteria criteria = hibernateSession.createCriteria(
                  Customer.class).add(Example.create(instance));
            results = (List<Customer>) criteria.list();
         }
         catch (Exception e)
         {
            logger.error("Error Occured while getting the Customer...", e);
         }
         finally
         {
            hibernateSession.close();
         }
         return results;
      }
   }
}