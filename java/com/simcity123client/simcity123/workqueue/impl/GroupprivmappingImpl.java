package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Groupprivmapping;
import com.simcity123client.simcity123.workqueue.dao.GroupprivmappingDao;
import java.util.List;
import org.apache.log4j.Logger;

public class GroupprivmappingImpl
{

   public List getGroupprivmapping(Groupprivmapping gROUPPRIVMAPPING)
   {
      return new GroupprivmappingDao().getGroupprivmapping(gROUPPRIVMAPPING);
   }
}