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
@Table(name = "SERVICEORDERSITE")
public class Serviceordersite
{

   private Integer SERVICE_ORDER_SITE_ID;
   private Integer ORDER_ID;
   private Integer SITEID;
   private Date RECORD_CREATE_DATE;
   private String RECORD_CREATE_BY;
   private Serviceorder serviceorder;
   private Location location;

   @Id
   @GeneratedValue
   @Column(name = "SERVICE_ORDER_SITE_ID")
   public Integer getSERVICE_ORDER_SITE_ID()
   {
      return SERVICE_ORDER_SITE_ID;
   }

   public void setSERVICE_ORDER_SITE_ID(Integer SERVICE_ORDER_SITE_ID)
   {
      this.SERVICE_ORDER_SITE_ID = SERVICE_ORDER_SITE_ID;
   }

   @Column(name = "ORDER_ID")
   public Integer getORDER_ID()
   {
      return ORDER_ID;
   }

   public void setORDER_ID(Integer ORDER_ID)
   {
      this.ORDER_ID = ORDER_ID;
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

   @LazyCollection(LazyCollectionOption.FALSE)
   @OneToOne
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
   @OneToOne(cascade = CascadeType.ALL, mappedBy = "serviceordersite")
   public Location getLocation()
   {
      return location;
   }

   public void setLocation(Location location)
   {
      this.location = location;
   }
}