package com.simcity123client.simcity123.workqueue.impl;

import com.simcity123client.simcity123.workqueue.model.Worktasks;
import com.simcity123client.simcity123.workqueue.dao.WorktasksDao;
import java.util.List;
import org.apache.log4j.Logger;

public class WorktasksImpl
{

   public List getWorktasks(Worktasks wORKTASKS)
   {
      return new WorktasksDao().getWorktasks(wORKTASKS);
   }
}