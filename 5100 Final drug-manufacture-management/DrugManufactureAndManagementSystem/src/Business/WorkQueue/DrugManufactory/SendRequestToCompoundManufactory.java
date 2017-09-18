/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.DrugManufactory;

import Business.Compound.Compound;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author zhang
 */
public class SendRequestToCompoundManufactory extends WorkRequest{
      
    private Compound compound;
    private int compoundNum;
    private String result;
    
   

    public Compound getCompound() {
        return compound;
    }

    public void setCompound(Compound compound) {
        this.compound = compound;
    }

    public int getCompoundNum() {
        return compoundNum;
    }

    public void setCompoundNum(int compoundNum) {
        this.compoundNum = compoundNum;
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
