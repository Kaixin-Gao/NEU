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
public class Product {
    private String name;
    private String modelnumber;
    private String vonder;
    private String description;
    private String bestprice;
    private String ceilingprice;
    private String floorprice;
    private String benefits;
    private String catalog;

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }
    

   @Override
    public String toString(){return name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public String getVonder() {
        return vonder;
    }

    public void setVonder(String vonder) {
        this.vonder = vonder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBestprice() {
        return bestprice;
    }

    public void setBestprice(String bestprice) {
        this.bestprice = bestprice;
    }

    public String getCeilingprice() {
        return ceilingprice;
    }

    public void setCeilingprice(String ceilingprice) {
        this.ceilingprice = ceilingprice;
    }

    public String getFloorprice() {
        return floorprice;
    }

    public void setFloorprice(String floorprice) {
        this.floorprice = floorprice;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
   
    
}
