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
import javax.persistence.OneToOne;

@Entity
@Table(name = "SERVICEORDER")
public class Serviceorder
{

   private Integer ORDER_ID;
   private Integer ORDER_NUMBER;
   private String CUSTOMERID;
   private Integer BPID;
   private Date COMMITEDDELIVERYDATE;
   private Date CREATEDDATE;
   private String CREATEDBY;
   private String ORDERACTIVITYTYPE;
   private Date COMPLETIONDATE;
   private Date REQUESTEDDELIVERYDATE;
   private String SERVICETYPE;
   private String SERVICEDESCRIPTION;
   private Date LASTUPDATEDDATE;
   private String LASTUPDATEDBY;
   private Integer SIID;
   private Integer REVISION;
   private Integer ORD_STATUS_ID;
   private Integer SOURCE_SYSTEM_IDENTIFIER;
   private Date RECORD_CREATE_DATE;
   private String RECORD_CREATE_BY;
   private Date RECORD_LASTUPDATED_DATE;
   private String RECORD_LASTUPDATED_BY;
   private Date REQUESTED_CANCEL_DATE;
   private Date TARGET_DELIVERY_DATE;
   private Date SERVICE_ORDER_SUBMITTED_DATE;
   private Date SERVICE_ORDER_ACKNOWLEGED_DATE;
   private Date SERVICE_ORDER_RESPONSE_DATE;
   private Date WORK_COMPLETION_NOTICE_DATE;
   private Date SERVICE_ORDER_START_DATE;
   private Integer CONTRACT_ID;
   private Integer ORDER_TRACKING_NUMBER;
   private Integer DEPARTMENT_ID;
   private String CPQ_STATUS;
   private String CPQ_STATUS_DESCRIPTION;
   private Integer SERVICEORDER_TYPE_ID;
   private String BAN;
   private Integer ETL_TRANS;
   private Integer BILLER_XREF_ORDER_ID;
   private Integer BILLER_XREF_SYSTEM_ID;
   private Contract contract;
   private Set<Serviceorderitem> service_order_item;
   private Serviceordersite service_order_site;
   private Set<Serviceorderattribute> serviceorderattribute;

   @Id
   @GeneratedValue
   @Column(name = "ORDER_ID")
   public Integer getORDER_ID()
   {
      return ORDER_ID;
   }

   public void setORDER_ID(Integer ORDER_ID)
   {
      this.ORDER_ID = ORDER_ID;
   }

   @Column(name = "ORDER_NUMBER")
   public Integer getORDER_NUMBER()
   {
      return ORDER_NUMBER;
   }

   public void setORDER_NUMBER(Integer ORDER_NUMBER)
   {
      this.ORDER_NUMBER = ORDER_NUMBER;
   }

   @Column(name = "CUSTOMERID")
   public String getCUSTOMERID()
   {
      return CUSTOMERID;
   }

