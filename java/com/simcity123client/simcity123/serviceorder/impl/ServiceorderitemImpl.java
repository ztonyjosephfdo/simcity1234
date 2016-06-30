package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Serviceorderitem;
import com.simcity123client.simcity123.serviceorder.dao.ServiceorderitemDao;
import java.util.List;
import org.apache.log4j.Logger;

public class ServiceorderitemImpl
{

   public List getServiceorderitem(Serviceorderitem sERVICEORDERITEM)
   {
      return new ServiceorderitemDao().getServiceorderitem(sERVICEORDERITEM);
   }
}