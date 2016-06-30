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
import javax.persistence.OneToOne;

@Entity
@Table(name = "MASTERTASKS")
public class Mastertasks
{

   private Integer Id_textClassName;
   private String TASK_ID;
   private String TASK_NAME;
   private Set<Worktasks> worktasks;
   private Masterrules masterrules;

   @Id
   @GeneratedValue
   @Column(name = "ID_TEXTCLASSNAME")
   public Integer getId_textClassName()
   {
      return Id_textClassName;
   }

   public void setId_textClassName(Integer Id_textClassName)
   {
      this.Id_textClassName = Id_textClassName;
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

   @Column(name = "TASK_NAME")
   public String getTASK_NAME()
   {
      return TASK_NAME;
   }

   public void setTASK_NAME(String TASK_NAME)
   {
      this.TASK_NAME = TASK_NAME;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "mastertasks")
   public Set<Worktasks> getWorktasks()
   {
      return worktasks;
   }

   public void setWorktasks(Set<Worktasks> worktasks)
   {
      this.worktasks = worktasks;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToOne(cascade = CascadeType.ALL, mappedBy = "mastertasks")
   public Masterrules getMasterrules()
   {
      return masterrules;
   }

   public void setMasterrules(Masterrules masterrules)
   {
      this.masterrules = masterrules;
   }
}