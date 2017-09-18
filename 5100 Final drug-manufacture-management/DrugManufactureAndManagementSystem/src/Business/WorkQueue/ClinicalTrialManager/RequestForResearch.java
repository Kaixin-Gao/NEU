/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.ClinicalTrialManager;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author zhang
 */
public class RequestForResearch extends WorkRequest{
    private String result;
    private int funding;

    public int getFunding() {
        return funding;
    }

    public void setFunding(int funding) {
        this.funding = funding;
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
