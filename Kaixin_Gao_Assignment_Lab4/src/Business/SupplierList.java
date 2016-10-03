/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class SupplierList {
    private ArrayList<Supplier> supplierList;
    
    public SupplierList(){
        supplierList = new ArrayList<Supplier>();
        
    }
    
    public ArrayList<Supplier> getSupplierList(){
        return supplierList;
    }
    
    public Supplier addSupplier(){
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
        
    }
    
    public void removeSupplier(Supplier supplier){
        supplierList.remove(supplier);
    }
    
    public Supplier searchSupplier(String word){
        for(Supplier s: supplierList){
            if(word.equals(s.getSupplierName())){
                return s;
            }
        }return null;
    }
}
