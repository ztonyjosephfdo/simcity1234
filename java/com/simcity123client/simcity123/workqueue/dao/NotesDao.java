package com.simcity123client.simcity123.workqueue.dao;

import com.simcity123client.simcity123.workqueue.model.*;
import com.simcity123client.simcity123.HibernateUtil;
import org.hibernate.criterion.Example;
import org.hibernate.SessionFactory;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class NotesDao
{

   final static Logger logger = Logger.getLogger(NotesDao.class);

   public List getNotes(Notes instance)
   {
      {
         org.hibernate.Session hibernateSession = HibernateUtil
               .getSessionFactory().openSession();
         List<Notes> results = null;
         try
         {
            Criteria criteria = hibernateSession
                  .createCriteria(Notes.class).add(
                        Example.create(instance));
            results = (List<Notes>) criteria.list();
         }
         catch (Exception e)
         {
            logger.error("Error Occured while getting the Notes...", e);
         }
         finally
         {
            hibernateSession.close();
         }
         return results;
      }
   }
}