/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.ScientistRole;

import Business.Drug.Drug;
import static Business.Organization.Organization.ClinicalTrialType.Scientist;
import Business.Patient.Disease;
import Business.Patient.Gene;
import Business.Patient.Patient;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author zhang
 */
public class RequestToHealthDate extends WorkRequest {
    
     private String Result;
     private Disease disease;
     private Gene gene;
     private Drug drug;

   
     
     public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
     
    
     
    
    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

     
    public Gene getGene() {
        return gene;
    }

    public void setGene(Gene gene) {
        this.gene = gene;
    }
     
     
    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

   
     
     
        @Override
    public String toString() {
      return message;
    }
}
