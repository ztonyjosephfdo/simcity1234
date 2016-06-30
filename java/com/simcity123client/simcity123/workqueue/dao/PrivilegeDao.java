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

public class PrivilegeDao
{

   final static Logger logger = Logger.getLogger(PrivilegeDao.class);

   public List getPrivilege(Privilege instance)
   {
      {
         org.hibernate.Session hibernateSession = HibernateUtil
               .getSessionFactory().openSession();
         List<Privilege> results = null;
         try
         {
            Criteria criteria = hibernateSession.createCriteria(
                  Privilege.class).add(Example.create(instance));
            results = (List<Privilege>) criteria.list();
         }
         catch (Exception e)
         {
            logger.error("Error Occured while getting the Privilege...", e);
         }
         finally
         {
            hibernateSession.close();
         }
         return results;
      }
   }
}