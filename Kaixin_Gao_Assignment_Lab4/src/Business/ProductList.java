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
public class ProductList {
   
    private ArrayList<Product> productList;

    public ArrayList<Product> getProductList() {
        return productList;
    }
    
    public ProductList(){
        productList = new ArrayList<Product>();
    }
    
    public Product addProduct()
    {
        Product p = new Product();
        productList.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productList.remove(p);
        
    }
    
    public Product searchProduct(int id){
        for(Product p:productList){
            if(p.getModelNumber() == id){
                return p;
            }
            }return null;
    }
}
