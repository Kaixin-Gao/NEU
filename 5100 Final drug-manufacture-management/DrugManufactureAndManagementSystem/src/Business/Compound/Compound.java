/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Compound;

import java.util.Date;

/**
 *
 * @author zhang
 */
public class Compound {
     private String name;
     private String description;
     private String molecularFormula;
     private String molecularStructure;
     private int num;
     private Date date;
     private static int count=1;
     
     
     
     public Compound() {
         num=count;
         count++;
     }
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMolecularFormula() {
        return molecularFormula;
    }

    public void setMolecularFormula(String molecularFormula) {
        this.molecularFormula = molecularFormula;
    }

    public String getMolecularStructure() {
        return molecularStructure;
    }

    public void setMolecularStructure(String molecularStructure) {
        this.molecularStructure = molecularStructure;
    }
     
     @Override
     public String toString() {
         return name;
     }
}
