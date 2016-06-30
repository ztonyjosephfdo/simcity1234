package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Serviceorderattribute;
import com.simcity123client.simcity123.serviceorder.dao.ServiceorderattributeDao;
import java.util.List;
import org.apache.log4j.Logger;

public class ServiceorderattributeImpl
{

   public List getServiceorderattribute(
         Serviceorderattribute sERVICEORDERATTRIBUTE)
   {
      return new ServiceorderattributeDao()
            .getServiceorderattribute(sERVICEORDERATTRIBUTE);
   }
}