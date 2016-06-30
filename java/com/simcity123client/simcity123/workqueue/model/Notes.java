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

@Entity
@Table(name = "NOTES")
public class Notes
{

   private Integer NOTES_ID;
   private String NOTE_ID;
   private String WORKTASK_ID;
   private Date CREATEDDATE;
   private String NOTESDATA;
   private Worktasks worktasks;

   @Id
   @GeneratedValue
   @Column(name = "NOTES_ID")
   public Integer getNOTES_ID()
   {
      return NOTES_ID;
   }

   public void setNOTES_ID(Integer NOTES_ID)
   {
      this.NOTES_ID = NOTES_ID;
   }

   @Column(name = "NOTE_ID")
   public String getNOTE_ID()
   {
      return NOTE_ID;
   }

   public void setNOTE_ID(String NOTE_ID)
   {
      this.NOTE_ID = NOTE_ID;
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

   @Column(name = "CREATEDDATE")
   public Date getCREATEDDATE()
   {
      return CREATEDDATE;
   }

   public void setCREATEDDATE(Date CREATEDDATE)
   {
      this.CREATEDDATE = CREATEDDATE;
   }

   @Column(name = "NOTESDATA")
   public String getNOTESDATA()
   {
      return NOTESDATA;
   }

   public void setNOTESDATA(String NOTESDATA)
   {
      this.NOTESDATA = NOTESDATA;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
   @JoinColumn(name = "WORKTASKS_ID")
   public Worktasks getWorktasks()
   {
      return worktasks;
   }

   public void setWorktasks(Worktasks worktasks)
   {
      this.worktasks = worktasks;
   }
}