/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhang
 */
public class DrugHistory {
    List<Drug> drugHistory;
    
    public DrugHistory() {
        drugHistory=new ArrayList<Drug>();
    }

    public List<Drug> getDrugHistory() {
        return drugHistory;
    }

    public Drug addDrug() {
        Drug d=new Drug();
        drugHistory.add(d);
        return d;
    }
    public void deleteDrug(Drug d) {
        drugHistory.remove(d);
    }
    
}
