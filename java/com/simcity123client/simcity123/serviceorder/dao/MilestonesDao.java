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

public class MilestonesDao
{

   final static Logger logger = Logger.getLogger(MilestonesDao.class);

   public List getMilestones(Milestones instance)
   {
      {
         org.hibernate.Session hibernateSession = HibernateUtil
               .getSessionFactory().openSession();
         List<Milestones> results = null;
         try
         {
            Criteria criteria = hibernateSession.createCriteria(
                  Milestones.class).add(Example.create(instance));
            results = (List<Milestones>) criteria.list();
         }
         catch (Exception e)
         {
            logger.error("Error Occured while getting the Milestones...", e);
         }
         finally
         {
            hibernateSession.close();
         }
         return results;
      }
   }
}