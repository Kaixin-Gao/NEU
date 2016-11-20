/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Role.SystemAdminRole;


/**
 *
 * @author MAX19
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
            
        }
        return business;
    }
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return  network;
        
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private EcoSystem() {
        super(null);
        networkList=new ArrayList();
    }
    
    public boolean checkIfUsernameIsUnipue(String userName){
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
}
