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
@Table(name = "PRIVILEGE")
public class Privilege
{

   private Integer PRIVILEGE_ID;
   private String PRIVILEGEID;
   private String PRIVILEGENAME;
   private String DESCRIPTION;
   private Set<Usergroupprivmapping> usergroupprivmapping;
   private Set<Groupprivmapping> groupprivmapping;

   @Id
   @GeneratedValue
   @Column(name = "PRIVILEGE_ID")
   public Integer getPRIVILEGE_ID()
   {
      return PRIVILEGE_ID;
   }

   public void setPRIVILEGE_ID(Integer PRIVILEGE_ID)
   {
      this.PRIVILEGE_ID = PRIVILEGE_ID;
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

   @Column(name = "PRIVILEGENAME")
   public String getPRIVILEGENAME()
   {
      return PRIVILEGENAME;
   }

   public void setPRIVILEGENAME(String PRIVILEGENAME)
   {
      this.PRIVILEGENAME = PRIVILEGENAME;
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
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "privilege")
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
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "privilege")
   public Set<Groupprivmapping> getGroupprivmapping()
   {
      return groupprivmapping;
   }

   public void setGroupprivmapping(Set<Groupprivmapping> groupprivmapping)
   {
      this.groupprivmapping = groupprivmapping;
   }
}