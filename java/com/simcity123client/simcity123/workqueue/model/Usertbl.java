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
@Table(name = "USERTBL")
public class Usertbl
{

   private Integer USERTBL_ID;
   private String USERID;
   private String FIRSTNAME;
   private String LASTNAME;
   private String EMAIL;
   private String ACTIVE;
   private Set<Usergroupprivmapping> usergroupprivmapping;
   private Set<Worktasks> worktasks;

   @Id
   @GeneratedValue
   @Column(name = "USERTBL_ID")
   public Integer getUSERTBL_ID()
   {
      return USERTBL_ID;
   }

   public void setUSERTBL_ID(Integer USERTBL_ID)
   {
      this.USERTBL_ID = USERTBL_ID;
   }

   @Column(name = "USERID")
   public String getUSERID()
   {
      return USERID;
   }

   public void setUSERID(String USERID)
   {
      this.USERID = USERID;
   }

   @Column(name = "FIRSTNAME")
   public String getFIRSTNAME()
   {
      return FIRSTNAME;
   }

   public void setFIRSTNAME(String FIRSTNAME)
   {
      this.FIRSTNAME = FIRSTNAME;
   }

   @Column(name = "LASTNAME")
   public String getLASTNAME()
   {
      return LASTNAME;
   }

   public void setLASTNAME(String LASTNAME)
   {
      this.LASTNAME = LASTNAME;
   }

   @Column(name = "EMAIL")
   public String getEMAIL()
   {
      return EMAIL;
   }

   public void setEMAIL(String EMAIL)
   {
      this.EMAIL = EMAIL;
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

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "usertbl")
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
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "usertbl")
   public Set<Worktasks> getWorktasks()
   {
      return worktasks;
   }

   public void setWorktasks(Set<Worktasks> worktasks)
   {
      this.worktasks = worktasks;
   }
}