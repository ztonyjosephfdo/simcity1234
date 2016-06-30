package com.simcity123client.simcity123.serviceorder.model;

import com.simcity123client.simcity123.serviceorder.model.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name = "MILESTONES")
public class Milestones
{

   private Integer MILESTONE_ID;
   private String ORDER_KEY_TYPE;
   private String ORDER_KEY_VALUE;
   private String ACTIVITY;
   private Date SCHEDULEDDATE;
   private Date COMPLETEDATE;
   private String STATUS;
   private Date CREATEDDATE;
   private String CREATEDBY;
   private Date LASTUPDATEDDATE;
   private String LASTUPDATEDBY;
   private Integer SOURCE_SYSTEM_ID;
   private Date RECORD_CREATE_DATE;
   private String RECORD_CREATE_BY;
   private Date RECORD_LASTUPDATED_DATE;
   private String RECORD_LASTUPDATED_BY;
   private Integer MILESTONE_CONFIG_ID;
   private String MILESTONE_LOCATION_ID;
   private String MILESTONE_DETAILS;

   @Id
   @GeneratedValue
   @Column(name = "MILESTONE_ID")
   public Integer getMILESTONE_ID()
   {
      return MILESTONE_ID;
   }

   public void setMILESTONE_ID(Integer MILESTONE_ID)
   {
      this.MILESTONE_ID = MILESTONE_ID;
   }

   @Column(name = "ORDER_KEY_TYPE")
   public String getORDER_KEY_TYPE()
   {
      return ORDER_KEY_TYPE;
   }

   public void setORDER_KEY_TYPE(String ORDER_KEY_TYPE)
   {
      this.ORDER_KEY_TYPE = ORDER_KEY_TYPE;
   }

   @Column(name = "ORDER_KEY_VALUE")
   public String getORDER_KEY_VALUE()
   {
      return ORDER_KEY_VALUE;
   }

   public void setORDER_KEY_VALUE(String ORDER_KEY_VALUE)
   {
      this.ORDER_KEY_VALUE = ORDER_KEY_VALUE;
   }

   @Column(name = "ACTIVITY")
   public String getACTIVITY()
   {
      return ACTIVITY;
   }

   public void setACTIVITY(String ACTIVITY)
   {
      this.ACTIVITY = ACTIVITY;
   }

   @Column(name = "SCHEDULEDDATE")
   public Date getSCHEDULEDDATE()
   {
      return SCHEDULEDDATE;
   }

   public void setSCHEDULEDDATE(Date SCHEDULEDDATE)
   {
      this.SCHEDULEDDATE = SCHEDULEDDATE;
   }

   @Column(name = "COMPLETEDATE")
   public Date getCOMPLETEDATE()
   {
      return COMPLETEDATE;
   }

   public void setCOMPLETEDATE(Date COMPLETEDATE)
   {
      this.COMPLETEDATE = COMPLETEDATE;
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

   @Column(name = "MILESTONE_CONFIG_ID")
   public Integer getMILESTONE_CONFIG_ID()
   {
      return MILESTONE_CONFIG_ID;
   }

   public void setMILESTONE_CONFIG_ID(Integer MILESTONE_CONFIG_ID)
   {
      this.MILESTONE_CONFIG_ID = MILESTONE_CONFIG_ID;
   }

   @Column(name = "MILESTONE_LOCATION_ID")
   public String getMILESTONE_LOCATION_ID()
   {
      return MILESTONE_LOCATION_ID;
   }

   public void setMILESTONE_LOCATION_ID(String MILESTONE_LOCATION_ID)
   {
      this.MILESTONE_LOCATION_ID = MILESTONE_LOCATION_ID;
   }

   @Column(name = "MILESTONE_DETAILS")
   public String getMILESTONE_DETAILS()
   {
      return MILESTONE_DETAILS;
   }

   public void setMILESTONE_DETAILS(String MILESTONE_DETAILS)
   {
      this.MILESTONE_DETAILS = MILESTONE_DETAILS;
   }
}