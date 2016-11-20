/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author MAX19
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> EnterpriseList) {
        this.enterpriseList = EnterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList();
    }
    // Creat enterprise
    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
            
        }
        return enterprise;
    }
}
