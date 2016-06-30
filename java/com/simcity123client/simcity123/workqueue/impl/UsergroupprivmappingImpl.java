package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Usergroupprivmapping;
import com.simcity123client.simcity123.workqueue.dao.UsergroupprivmappingDao;
import java.util.List;
import org.apache.log4j.Logger;

public class UsergroupprivmappingImpl
{

   public List getUsergroupprivmapping(
         Usergroupprivmapping uSERGROUPPRIVMAPPING)
   {
      return new UsergroupprivmappingDao()
            .getUsergroupprivmapping(uSERGROUPPRIVMAPPING);
   }
}