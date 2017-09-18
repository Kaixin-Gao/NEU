/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.ScientistRole;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author zhang
 */
public class SendResultToDrugManufactory extends WorkRequest {
    
    private String result;
    private String Description;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
    
    
    
    
    @Override
    public String toString() {
        return message;
    }
}
