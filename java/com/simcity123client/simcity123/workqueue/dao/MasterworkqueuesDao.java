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

public class MasterworkqueuesDao
{

   final static Logger logger = Logger.getLogger(MasterworkqueuesDao.class);

   public List getMasterworkqueues(Masterworkqueues instance)
   {
      {
         org.hibernate.Session hibernateSession = HibernateUtil
               .getSessionFactory().openSession();
         List<Masterworkqueues> results = null;
         try
         {
            Criteria criteria = hibernateSession.createCriteria(
                  Masterworkqueues.class).add(Example.create(instance));
            results = (List<Masterworkqueues>) criteria.list();
         }
         catch (Exception e)
         {
            logger.error(
                  "Error Occured while getting the Masterworkqueues...",
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