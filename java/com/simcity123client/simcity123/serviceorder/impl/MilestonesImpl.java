package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Milestones;
import com.simcity123client.simcity123.serviceorder.dao.MilestonesDao;
import java.util.List;
import org.apache.log4j.Logger;

public class MilestonesImpl
{

   public List getMilestones(Milestones mILESTONES)
   {
      return new MilestonesDao().getMilestones(mILESTONES);
   }
}