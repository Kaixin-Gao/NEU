/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author zhang
 */
public class Ecosystem extends Organization {
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    
    private Ecosystem() {
        super(null);
        networkList = new ArrayList<>();
    }
    public static Ecosystem getInstance() {
        if (business == null) {

            business = new Ecosystem();
        }
        return business;
    }  
    
      public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public void DeleteNetwork(Network n) {
        networkList.remove(n);
    }
     
    public boolean checkIfNetworkisUnique(String networkName) {

        for (Network n : this.networkList) {
            if (n.getName().equals(networkName)) {
                return true; 

            }

        }
        return false;

    }
    
    
    public boolean checkIfUsernameIsUnique(String username) {

        for (UserAccount ua : this.getUserAccountDirectory().getUserAccountList()) {
            // System.out.println("EcoSystem" + ua.getUsername());
            if (ua.getUsername().equals(username)) {
                return false;
            }
            for (Network n : this.getNetworkList()) {
                for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ucc : ent.getUserAccountDirectory().getUserAccountList()) {
                        //           System.out.println("Enterprise-->" + ucc.getUsername());
                        if (ucc.getUsername().equals(username)) {
                            return false;
                        }
                        for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount accOrg : org.getUserAccountDirectory().getUserAccountList()) {
                                //                 System.out.println("Organization-->" + accOrg.getUsername());
                                if (accOrg.getUsername().equals(username)) {
                                    return false;
                                }
                            }

                        }
                    }

                }
            }

        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
}
