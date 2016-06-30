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

public class ServiceorderitemattributeDao
{

   final static Logger logger = Logger
         .getLogger(ServiceorderitemattributeDao.class);

   public List getServiceorderitemattribute(Serviceorderitemattribute instance)
   {
      {
         org.hibernate.Session hibernateSession = HibernateUtil
               .getSessionFactory().openSession();
         List<Serviceorderitemattribute> results = null;
         try
         {
            Criteria criteria = hibernateSession.createCriteria(
                  Serviceorderitemattribute.class).add(
                  Example.create(instance));
            results = (List<Serviceorderitemattribute>) criteria.list();
         }
         catch (Exception e)
         {
            logger.error(
                  "Error Occured while getting the Serviceorderitemattribute...",
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