package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Contact;
import com.simcity123client.simcity123.serviceorder.dao.ContactDao;
import java.util.List;
import org.apache.log4j.Logger;

public class ContactImpl
{

   public List getContact(Contact cONTACT)
   {
      return new ContactDao().getContact(cONTACT);
   }
}