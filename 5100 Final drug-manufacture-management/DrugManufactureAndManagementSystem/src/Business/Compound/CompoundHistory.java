/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Compound;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhang
 */
public class CompoundHistory {
     List<Compound> compoundHistory;
     
     public CompoundHistory() {
         compoundHistory=new ArrayList<Compound>();
     }

    public List<Compound> getCompoundHistory() {
        return compoundHistory;
    }
    public Compound addCompound() {
        Compound c=new Compound();
        compoundHistory.add(c);
        return c;
    }
    public void deleteCompound(Compound c) {
        compoundHistory.remove(c);
    }
}
