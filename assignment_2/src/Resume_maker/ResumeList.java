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
    private ArrayList<Resume> resumeList;
    
    public ResumeList(){
        resumeList = new ArrayList<Resume>();
    }

    public ArrayList<Resume> getResumeList() {
        return resumeList;
    }

    public void setResumeList(ArrayList<Resume> ResumeList) {
        this.resumeList = ResumeList;
    }
    
    public Resume addRe(){
        Resume r = new Resume();
        resumeList.add(r);
        return r;
    }
    public void deleteRe(Resume v)
    {
    resumeList.remove(v);
    }
}
