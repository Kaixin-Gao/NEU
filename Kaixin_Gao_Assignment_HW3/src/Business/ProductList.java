/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Max
 */
public class ProductList {
    private ArrayList<Product> productList;

    
    public ArrayList<Product> getProductList() {
      //  Collections.sort(productList);
        return productList;
    }
    
        /*public ArrayList<Product> getList() {
            ArrayList<Product> results = new ArrayList<Product>();
            for (Product p : productList) {
                
                    results.add(p);
                
            }
            return results;
        }*/

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    
    public ProductList() {
       // ArrayList<Product> productList;
        //this.productList = new ArrayList<Product>();
        productList = new ArrayList<Product>();
        
    }

    
    
    public Product addProduct(){
        Product product = new Product();
        productList.add(product);
        return product;
    }
    
    public void deleteProduct(Product product){
       productList.remove(product);
    }
    
    public Product searchProduct(String str){
        for(Product product:productList){
            if(product.getName().equals(str) || product.getVonder().equals(str) || product.getBestprice().equals(str) || product.getDescription().contains(str)){
            return product;
            }else {return null;}
        }return null;
    }
    
    
   /* public ArrayList<Product> search(String str) {
        Collections.sort(productList);
        ArrayList<Product> results = new ArrayList<Product>();
        //product name, vendor, description
        for (Product p : productList) {
            if (p.getName().contains(str) || p.getDescription().contains(str) || p.getVonder().contains(str)) {
                results.add(p);
            }
        }
        Collections.sort(results);
        return results;
    }*/
    
}
