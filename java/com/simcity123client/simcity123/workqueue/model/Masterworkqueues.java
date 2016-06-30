package com.simcity123client.simcity123.workqueue.model;

import com.simcity123client.simcity123.workqueue.model.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.CascadeType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Table(name = "MASTERWORKQUEUES")
public class Masterworkqueues
{

   private Integer MASTERWORKQUEUES_ID;
   private String QUEUE_ID;
   private String QUEUENAME;
   private String DESCRIPTION;
   private String ACTIVE;
   private String PRIORITY;
   private String ASSIGNTYPE;
   private Set<Masterrules> masterrules;
   private Set<Worktasks> worktasks;

   @Id
   @GeneratedValue
   @Column(name = "MASTERWORKQUEUES_ID")
   public Integer getMASTERWORKQUEUES_ID()
   {
      return MASTERWORKQUEUES_ID;
   }

   public void setMASTERWORKQUEUES_ID(Integer MASTERWORKQUEUES_ID)
   {
      this.MASTERWORKQUEUES_ID = MASTERWORKQUEUES_ID;
   }

   @Column(name = "QUEUE_ID")
   public String getQUEUE_ID()
   {
      return QUEUE_ID;
   }

   public void setQUEUE_ID(String QUEUE_ID)
   {
      this.QUEUE_ID = QUEUE_ID;
   }

   @Column(name = "QUEUENAME")
   public String getQUEUENAME()
   {
      return QUEUENAME;
   }

   public void setQUEUENAME(String QUEUENAME)
   {
      this.QUEUENAME = QUEUENAME;
   }

   @Column(name = "DESCRIPTION")
   public String getDESCRIPTION()
   {
      return DESCRIPTION;
   }

   public void setDESCRIPTION(String DESCRIPTION)
   {
      this.DESCRIPTION = DESCRIPTION;
   }

   @Column(name = "ACTIVE")
   public String getACTIVE()
   {
      return ACTIVE;
   }

   public void setACTIVE(String ACTIVE)
   {
      this.ACTIVE = ACTIVE;
   }

   @Column(name = "PRIORITY")
   public String getPRIORITY()
   {
      return PRIORITY;
   }

   public void setPRIORITY(String PRIORITY)
   {
      this.PRIORITY = PRIORITY;
   }

   @Column(name = "ASSIGNTYPE")
   public String getASSIGNTYPE()
   {
      return ASSIGNTYPE;
   }

   public void setASSIGNTYPE(String ASSIGNTYPE)
   {
      this.ASSIGNTYPE = ASSIGNTYPE;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "masterworkqueues")
   public Set<Masterrules> getMasterrules()
   {
      return masterrules;
   }

   public void setMasterrules(Set<Masterrules> masterrules)
   {
      this.masterrules = masterrules;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "masterworkqueues")
   public Set<Worktasks> getWorktasks()
   {
      return worktasks;
   }

   public void setWorktasks(Set<Worktasks> worktasks)
   {
      this.worktasks = worktasks;
   }
}