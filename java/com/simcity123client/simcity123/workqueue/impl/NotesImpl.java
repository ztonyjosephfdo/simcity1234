package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Notes;
import com.simcity123client.simcity123.workqueue.dao.NotesDao;
import java.util.List;
import org.apache.log4j.Logger;

public class NotesImpl
{

   public List getNotes(Notes nOTES)
   {
      return new NotesDao().getNotes(nOTES);
   }
}