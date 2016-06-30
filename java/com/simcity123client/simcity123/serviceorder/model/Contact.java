package com.simcity123client.simcity123.serviceorder.model;

import com.simcity123client.simcity123.serviceorder.model.*;
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

@Entity
@Table(name = "CONTACT")
public class Contact
{

   private Integer CONTACT_ID;
   private String CONTACTNAME;
   private Integer CONTATPHONE;
   private Integer CONTACTEMAIL;
   private Integer LASTNAME;
   private String LOCATION;
   private Integer BPID;
   private Date RECORD_CREATE_DATE;
   private String RECORD_CREATE_BY;
   private Date RECORD_LASTUPDATED_DATE;
   private String RECORD_LASTUPDATED_BY;
   private Integer CONTACTPHONEEXTENSION;
   private Customer customer;

   @Id
   @GeneratedValue
   @Column(name = "CONTACT_ID")
   public Integer getCONTACT_ID()
   {
      return CONTACT_ID;
   }

   public void setCONTACT_ID(Integer CONTACT_ID)
   {
      this.CONTACT_ID = CONTACT_ID;
   }

   @Column(name = "CONTACTNAME")
   public String getCONTACTNAME()
   {
      return CONTACTNAME;
   }

   public void setCONTACTNAME(String CONTACTNAME)
   {
      this.CONTACTNAME = CONTACTNAME;
   }

   @Column(name = "CONTATPHONE")
   public Integer getCONTATPHONE()
   {
      return CONTATPHONE;
   }

   public void setCONTATPHONE(Integer CONTATPHONE)
   {
      this.CONTATPHONE = CONTATPHONE;
   }

   @Column(name = "CONTACTEMAIL")
   public Integer getCONTACTEMAIL()
   {
      return CONTACTEMAIL;
   }

   public void setCONTACTEMAIL(Integer CONTACTEMAIL)
   {
      this.CONTACTEMAIL = CONTACTEMAIL;
   }

   @Column(name = "LASTNAME")
   public Integer getLASTNAME()
   {
      return LASTNAME;
   }

   public void setLASTNAME(Integer LASTNAME)
   {
      this.LASTNAME = LASTNAME;
   }

   @Column(name = "LOCATION")
   public String getLOCATION()
   {
      return LOCATION;
   }

   public void setLOCATION(String LOCATION)
   {
      this.LOCATION = LOCATION;
   }

   @Column(name = "BPID")
   public Integer getBPID()
   {
      return BPID;
   }

   public void setBPID(Integer BPID)
   {
      this.BPID = BPID;
   }

   @Column(name = "RECORD_CREATE_DATE")
   public Date getRECORD_CREATE_DATE()
   {
      return RECORD_CREATE_DATE;
   }

   public void setRECORD_CREATE_DATE(Date RECORD_CREATE_DATE)
   {
      this.RECORD_CREATE_DATE = RECORD_CREATE_DATE;
   }

   @Column(name = "RECORD_CREATE_BY")
   public String getRECORD_CREATE_BY()
   {
      return RECORD_CREATE_BY;
   }

   public void setRECORD_CREATE_BY(String RECORD_CREATE_BY)
   {
      this.RECORD_CREATE_BY = RECORD_CREATE_BY;
   }

   @Column(name = "RECORD_LASTUPDATED_DATE")
   public Date getRECORD_LASTUPDATED_DATE()
   {
      return RECORD_LASTUPDATED_DATE;
   }

   public void setRECORD_LASTUPDATED_DATE(Date RECORD_LASTUPDATED_DATE)
   {
      this.RECORD_LASTUPDATED_DATE = RECORD_LASTUPDATED_DATE;
   }

   @Column(name = "RECORD_LASTUPDATED_BY")
   public String getRECORD_LASTUPDATED_BY()
   {
      return RECORD_LASTUPDATED_BY;
   }

   public void setRECORD_LASTUPDATED_BY(String RECORD_LASTUPDATED_BY)
   {
      this.RECORD_LASTUPDATED_BY = RECORD_LASTUPDATED_BY;
   }

   @Column(name = "CONTACTPHONEEXTENSION")
   public Integer getCONTACTPHONEEXTENSION()
   {
      return CONTACTPHONEEXTENSION;
   }

   public void setCONTACTPHONEEXTENSION(Integer CONTACTPHONEEXTENSION)
   {
      this.CONTACTPHONEEXTENSION = CONTACTPHONEEXTENSION;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToOne
   @JoinColumn(name = "BPID_ID")
   public Customer getCustomer()
   {
      return customer;
   }

   public void setCustomer(Customer customer)
   {
      this.customer = customer;
   }
}