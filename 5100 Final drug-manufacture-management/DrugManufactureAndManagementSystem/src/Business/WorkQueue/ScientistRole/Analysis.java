/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.ScientistRole;

import Business.Compound.Compound;
import Business.Drug.Drug;
import Business.Patient.Disease;
import Business.Patient.Gene;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author zhang
 */
public class Analysis extends WorkRequest{
    private Drug drug;
    private Gene gene;
    private Disease disease;
    private Compound[] compoundArray;
    
    public Analysis () {
        drug=new Drug();
        gene=new Gene();
        disease=new Disease();
        compoundArray=new Compound[3];
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Gene getGene() {
        return gene;
    }

    public void setGene(Gene gene) {
        this.gene = gene;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Compound[] getCompoundArray() {
        return compoundArray;
    }

    public void setCompoundArray(Compound[] compoundArray) {
        this.compoundArray = compoundArray;
    }
    
    
    
}
