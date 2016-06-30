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
@Table(name = "LOCATION")
public class Location
{

   private Integer Location_ID;
   private String CLLI;
   private String STREET;
   private String CITY;
   private String STATE;
   private String COUNTRY;
   private String ZIPCODE;
   private String RECORD_CREATE_BY;
   private Date RECORD_CREATE_DATE;
   private String RECORD_LASTUPDATED_BY;
   private Date RECORD_LASTUPDATED_DATE;
   private String LOCATION_REF_TYPE;
   private String LOCATION_REF_ID;
   private Integer LATITUDE;
   private Integer LONGITUDE;
   private String LEGAL_LAND_DESCRIPTION;
   private String BUILDING_NAME;
   private String LOCATION_NAME;
   private Serviceordersite serviceordersite;

   @Id
   @GeneratedValue
   @Column(name = "LOCATION_ID")
   public Integer getLocation_ID()
   {
      return Location_ID;
   }

   public void setLocation_ID(Integer Location_ID)
   {
      this.Location_ID = Location_ID;
   }

   @Column(name = "CLLI")
   public String getCLLI()
   {
      return CLLI;
   }

   public void setCLLI(String CLLI)
   {
      this.CLLI = CLLI;
   }

   @Column(name = "STREET")
   public String getSTREET()
   {
      return STREET;
   }

   public void setSTREET(String STREET)
   {
      this.STREET = STREET;
   }

   @Column(name = "CITY")
   public String getCITY()
   {
      return CITY;
   }

   public void setCITY(String CITY)
   {
      this.CITY = CITY;
   }

   @Column(name = "STATE")
   public String getSTATE()
   {
      return STATE;
   }

   public void setSTATE(String STATE)
   {
      this.STATE = STATE;
   }

   @Column(name = "COUNTRY")
   public String getCOUNTRY()
   {
      return COUNTRY;
   }

   public void setCOUNTRY(String COUNTRY)
   {
      this.COUNTRY = COUNTRY;
   }

   @Column(name = "ZIPCODE")
   public String getZIPCODE()
   {
      return ZIPCODE;
   }

   public void setZIPCODE(String ZIPCODE)
   {
      this.ZIPCODE = ZIPCODE;
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

   @Column(name = "RECORD_CREATE_DATE")
   public Date getRECORD_CREATE_DATE()
   {
      return RECORD_CREATE_DATE;
   }

   public void setRECORD_CREATE_DATE(Date RECORD_CREATE_DATE)
   {
      this.RECORD_CREATE_DATE = RECORD_CREATE_DATE;
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

   @Column(name = "RECORD_LASTUPDATED_DATE")
   public Date getRECORD_LASTUPDATED_DATE()
   {
      return RECORD_LASTUPDATED_DATE;
   }

   public void setRECORD_LASTUPDATED_DATE(Date RECORD_LASTUPDATED_DATE)
   {
      this.RECORD_LASTUPDATED_DATE = RECORD_LASTUPDATED_DATE;
   }

   @Column(name = "LOCATION_REF_TYPE")
   public String getLOCATION_REF_TYPE()
   {
      return LOCATION_REF_TYPE;
   }

   public void setLOCATION_REF_TYPE(String LOCATION_REF_TYPE)
   {
      this.LOCATION_REF_TYPE = LOCATION_REF_TYPE;
   }

   @Column(name = "LOCATION_REF_ID")
   public String getLOCATION_REF_ID()
   {
      return LOCATION_REF_ID;
   }

   public void setLOCATION_REF_ID(String LOCATION_REF_ID)
   {
      this.LOCATION_REF_ID = LOCATION_REF_ID;
   }

   @Column(name = "LATITUDE")
   public Integer getLATITUDE()
   {
      return LATITUDE;
   }

   public void setLATITUDE(Integer LATITUDE)
   {
      this.LATITUDE = LATITUDE;
   }

   @Column(name = "LONGITUDE")
   public Integer getLONGITUDE()
   {
      return LONGITUDE;
   }

   public void setLONGITUDE(Integer LONGITUDE)
   {
      this.LONGITUDE = LONGITUDE;
   }

   @Column(name = "LEGAL_LAND_DESCRIPTION")
   public String getLEGAL_LAND_DESCRIPTION()
   {
      return LEGAL_LAND_DESCRIPTION;
   }

   public void setLEGAL_LAND_DESCRIPTION(String LEGAL_LAND_DESCRIPTION)
   {
      this.LEGAL_LAND_DESCRIPTION = LEGAL_LAND_DESCRIPTION;
   }

   @Column(name = "BUILDING_NAME")
   public String getBUILDING_NAME()
   {
      return BUILDING_NAME;
   }

   public void setBUILDING_NAME(String BUILDING_NAME)
   {
      this.BUILDING_NAME = BUILDING_NAME;
   }

   @Column(name = "LOCATION_NAME")
   public String getLOCATION_NAME()
   {
      return LOCATION_NAME;
   }

   public void setLOCATION_NAME(String LOCATION_NAME)
   {
      this.LOCATION_NAME = LOCATION_NAME;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToOne
   @JoinColumn(name = "SERVICE_ORDER_SITE_ID")
   public Serviceordersite getServiceordersite()
   {
      return serviceordersite;
   }

   public void setServiceordersite(Serviceordersite serviceordersite)
   {
      this.serviceordersite = serviceordersite;
   }
}