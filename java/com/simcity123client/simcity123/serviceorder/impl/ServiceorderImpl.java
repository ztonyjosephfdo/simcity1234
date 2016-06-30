package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Serviceorder;
import com.simcity123client.simcity123.serviceorder.dao.ServiceorderDao;
import java.util.List;
import org.apache.log4j.Logger;

public class ServiceorderImpl
{

   public List getServiceorder(Serviceorder sERVICEORDER)
   {
      return new ServiceorderDao().getServiceorder(sERVICEORDER);
   }
}