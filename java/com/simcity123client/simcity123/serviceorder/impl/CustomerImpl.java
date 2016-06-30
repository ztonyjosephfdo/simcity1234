package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Customer;
import com.simcity123client.simcity123.serviceorder.dao.CustomerDao;
import java.util.List;
import org.apache.log4j.Logger;

public class CustomerImpl
{

   public List getCustomer(Customer cUSTOMER)
   {
      return new CustomerDao().getCustomer(cUSTOMER);
   }
}