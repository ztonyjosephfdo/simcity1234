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
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "MASTERRULES")
public class Masterrules
{

   private Integer MASTERRULES_ID;
   private String RULENAME;
   private String RESOURCE;
   private String RULE_EVENT;
   private String TASK_ID;
   private String CONDITION1;
   private String CONDITION2;
   private String ASSIGNTO;
   private String SELECTQUEUE;
   private String PRIORITY;
   private Date DUEDATE;
   private String AUTOASSIGN;
   private Date CREATEDDATE;
   private String DESCRIPTION;
   private String ACTIVE;
   private String RULE_ORDER;
   private String VALUE;
   private String RETRYCOUNT;
   private String CAUSE;
   private String HELP;
   private Mastertasks mastertasks;
   private Masterworkqueues masterworkqueues;

   @Id
   @GeneratedValue
   @Column(name = "MASTERRULES_ID")
   public Integer getMASTERRULES_ID()
   {
      return MASTERRULES_ID;
   }

   public void setMASTERRULES_ID(Integer MASTERRULES_ID)
   {
      this.MASTERRULES_ID = MASTERRULES_ID;
   }

   @Column(name = "RULENAME")
   public String getRULENAME()
   {
      return RULENAME;
   }

   public void setRULENAME(String RULENAME)
   {
      this.RULENAME = RULENAME;
   }

   @Column(name = "RESOURCE")
   public String getRESOURCE()
   {
      return RESOURCE;
   }

   public void setRESOURCE(String RESOURCE)
   {
      this.RESOURCE = RESOURCE;
   }

   @Column(name = "RULE_EVENT")
   public String getRULE_EVENT()
   {
      return RULE_EVENT;
   }

   public void setRULE_EVENT(String RULE_EVENT)
   {
      this.RULE_EVENT = RULE_EVENT;
   }

   @Column(name = "TASK_ID")
   public String getTASK_ID()
   {
      return TASK_ID;
   }

   public void setTASK_ID(String TASK_ID)
   {
      this.TASK_ID = TASK_ID;
   }

   @Column(name = "CONDITION1")
   public String getCONDITION1()
   {
      return CONDITION1;
   }

   public void setCONDITION1(String CONDITION1)
   {
      this.CONDITION1 = CONDITION1;
   }

   @Column(name = "CONDITION2")
   public String getCONDITION2()
   {
      return CONDITION2;
   }

   public void setCONDITION2(String CONDITION2)
   {
      this.CONDITION2 = CONDITION2;
   }

   @Column(name = "ASSIGNTO")
   public String getASSIGNTO()
   {
      return ASSIGNTO;
   }

   public void setASSIGNTO(String ASSIGNTO)
   {
      this.ASSIGNTO = ASSIGNTO;
   }

   @Column(name = "SELECTQUEUE")
   public String getSELECTQUEUE()
   {
      return SELECTQUEUE;
   }

   public void setSELECTQUEUE(String SELECTQUEUE)
   {
      this.SELECTQUEUE = SELECTQUEUE;
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

   @Column(name = "DUEDATE")
   public Date getDUEDATE()
   {
      return DUEDATE;
   }

   public void setDUEDATE(Date DUEDATE)
   {
      this.DUEDATE = DUEDATE;
   }

   @Column(name = "AUTOASSIGN")
   public String getAUTOASSIGN()
   {
      return AUTOASSIGN;
   }

   public void setAUTOASSIGN(String AUTOASSIGN)
   {
      this.AUTOASSIGN = AUTOASSIGN;
   }

   @Column(name = "CREATEDDATE")
   public Date getCREATEDDATE()
   {
      return CREATEDDATE;
   }

   public void setCREATEDDATE(Date CREATEDDATE)
   {
      this.CREATEDDATE = CREATEDDATE;
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

   @Column(name = "RULE_ORDER")
   public String getRULE_ORDER()
   {
      return RULE_ORDER;
   }

   public void setRULE_ORDER(String RULE_ORDER)
   {
      this.RULE_ORDER = RULE_ORDER;
   }

   @Column(name = "VALUE")
   public String getVALUE()
   {
      return VALUE;
   }

   public void setVALUE(String VALUE)
   {
      this.VALUE = VALUE;
   }

   @Column(name = "RETRYCOUNT")
   public String getRETRYCOUNT()
   {
      return RETRYCOUNT;
   }

   public void setRETRYCOUNT(String RETRYCOUNT)
   {
      this.RETRYCOUNT = RETRYCOUNT;
   }

   @Column(name = "CAUSE")
   public String getCAUSE()
   {
      return CAUSE;
   }

   public void setCAUSE(String CAUSE)
   {
      this.CAUSE = CAUSE;
   }

   @Column(name = "HELP")
   public String getHELP()
   {
      return HELP;
   }

   public void setHELP(String HELP)
   {
      this.HELP = HELP;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToOne
   @JoinColumn(name = "ID_TEXTCLASSNAME")
   public Mastertasks getMastertasks()
   {
      return mastertasks;
   }

   public void setMastertasks(Mastertasks mastertasks)
   {
      this.mastertasks = mastertasks;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
   @JoinColumn(name = "MASTERWORKQUEUES_ID")
   public Masterworkqueues getMasterworkqueues()
   {
      return masterworkqueues;
   }

   public void setMasterworkqueues(Masterworkqueues masterworkqueues)
   {
      this.masterworkqueues = masterworkqueues;
   }
}