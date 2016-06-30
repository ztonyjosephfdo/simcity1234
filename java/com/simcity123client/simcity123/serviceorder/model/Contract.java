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
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Table(name = "CONTRACT")
public class Contract
{

   private Integer Contract_ID;
   private Integer CONTRACT_NUM;
   private String CONTRACT_NAME;
   private String DESCRIPTION;
   private Integer BPID;
   private Date CREATEDDATE;
   private String CREATEDBY;
   private Date LASTUPDATEDDATE;
   private Integer LASTUPDATEDBY;
   private Integer ETL_TRANS;
   private Customer customer;
   private Set<Serviceorder> serviceorder;

   @Id
   @GeneratedValue
   @Column(name = "CONTRACT_ID")
   public Integer getContract_ID()
   {
      return Contract_ID;
   }

   public void setContract_ID(Integer Contract_ID)
   {
      this.Contract_ID = Contract_ID;
   }

   @Column(name = "CONTRACT_NUM")
   public Integer getCONTRACT_NUM()
   {
      return CONTRACT_NUM;
   }

   public void setCONTRACT_NUM(Integer CONTRACT_NUM)
   {
      this.CONTRACT_NUM = CONTRACT_NUM;
   }

   @Column(name = "CONTRACT_NAME")
   public String getCONTRACT_NAME()
   {
      return CONTRACT_NAME;
   }

   public void setCONTRACT_NAME(String CONTRACT_NAME)
   {
      this.CONTRACT_NAME = CONTRACT_NAME;
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

   @Column(name = "BPID")
   public Integer getBPID()
   {
      return BPID;
   }

   public void setBPID(Integer BPID)
   {
      this.BPID = BPID;
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

   @Column(name = "CREATEDBY")
   public String getCREATEDBY()
   {
      return CREATEDBY;
   }

   public void setCREATEDBY(String CREATEDBY)
   {
      this.CREATEDBY = CREATEDBY;
   }

   @Column(name = "LASTUPDATEDDATE")
   public Date getLASTUPDATEDDATE()
   {
      return LASTUPDATEDDATE;
   }

   public void setLASTUPDATEDDATE(Date LASTUPDATEDDATE)
   {
      this.LASTUPDATEDDATE = LASTUPDATEDDATE;
   }

   @Column(name = "LASTUPDATEDBY")
   public Integer getLASTUPDATEDBY()
   {
      return LASTUPDATEDBY;
   }

   public void setLASTUPDATEDBY(Integer LASTUPDATEDBY)
   {
      this.LASTUPDATEDBY = LASTUPDATEDBY;
   }

   @Column(name = "ETL_TRANS")
   public Integer getETL_TRANS()
   {
      return ETL_TRANS;
   }

   public void setETL_TRANS(Integer ETL_TRANS)
   {
      this.ETL_TRANS = ETL_TRANS;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
   @JoinColumn(name = "BPID_ID")
   public Customer getCustomer()
   {
      return customer;
   }

   public void setCustomer(Customer customer)
   {
      this.customer = customer;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "contract")
   public Set<Serviceorder> getServiceorder()
   {
      return serviceorder;
   }

   public void setServiceorder(Set<Serviceorder> serviceorder)
   {
      this.serviceorder = serviceorder;
   }
}