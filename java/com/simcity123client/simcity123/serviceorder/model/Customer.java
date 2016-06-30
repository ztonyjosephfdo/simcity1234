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
import javax.persistence.OneToMany;
import java.util.Set;
import javax.persistence.OneToOne;

@Entity
@Table(name = "CUSTOMER")
public class Customer
{

   private Integer BPID_ID;
   private String CUSTOMERNAME;
   private String STATUS;
   private Integer SELFREGISTRATIONALLOWED;
   private Date RECORD_CREATE_DATE;
   private String RECORD_CREATE_BY;
   private Integer STATUS_CHANGE_DATE;
   private String ETL_TRANS;
   private Set<Contract> contract;
   private Contact contact;

   @Id
   @GeneratedValue
   @Column(name = "BPID_ID")
   public Integer getBPID_ID()
   {
      return BPID_ID;
   }

   public void setBPID_ID(Integer BPID_ID)
   {
      this.BPID_ID = BPID_ID;
   }

   @Column(name = "CUSTOMERNAME")
   public String getCUSTOMERNAME()
   {
      return CUSTOMERNAME;
   }

   public void setCUSTOMERNAME(String CUSTOMERNAME)
   {
      this.CUSTOMERNAME = CUSTOMERNAME;
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

   @Column(name = "SELFREGISTRATIONALLOWED")
   public Integer getSELFREGISTRATIONALLOWED()
   {
      return SELFREGISTRATIONALLOWED;
   }

   public void setSELFREGISTRATIONALLOWED(Integer SELFREGISTRATIONALLOWED)
   {
      this.SELFREGISTRATIONALLOWED = SELFREGISTRATIONALLOWED;
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

   @Column(name = "STATUS_CHANGE_DATE")
   public Integer getSTATUS_CHANGE_DATE()
   {
      return STATUS_CHANGE_DATE;
   }

   public void setSTATUS_CHANGE_DATE(Integer STATUS_CHANGE_DATE)
   {
      this.STATUS_CHANGE_DATE = STATUS_CHANGE_DATE;
   }

   @Column(name = "ETL_TRANS")
   public String getETL_TRANS()
   {
      return ETL_TRANS;
   }

   public void setETL_TRANS(String ETL_TRANS)
   {
      this.ETL_TRANS = ETL_TRANS;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
   public Set<Contract> getContract()
   {
      return contract;
   }

   public void setContract(Set<Contract> contract)
   {
      this.contract = contract;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
   public Contact getContact()
   {
      return contact;
   }

   public void setContact(Contact contact)
   {
      this.contact = contact;
   }
}