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
    public ArrayList<Product> getCategoriedList(int type) {
        ArrayList<Product> results = new ArrayList<Product>();
        for (Product p : productList) {
            
                results.add(p);
            
        }
        return results;
    }

    public ProductList() {
        // ArrayList<Product> productList;
        //this.productList = new ArrayList<Product>();
        productList = new ArrayList<Product>();

    }

    public Product addProduct() {
        Product product = new Product();
        productList.add(product);
        return product;
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    public ArrayList<Product> searchProduct(String str) {
        //Collections.sort(productList);
        ArrayList<Product> results = new ArrayList<Product>();
        String Count[] = str.split(" "); //遇到空格就拆分。

        for (int i = 0; i < Count.length; i++) {
            System.out.println(Count[i]); //输出数组Count的数
        }
        int youzhege =1;

        for (Product product : productList) {

            for (int i = 0; i < Count.length; i++) {
                youzhege = 1;
                if (product.getName().toUpperCase().contains(Count[i].toUpperCase()) || product.getVonder().toUpperCase().contains(Count[i].toUpperCase()) || product.getBestprice().toUpperCase().contains(Count[i].toUpperCase()) || product.getDescription().toUpperCase().contains(Count[i].toUpperCase())) {
               
                } else {
                    youzhege=0;
                   
                }

            }if(youzhege == 1){results.add(product);}
           // Collections.sort(results);
            
        }
        
        return results;
    }

     public Product search(String str) {
        //Collections.sort(productList);
        Product result = new Product();
        //product name, vendor, description
        for (Product p : productList) {
            if (p.getName().contains(str) || p.getDescription().contains(str) || p.getVonder().contains(str)) {
                result = p;
            }
        }
        return result;
    }
}
