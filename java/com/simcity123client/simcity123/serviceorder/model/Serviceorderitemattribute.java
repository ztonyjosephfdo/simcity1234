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

@Entity
@Table(name = "SERVICEORDERITEMATTRIBUTE")
public class Serviceorderitemattribute
{

   private Integer ATTRIBUTE_ID;
   private Integer SOIID;
   private String COMPONENTTYPE;
   private String VALUE;
   private Date RECORD_CREATE_DATE;
   private String RECORD_CREATE_BY;
   private Date RECORD_LASTUPDATED_DATE;
   private String RECORD_LASTUPDATED_BY;
   private String ATTRIBUTE_KEY_NUMBER;
   private Serviceorderitem serviceorderitem;

   @Id
   @GeneratedValue
   @Column(name = "ATTRIBUTE_ID")
   public Integer getATTRIBUTE_ID()
   {
      return ATTRIBUTE_ID;
   }

   public void setATTRIBUTE_ID(Integer ATTRIBUTE_ID)
   {
      this.ATTRIBUTE_ID = ATTRIBUTE_ID;
   }

   @Column(name = "SOIID")
   public Integer getSOIID()
   {
      return SOIID;
   }

   public void setSOIID(Integer SOIID)
   {
      this.SOIID = SOIID;
   }

   @Column(name = "COMPONENTTYPE")
   public String getCOMPONENTTYPE()
   {
      return COMPONENTTYPE;
   }

   public void setCOMPONENTTYPE(String COMPONENTTYPE)
   {
      this.COMPONENTTYPE = COMPONENTTYPE;
   }

   @Column(name = "VALUE")
   public String getVALUE()
   {
      return VALUE;
   }

   public void setVALUE(String VALUE)
   {
      this.VALUE = VALUE;
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

   @Column(name = "ATTRIBUTE_KEY_NUMBER")
   public String getATTRIBUTE_KEY_NUMBER()
   {
      return ATTRIBUTE_KEY_NUMBER;
   }

   public void setATTRIBUTE_KEY_NUMBER(String ATTRIBUTE_KEY_NUMBER)
   {
      this.ATTRIBUTE_KEY_NUMBER = ATTRIBUTE_KEY_NUMBER;
   }

   @LazyCollection(LazyCollectionOption.FALSE)
   @ManyToOne
   @JoinColumn(name = "SOI_ID")
   public Serviceorderitem getServiceorderitem()
   {
      return serviceorderitem;
   }

   public void setServiceorderitem(Serviceorderitem serviceorderitem)
   {
      this.serviceorderitem = serviceorderitem;
   }
}