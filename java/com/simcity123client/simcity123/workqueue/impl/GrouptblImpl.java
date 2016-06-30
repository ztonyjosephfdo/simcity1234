package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Grouptbl;
import com.simcity123client.simcity123.workqueue.dao.GrouptblDao;
import java.util.List;
import org.apache.log4j.Logger;

public class GrouptblImpl
{

   public List getGrouptbl(Grouptbl gROUPTBL)
   {
      return new GrouptblDao().getGrouptbl(gROUPTBL);
   }
}