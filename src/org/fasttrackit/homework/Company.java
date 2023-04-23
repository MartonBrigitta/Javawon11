package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Person> employees = new ArrayList<>();
    private final Person manager = new Person("a","a",1);

    public Person getManager(){
        for(Person person:employees){
            if(person.getPosition().equals("manager")){
                return person;
            }
        }
        return null;
    }

    public void employ(Person person) {
        if(getManager()!=null){
            System.out.println("We already have a manager!");
            return;
        }
        employees.add(person);
    }

}
