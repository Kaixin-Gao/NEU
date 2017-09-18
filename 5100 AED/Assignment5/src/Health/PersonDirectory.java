/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neeraj
 */
public class PersonDirectory {

    List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    PersonDirectory() {
        personList = new ArrayList<>();
    }

    public Person addPerson() {
        Person p = new Person();
        personList.add(p);
        return p;
    }

}
