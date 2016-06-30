package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Mastertasks;
import com.simcity123client.simcity123.workqueue.dao.MastertasksDao;
import java.util.List;
import org.apache.log4j.Logger;

public class MastertasksImpl
{

   public List getMastertasks(Mastertasks mASTERTASKS)
   {
      return new MastertasksDao().getMastertasks(mASTERTASKS);
   }
}