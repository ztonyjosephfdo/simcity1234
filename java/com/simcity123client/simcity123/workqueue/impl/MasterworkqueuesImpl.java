package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Masterworkqueues;
import com.simcity123client.simcity123.workqueue.dao.MasterworkqueuesDao;
import java.util.List;
import org.apache.log4j.Logger;

public class MasterworkqueuesImpl
{

   public List getMasterworkqueues(Masterworkqueues mASTERWORKQUEUES)
   {
      return new MasterworkqueuesDao().getMasterworkqueues(mASTERWORKQUEUES);
   }
}