   public void setCUSTOMERID(String CUSTOMERID)
   {
      this.CUSTOMERID = CUSTOMERID;
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

   @Column(name = "COMMITEDDELIVERYDATE")
   public Date getCOMMITEDDELIVERYDATE()
   {
      return COMMITEDDELIVERYDATE;
   }

   public void setCOMMITEDDELIVERYDATE(Date COMMITEDDELIVERYDATE)
   {
      this.COMMITEDDELIVERYDATE = COMMITEDDELIVERYDATE;
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

   @Column(name = "ORDERACTIVITYTYPE")
   public String getORDERACTIVITYTYPE()
   {
      return ORDERACTIVITYTYPE;
   }

   public void setORDERACTIVITYTYPE(String ORDERACTIVITYTYPE)
   {
      this.ORDERACTIVITYTYPE = ORDERACTIVITYTYPE;
   }

   @Column(name = "COMPLETIONDATE")
   public Date getCOMPLETIONDATE()
   {
      return COMPLETIONDATE;
   }

   public void setCOMPLETIONDATE(Date COMPLETIONDATE)
   {
      this.COMPLETIONDATE = COMPLETIONDATE;
   }

   @Column(name = "REQUESTEDDELIVERYDATE")
   public Date getREQUESTEDDELIVERYDATE()
   {
      return REQUESTEDDELIVERYDATE;
   }

   public void setREQUESTEDDELIVERYDATE(Date REQUESTEDDELIVERYDATE)
   {
      this.REQUESTEDDELIVERYDATE = REQUESTEDDELIVERYDATE;
   }

   @Column(name = "SERVICETYPE")
   public String getSERVICETYPE()
   {
      return SERVICETYPE;
   }

   public void setSERVICETYPE(String SERVICETYPE)
   {
      this.SERVICETYPE = SERVICETYPE;
   }

   @Column(name = "SERVICEDESCRIPTION")
   public String getSERVICEDESCRIPTION()
   {
      return SERVICEDESCRIPTION;
   }

   public void setSERVICEDESCRIPTION(String SERVICEDESCRIPTION)
   {
      this.SERVICEDESCRIPTION = SERVICEDESCRIPTION;
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

   @Column(name = "SIID")
   public Integer getSIID()
   {
      return SIID;
   }

   public void setSIID(Integer SIID)
   {
      this.SIID = SIID;
   }

   @Column(name = "REVISION")
   public Integer getREVISION()
   {
      return REVISION;
   }

   public void setREVISION(Integer REVISION)
   {
      this.REVISION = REVISION;
   }

   @Column(name = "ORD_STATUS_ID")
   public Integer getORD_STATUS_ID()
   {
      return ORD_STATUS_ID;
   }

   public void setORD_STATUS_ID(Integer ORD_STATUS_ID)
   {
      this.ORD_STATUS_ID = ORD_STATUS_ID;
   }

   @Column(name = "SOURCE_SYSTEM_IDENTIFIER")
   public Integer getSOURCE_SYSTEM_IDENTIFIER()
   {
      return SOURCE_SYSTEM_IDENTIFIER;
   }

   public void setSOURCE_SYSTEM_IDENTIFIER(Integer SOURCE_SYSTEM_IDENTIFIER)
   {
      this.SOURCE_SYSTEM_IDENTIFIER = SOURCE_SYSTEM_IDENTIFIER;
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

   @Column(name = "TARGET_DELIVERY_DATE")
   public Date getTARGET_DELIVERY_DATE()
   {
      return TARGET_DELIVERY_DATE;
   }

   public void setTARGET_DELIVERY_DATE(Date TARGET_DELIVERY_DATE)
   {
      this.TARGET_DELIVERY_DATE = TARGET_DELIVERY_DATE;
   }

   @Column(name = "SERVICE_ORDER_SUBMITTED_DATE")
   public Date getSERVICE_ORDER_SUBMITTED_DATE()
   {
      return SERVICE_ORDER_SUBMITTED_DATE;
   }

   public void setSERVICE_ORDER_SUBMITTED_DATE(
         Date SERVICE_ORDER_SUBMITTED_DATE)
   {
      this.SERVICE_ORDER_SUBMITTED_DATE = SERVICE_ORDER_SUBMITTED_DATE;
   }

   @Column(name = "SERVICE_ORDER_ACKNOWLEGED_DATE")
   public Date getSERVICE_ORDER_ACKNOWLEGED_DATE()
   {
      return SERVICE_ORDER_ACKNOWLEGED_DATE;
   }

   public void setSERVICE_ORDER_ACKNOWLEGED_DATE(
         Date SERVICE_ORDER_ACKNOWLEGED_DATE)
   {
      this.SERVICE_ORDER_ACKNOWLEGED_DATE = SERVICE_ORDER_ACKNOWLEGED_DATE;
   }

   @Column(name = "SERVICE_ORDER_RESPONSE_DATE")
   public Date getSERVICE_ORDER_RESPONSE_DATE()
   {
      return SERVICE_ORDER_RESPONSE_DATE;
   }

   public void setSERVICE_ORDER_RESPONSE_DATE(Date SERVICE_ORDER_RESPONSE_DATE)
   {
      this.SERVICE_ORDER_RESPONSE_DATE = SERVICE_ORDER_RESPONSE_DATE;
   }

   @Column(name = "WORK_COMPLETION_NOTICE_DATE")
   public Date getWORK_COMPLETION_NOTICE_DATE()
   {
      return WORK_COMPLETION_NOTICE_DATE;
   }

   public void setWORK_COMPLETION_NOTICE_DATE(Date WORK_COMPLETION_NOTICE_DATE)
   {
      this.WORK_COMPLETION_NOTICE_DATE = WORK_COMPLETION_NOTICE_DATE;
   }

   @Column(name = "SERVICE_ORDER_START_DATE")
   public Date getSERVICE_ORDER_START_DATE()
   {
      return SERVICE_ORDER_START_DATE;
   }

   public void setSERVICE_ORDER_START_DATE(Date SERVICE_ORDER_START_DATE)
   {
      this.SERVICE_ORDER_START_DATE = SERVICE_ORDER_START_DATE;
   }

   @Column(name = "CONTRACT_ID")
   public Integer getCONTRACT_ID()
   {
      return CONTRACT_ID;
   }

   public void setCONTRACT_ID(Integer CONTRACT_ID)
   {
      this.CONTRACT_ID = CONTRACT_ID;
   }

   @Column(name = "ORDER_TRACKING_NUMBER")
   public Integer getORDER_TRACKING_NUMBER()
   {
      return ORDER_TRACKING_NUMBER;
   }

   public void setORDER_TRACKING_NUMBER(Integer ORDER_TRACKING_NUMBER)
   {
      this.ORDER_TRACKING_NUMBER = ORDER_TRACKING_NUMBER;
   }

   @Column(name = "DEPARTMENT_ID")
   public Integer getDEPARTMENT_ID()
   {
      return DEPARTMENT_ID;
   }

   public void setDEPARTMENT_ID(Integer DEPARTMENT_ID)
   {
      this.DEPARTMENT_ID = DEPARTMENT_ID;
   }

   @Column(name = "CPQ_STATUS")
   public String getCPQ_STATUS()
   {
      return CPQ_STATUS;
   }

   public void setCPQ_STATUS(String CPQ_STATUS)
   {
      this.CPQ_STATUS = CPQ_STATUS;
   }

   @Column(name = "CPQ_STATUS_DESCRIPTION")
   public String getCPQ_STATUS_DESCRIPTION()
   {
      return CPQ_STATUS_DESCRIPTION;
   }

   public void setCPQ_STATUS_DESCRIPTION(String CPQ_STATUS_DESCRIPTION)
   {
      this.CPQ_STATUS_DESCRIPTION = CPQ_STATUS_DESCRIPTION;
   }

   @Column(name = "SERVICEORDER_TYPE_ID")
   public Integer getSERVICEORDER_TYPE_ID()
   {
      return SERVICEORDER_TYPE_ID;
   }

   public void setSERVICEORDER_TYPE_ID(Integer SERVICEORDER_TYPE_ID)
   {
      this.SERVICEORDER_TYPE_ID = SERVICEORDER_TYPE_ID;
   }

   @Column(name = "BAN")
   public String getBAN()
   {
      return BAN;
   }

   public void setBAN(String BAN)
   {
      this.BAN = BAN;
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

   @Column(name = "BILLER_XREF_ORDER_ID")
   public Integer getBILLER_XREF_ORDER_ID()
   {
      return BILLER_XREF_ORDER_ID;
   }

   public void setBILLER_XREF_ORDER_ID(Integer BILLER_XREF_ORDER_ID)
   {
      this.BILLER_XREF_ORDER_ID = BILLER_XREF_ORDER_ID;
   }

   @Column(name = "BILLER_XREF_SYSTEM_ID")
   public Integer getBILLER_XREF_SYSTEM_ID()
   {
      return BILLER_XREF_SYSTEM_ID;
   }

   public void setBILLER_XREF_SYSTEM_ID(Integer BILLER_XREF_SYSTEM_ID)
   {
      this.BILLER_XREF_SYSTEM_ID = BILLER_XREF_SYSTEM_ID;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
   @JoinColumn(name = "CONTRACT_ID")
   public Contract getContract()
   {
      return contract;
   }

   public void setContract(Contract contract)
   {
      this.contract = contract;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceorder")
   public Set<Serviceorderitem> getService_order_item()
   {
      return service_order_item;
   }

   public void setService_order_item(Set<Serviceorderitem> service_order_item)
   {
      this.service_order_item = service_order_item;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToOne(cascade = CascadeType.ALL, mappedBy = "serviceorder")
   public Serviceordersite getService_order_site()
   {
      return service_order_site;
   }

   public void setService_order_site(Serviceordersite service_order_site)
   {
      this.service_order_site = service_order_site;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceorder")
   public Set<Serviceorderattribute> getServiceorderattribute()
   {
      return serviceorderattribute;
   }

   public void setServiceorderattribute(
         Set<Serviceorderattribute> serviceorderattribute)
   {
      this.serviceorderattribute = serviceorderattribute;
   }
}