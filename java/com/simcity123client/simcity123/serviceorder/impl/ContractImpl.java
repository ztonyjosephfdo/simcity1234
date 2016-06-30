package com.simcity123client.simcity123.serviceorder.impl;

import com.simcity123client.simcity123.serviceorder.model.Contract;
import com.simcity123client.simcity123.serviceorder.dao.ContractDao;
import java.util.List;
import org.apache.log4j.Logger;

public class ContractImpl
{

   public List getContract(Contract contract)
   {
      return new ContractDao().getContract(contract);
   }
}