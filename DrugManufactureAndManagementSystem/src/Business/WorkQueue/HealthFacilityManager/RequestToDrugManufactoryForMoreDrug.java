/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.HealthFacilityManager;

import Business.Drug.Drug;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author zhang
 */
public class RequestToDrugManufactoryForMoreDrug extends WorkRequest {
       private int drugNum;
       
       private Drug drug;
       private String result;
       

    public int getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(int drugNum) {
        this.drugNum = drugNum;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

   
     
    
         @Override
    public String toString() {
      return message;
    }
}
