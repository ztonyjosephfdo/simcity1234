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
@Table(name = "SERVICEORDERATTRIBUTE")
public class Serviceorderattribute
{

   private Integer Id_textClassName;
   private String ORDER_ID;
   private String ATTRIBUTE_KEY;
   private String COMPONENTTYPE;
   private String VALUE;
   private Date RECORD_CREATE_DATE;
   private String RECORD_CREATE_BY;
   private Date RECORD_LASTUPDATED_DATE;
   private String RECORD_LASTUPDATED_BY;
   private Serviceorder serviceorder;

   @Id
   @GeneratedValue
   @Column(name = "ID_TEXTCLASSNAME")
   public Integer getId_textClassName()
   {
      return Id_textClassName;
   }

   public void setId_textClassName(Integer Id_textClassName)
   {
      this.Id_textClassName = Id_textClassName;
   }

   @Column(name = "ORDER_ID")
   public String getORDER_ID()
   {
      return ORDER_ID;
   }

   public void setORDER_ID(String ORDER_ID)
   {
      this.ORDER_ID = ORDER_ID;
   }

   @Column(name = "ATTRIBUTE_KEY")
   public String getATTRIBUTE_KEY()
   {
      return ATTRIBUTE_KEY;
   }

   public void setATTRIBUTE_KEY(String ATTRIBUTE_KEY)
   {
      this.ATTRIBUTE_KEY = ATTRIBUTE_KEY;
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
}