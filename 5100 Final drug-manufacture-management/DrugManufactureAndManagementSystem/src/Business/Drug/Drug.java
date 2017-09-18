/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import Business.Compound.Compound;
import Business.Patient.Disease;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhang
 */
public class Drug {
    private int drugNumber;
    private String drugName;
    private List<Compound> formula;
    private Disease uses;
    private String manufactory;
    private String drugCatalog;
    private String route;
    private String description;
    private String indication;

    public Drug() {
        formula=new ArrayList<Compound>();
    }
    public int getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(int drugNumber) {
        this.drugNumber = drugNumber;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public List<Compound> getFormula() {
        return formula;
    }

    public void setFormula(List<Compound> formula) {
        this.formula = formula;
    }

    public Disease getUses() {
        return uses;
    }

    public void setUses(Disease uses) {
        this.uses = uses;
    }

    public String getManufactory() {
        return manufactory;
    }

    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }

    public String getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(String drugCatalog) {
        this.drugCatalog = drugCatalog;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }
    
    @Override
    public String toString() {
        return drugName;
    }
}
