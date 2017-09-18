/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Enterprise.Manufactory.Manufactory;
import Business.Enterprise.HealthFacility.HealthFacility;
import Business.Enterprise.ClinicalTrial.ClinicalTrial;
import java.util.ArrayList;

/**
 *
 * @author zhang
 */
public class EnterpriseDirectory {
     private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Manufactory) {
            enterprise = new Manufactory(name, type);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.ClinicalTrial) {
            enterprise = new ClinicalTrial(name, type);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.HealthFacility) {
            enterprise = new HealthFacility(name, type);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public void DeleteEnterprise(Enterprise enterprise) {
       
        enterpriseList.remove(enterprise);
    }
}
