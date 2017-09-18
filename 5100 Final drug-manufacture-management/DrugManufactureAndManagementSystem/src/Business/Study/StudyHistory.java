/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Study;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhang
 */
public class StudyHistory {
    private List<Study> studyHistory;
    
    public StudyHistory() {
        studyHistory=new ArrayList<Study>();
    }

    public List<Study> getStudyHistory() {
        return studyHistory;
    }

    public Study addStudy() {
        Study s=new Study();
        studyHistory.add(s);
        return s;
    }
    
    public void deleteStudy(Study s) {
        studyHistory.remove(s);
    }
}
