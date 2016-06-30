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
@Table(name = "GROUPPRIVMAPPING")
public class Groupprivmapping
{

   private Integer GROUPPRIVMAPPING_ID;
   private String ID;
   private String GROUPID;
   private String PRIVILEGEID;
   private Privilege privilege;
   private Grouptbl grouptbl;

   @Id
   @GeneratedValue
   @Column(name = "GROUPPRIVMAPPING_ID")
   public Integer getGROUPPRIVMAPPING_ID()
   {
      return GROUPPRIVMAPPING_ID;
   }

   public void setGROUPPRIVMAPPING_ID(Integer GROUPPRIVMAPPING_ID)
   {
      this.GROUPPRIVMAPPING_ID = GROUPPRIVMAPPING_ID;
   }

   @Column(name = "ID")
   public String getID()
   {
      return ID;
   }

   public void setID(String ID)
   {
      this.ID = ID;
   }

   @Column(name = "GROUPID")
   public String getGROUPID()
   {
      return GROUPID;
   }

   public void setGROUPID(String GROUPID)
   {
      this.GROUPID = GROUPID;
   }

   @Column(name = "PRIVILEGEID")
   public String getPRIVILEGEID()
   {
      return PRIVILEGEID;
   }

   public void setPRIVILEGEID(String PRIVILEGEID)
   {
      this.PRIVILEGEID = PRIVILEGEID;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
   @JoinColumn(name = "PRIVILEGE_ID")
   public Privilege getPrivilege()
   {
      return privilege;
   }

   public void setPrivilege(Privilege privilege)
   {
      this.privilege = privilege;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
   @JoinColumn(name = "GROUPTBL_ID")
   public Grouptbl getGrouptbl()
   {
      return grouptbl;
   }

   public void setGrouptbl(Grouptbl grouptbl)
   {
      this.grouptbl = grouptbl;
   }
}