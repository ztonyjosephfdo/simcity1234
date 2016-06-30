package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Privilege;
import com.simcity123client.simcity123.workqueue.dao.PrivilegeDao;
import java.util.List;
import org.apache.log4j.Logger;

public class PrivilegeImpl
{

   public List getPrivilege(Privilege pRIVILEGE)
   {
      return new PrivilegeDao().getPrivilege(pRIVILEGE);
   }
}