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

public class ServiceorderDao
{

   final static Logger logger = Logger.getLogger(ServiceorderDao.class);

   public List getServiceorder(Serviceorder instance)
   {
      {
         org.hibernate.Session hibernateSession = HibernateUtil
               .getSessionFactory().openSession();
         List<Serviceorder> results = null;
         try
         {
            Criteria criteria = hibernateSession.createCriteria(
                  Serviceorder.class).add(Example.create(instance));
            results = (List<Serviceorder>) criteria.list();
         }
         catch (Exception e)
         {
            logger.error("Error Occured while getting the Serviceorder...",
                  e);
         }
         finally
         {
            hibernateSession.close();
         }
         return results;
      }
   }
}