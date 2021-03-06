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

public class ContactDao
{

   final static Logger logger = Logger.getLogger(ContactDao.class);

   public List getContact(Contact instance)
   {
      {
         org.hibernate.Session hibernateSession = HibernateUtil
               .getSessionFactory().openSession();
         List<Contact> results = null;
         try
         {
            Criteria criteria = hibernateSession.createCriteria(
                  Contact.class).add(Example.create(instance));
            results = (List<Contact>) criteria.list();
         }
         catch (Exception e)
         {
            logger.error("Error Occured while getting the Contact...", e);
         }
         finally
         {
            hibernateSession.close();
         }
         return results;
      }
   }
}