/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Max
 */
public class Supplier {
     private String supplierName;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
     private ProductList productList;
    
    public Supplier(){
        productList = new ProductList();
        
    }

    


    public ProductList getProductList() {
        return productList;
    }

    
    
    @Override
    public String toString(){
        return supplierName;
    }


    

    
}
