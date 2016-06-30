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
@Table(name = "GROUPTBL")
public class Grouptbl
{

   private Integer GROUPTBL_ID;
   private String GROUPID;
   private String GROUPNAME;
   private String DESCRIPTION;
   private Set<Usergroupprivmapping> usergroupprivmapping;
   private Set<Groupprivmapping> groupprivmapping;

   @Id
   @GeneratedValue
   @Column(name = "GROUPTBL_ID")
   public Integer getGROUPTBL_ID()
   {
      return GROUPTBL_ID;
   }

   public void setGROUPTBL_ID(Integer GROUPTBL_ID)
   {
      this.GROUPTBL_ID = GROUPTBL_ID;
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

   @Column(name = "GROUPNAME")
   public String getGROUPNAME()
   {
      return GROUPNAME;
   }

   public void setGROUPNAME(String GROUPNAME)
   {
      this.GROUPNAME = GROUPNAME;
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

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "grouptbl")
   public Set<Usergroupprivmapping> getUsergroupprivmapping()
   {
      return usergroupprivmapping;
   }

   public void setUsergroupprivmapping(
         Set<Usergroupprivmapping> usergroupprivmapping)
   {
      this.usergroupprivmapping = usergroupprivmapping;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "grouptbl")
   public Set<Groupprivmapping> getGroupprivmapping()
   {
      return groupprivmapping;
   }

   public void setGroupprivmapping(Set<Groupprivmapping> groupprivmapping)
   {
      this.groupprivmapping = groupprivmapping;
   }
}