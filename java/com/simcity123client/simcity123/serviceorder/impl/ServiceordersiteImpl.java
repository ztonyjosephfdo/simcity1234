package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Serviceordersite;
import com.simcity123client.simcity123.serviceorder.dao.ServiceordersiteDao;
import java.util.List;
import org.apache.log4j.Logger;

public class ServiceordersiteImpl
{

   public List getServiceordersite(Serviceordersite serviceOrderSite)
   {
      return new ServiceordersiteDao().getServiceordersite(serviceOrderSite);
   }
}