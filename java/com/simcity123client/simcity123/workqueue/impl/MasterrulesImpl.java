package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Masterrules;
import com.simcity123client.simcity123.workqueue.dao.MasterrulesDao;
import java.util.List;
import org.apache.log4j.Logger;

public class MasterrulesImpl
{

   public List getMasterrules(Masterrules mASTERRULES)
   {
      return new MasterrulesDao().getMasterrules(mASTERRULES);
   }
}