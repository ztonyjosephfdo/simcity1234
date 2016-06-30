package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Location;
import com.simcity123client.simcity123.serviceorder.dao.LocationDao;
import java.util.List;
import org.apache.log4j.Logger;

public class LocationImpl
{

   public List getLocation(Location location)
   {
      return new LocationDao().getLocation(location);
   }
}