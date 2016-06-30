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
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Table(name = "WORKTASKS")
public class Worktasks
{

   private Integer WORKTASKS_ID;
   private String WORKTASK_ID;
   private String PROCESS_ID_REF;
   private String TASK_ID;
   private String ASSIGNEDUSER;
   private Date ASSIGNEDTIME;
   private Date CREATEDDATE;
   private String STATUS;
   private Date COMPLETEDTIME;
   private String RQST_OBJ;
   private String ACTION;
   private String PRIORITY;
   private String QUEUE_ID;
   private String ERRORCODE;
   private String ERRORDETAILS;
   private Date DUEDATE;
   private Usertbl usertbl;
   private Mastertasks mastertasks;
   private Masterworkqueues masterworkqueues;
   private Set<Notes> notes;

   @Id
   @GeneratedValue
   @Column(name = "WORKTASKS_ID")
   public Integer getWORKTASKS_ID()
   {
      return WORKTASKS_ID;
   }

   public void setWORKTASKS_ID(Integer WORKTASKS_ID)
   {
      this.WORKTASKS_ID = WORKTASKS_ID;
   }

   @Column(name = "WORKTASK_ID")
   public String getWORKTASK_ID()
   {
      return WORKTASK_ID;
   }

   public void setWORKTASK_ID(String WORKTASK_ID)
   {
      this.WORKTASK_ID = WORKTASK_ID;
   }

   @Column(name = "PROCESS_ID_REF")
   public String getPROCESS_ID_REF()
   {
      return PROCESS_ID_REF;
   }

   public void setPROCESS_ID_REF(String PROCESS_ID_REF)
   {
      this.PROCESS_ID_REF = PROCESS_ID_REF;
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

   @Column(name = "ASSIGNEDUSER")
   public String getASSIGNEDUSER()
   {
      return ASSIGNEDUSER;
   }

   public void setASSIGNEDUSER(String ASSIGNEDUSER)
   {
      this.ASSIGNEDUSER = ASSIGNEDUSER;
   }

   @Column(name = "ASSIGNEDTIME")
   public Date getASSIGNEDTIME()
   {
      return ASSIGNEDTIME;
   }

   public void setASSIGNEDTIME(Date ASSIGNEDTIME)
   {
      this.ASSIGNEDTIME = ASSIGNEDTIME;
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

   @Column(name = "STATUS")
   public String getSTATUS()
   {
      return STATUS;
   }

   public void setSTATUS(String STATUS)
   {
      this.STATUS = STATUS;
   }

   @Column(name = "COMPLETEDTIME")
   public Date getCOMPLETEDTIME()
   {
      return COMPLETEDTIME;
   }

   public void setCOMPLETEDTIME(Date COMPLETEDTIME)
   {
      this.COMPLETEDTIME = COMPLETEDTIME;
   }

   @Column(name = "RQST_OBJ")
   public String getRQST_OBJ()
   {
      return RQST_OBJ;
   }

   public void setRQST_OBJ(String RQST_OBJ)
   {
      this.RQST_OBJ = RQST_OBJ;
   }

   @Column(name = "ACTION")
   public String getACTION()
   {
      return ACTION;
   }

   public void setACTION(String ACTION)
   {
      this.ACTION = ACTION;
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

   @Column(name = "QUEUE_ID")
   public String getQUEUE_ID()
   {
      return QUEUE_ID;
   }

   public void setQUEUE_ID(String QUEUE_ID)
   {
      this.QUEUE_ID = QUEUE_ID;
   }

   @Column(name = "ERRORCODE")
   public String getERRORCODE()
   {
      return ERRORCODE;
   }

   public void setERRORCODE(String ERRORCODE)
   {
      this.ERRORCODE = ERRORCODE;
   }

   @Column(name = "ERRORDETAILS")
   public String getERRORDETAILS()
   {
      return ERRORDETAILS;
   }

   public void setERRORDETAILS(String ERRORDETAILS)
   {
      this.ERRORDETAILS = ERRORDETAILS;
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

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
   @JoinColumn(name = "USERTBL_ID")
   public Usertbl getUsertbl()
   {
      return usertbl;
   }

   public void setUsertbl(Usertbl usertbl)
   {
      this.usertbl = usertbl;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
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

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "worktasks")
   public Set<Notes> getNotes()
   {
      return notes;
   }

   public void setNotes(Set<Notes> notes)
   {
      this.notes = notes;
   }
}