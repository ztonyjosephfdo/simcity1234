package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Serviceorderitemattribute;
import com.simcity123client.simcity123.serviceorder.dao.ServiceorderitemattributeDao;
import java.util.List;
import org.apache.log4j.Logger;

public class ServiceorderitemattributeImpl
{

   public List getServiceorderitemattribute(
         Serviceorderitemattribute sERVICEORDERITEMATTRIBUTE)
   {
      return new ServiceorderitemattributeDao()
            .getServiceorderitemattribute(sERVICEORDERITEMATTRIBUTE);
   }
}