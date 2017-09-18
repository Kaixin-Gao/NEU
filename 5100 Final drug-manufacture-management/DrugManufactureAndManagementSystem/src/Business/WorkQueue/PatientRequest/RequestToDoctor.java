/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.PatientRequest;

import Business.Drug.Drug;
import Business.Patient.Disease;
import Business.Patient.Patient;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author zhang
 */
public class RequestToDoctor extends WorkRequest {
    private Patient patient;
    private  String testResult;
     private Disease disease;
     private Drug drug;
     private int price;

     public RequestToDoctor() {
         patient=new Patient();
         
        
     }
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

    

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    

   

    
    
   
      @Override
    public String toString() {
      return message;
    }
}
