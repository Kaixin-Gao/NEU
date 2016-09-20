/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resume_maker;
import java.util.ArrayList;
/**
 *
 * @author Max
 */
public class ResumeList {
    private ArrayList<Resume> ResumeList;
    
    public ResumeList(){
        ResumeList = new ArrayList<Resume>();
    }

    public ArrayList<Resume> getVitalSignHistory() {
        return ResumeList;
    }

    public void setVitalSignHistory(ArrayList<Resume> VitalSignHistory) {
        this.ResumeList = VitalSignHistory;
    }
    
    public Resume addVitals(){
        Resume vs = new Resume();
        ResumeList.add(vs);
        return vs;
    }
    public void deleteVitals(Resume v)
    {
    ResumeList.remove(v);
    }
}
