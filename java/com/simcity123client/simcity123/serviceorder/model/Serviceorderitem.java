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
@Table(name = "SERVICEORDERITEM")
public class Serviceorderitem
{

   private Integer SOI_ID;
   private Integer PARENT_ORDER_ID;
   private String SOINUMBER;
   private Date SERVICE_ITEM_NAME;
   private Date CREATEDDATE;
   private String CREATEDBY;
   private Date LASTUPDATEDDATE;
   private String LASTUPDATEDBY;
   private Integer SOURCE_SYSTEM_ID;
   private Date RECORD_CREATE_DATE;
   private String RECORD_CREATE_BY;
   private Date RECORD_LASTUPDATED_DATE;
   private String RECORD_LASTUPDATED_BY;
   private Date REQUESTED_CANCEL_DATE;
   private Integer ORD_ITEM_STATUS_IDENTIFIER;
   private Integer SITEID;
   private Serviceorder serviceorder;
   private Set<Serviceorderitemattribute> serviceorderitemattribute;

   @Id
   @GeneratedValue
   @Column(name = "SOI_ID")
   public Integer getSOI_ID()
   {
      return SOI_ID;
   }

   public void setSOI_ID(Integer SOI_ID)
   {
      this.SOI_ID = SOI_ID;
   }

   @Column(name = "PARENT_ORDER_ID")
   public Integer getPARENT_ORDER_ID()
   {
      return PARENT_ORDER_ID;
   }

   public void setPARENT_ORDER_ID(Integer PARENT_ORDER_ID)
   {
      this.PARENT_ORDER_ID = PARENT_ORDER_ID;
   }

   @Column(name = "SOINUMBER")
   public String getSOINUMBER()
   {
      return SOINUMBER;
   }

   public void setSOINUMBER(String SOINUMBER)
   {
      this.SOINUMBER = SOINUMBER;
   }

   @Column(name = "SERVICE_ITEM_NAME")
   public Date getSERVICE_ITEM_NAME()
   {
      return SERVICE_ITEM_NAME;
   }

   public void setSERVICE_ITEM_NAME(Date SERVICE_ITEM_NAME)
   {
      this.SERVICE_ITEM_NAME = SERVICE_ITEM_NAME;
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
   public String getLASTUPDATEDBY()
   {
      return LASTUPDATEDBY;
   }

   public void setLASTUPDATEDBY(String LASTUPDATEDBY)
   {
      this.LASTUPDATEDBY = LASTUPDATEDBY;
   }

   @Column(name = "SOURCE_SYSTEM_ID")
   public Integer getSOURCE_SYSTEM_ID()
   {
      return SOURCE_SYSTEM_ID;
   }

   public void setSOURCE_SYSTEM_ID(Integer SOURCE_SYSTEM_ID)
   {
      this.SOURCE_SYSTEM_ID = SOURCE_SYSTEM_ID;
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

   @Column(name = "REQUESTED_CANCEL_DATE")
   public Date getREQUESTED_CANCEL_DATE()
   {
      return REQUESTED_CANCEL_DATE;
   }

   public void setREQUESTED_CANCEL_DATE(Date REQUESTED_CANCEL_DATE)
   {
      this.REQUESTED_CANCEL_DATE = REQUESTED_CANCEL_DATE;
   }

   @Column(name = "ORD_ITEM_STATUS_IDENTIFIER")
   public Integer getORD_ITEM_STATUS_IDENTIFIER()
   {
      return ORD_ITEM_STATUS_IDENTIFIER;
   }

   public void setORD_ITEM_STATUS_IDENTIFIER(Integer ORD_ITEM_STATUS_IDENTIFIER)
   {
      this.ORD_ITEM_STATUS_IDENTIFIER = ORD_ITEM_STATUS_IDENTIFIER;
   }

   @Column(name = "SITEID")
   public Integer getSITEID()
   {
      return SITEID;
   }

   public void setSITEID(Integer SITEID)
   {
      this.SITEID = SITEID;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
   @JoinColumn(name = "ORDER_ID")
   public Serviceorder getServiceorder()
   {
      return serviceorder;
   }

   public void setServiceorder(Serviceorder serviceorder)
   {
      this.serviceorder = serviceorder;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceorderitem")
   public Set<Serviceorderitemattribute> getServiceorderitemattribute()
   {
      return serviceorderitemattribute;
   }

   public void setServiceorderitemattribute(
         Set<Serviceorderitemattribute> serviceorderitemattribute)
   {
      this.serviceorderitemattribute = serviceorderitemattribute;
   }
}