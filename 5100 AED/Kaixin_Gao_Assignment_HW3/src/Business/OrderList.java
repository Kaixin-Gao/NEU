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
public class OrderList {
    private ArrayList<Order> productList;

    public OrderList() {
       // ArrayList<Order> productList;
        this.productList = new ArrayList<Order>();
        
    }
    
    

    public ArrayList<Order> getOrderList() {
        return productList;
    }

    public void setOrderList(ArrayList<Order> productList) {
        this.productList = productList;
    }
    
    public Order addOrder(){
        Order product = new Order();
        productList.add(product);
        return product;
    }
    
    public void deleteOrder(Order product){
       productList.remove(product);
    }
    
    /*public Order searchOrder(String name){
        for(Order product:productList){
            if(product.getName().equals(name)){
            return product;
            }else {return null;}
        }return null;
    }*/
}