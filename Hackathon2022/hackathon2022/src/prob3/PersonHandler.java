package prob3;

import java.util.*;

public class PersonHandler{
    private Map<String, Person> pMap = new HashMap<>();

    public void addPerson(Person p){
        pMap.put(p.getName(),p);
    }

    
}