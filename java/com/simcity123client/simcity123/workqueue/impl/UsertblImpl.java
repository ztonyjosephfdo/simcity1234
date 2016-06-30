package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Usertbl;
import com.simcity123client.simcity123.workqueue.dao.UsertblDao;
import java.util.List;
import org.apache.log4j.Logger;

public class UsertblImpl
{

   public List getUsertbl(Usertbl uSERTBL)
   {
      return new UsertblDao().getUsertbl(uSERTBL);
   }
}