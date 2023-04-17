package Pack;

import java.util.*;

public class ListOfPersons {
    public static void main(String[] args){
        List<Person>personsName=new ArrayList<>();
        personsName.add(new Person("Ion",32,"negru"));
        personsName.add(new Person("Luca",20,"blond"));
        System.out.println(extractPersonsName(personsName));
        System.out.println(mapNameToAge(personsName));
        System.out.println(extractPersonsOlderThan(personsName,20));
        System.out.println(mapNameToEyes(personsName));
        System.out.println(mapAgeToList(personsName));

    }
    public static HashMap<String ,Integer> mapNameToAge(List<Person>persons){
        HashMap<String,Integer>m1=new HashMap<>();
        for(Person pers:persons){
            m1.put(pers.getName(), pers.getAge());

        }
        return m1;

    }
    public static HashMap extractPersonsOlderThan(List<Person>persons,int a) {
        HashMap<String, Integer> m2 = new HashMap<>();
        for (Person pers : persons) {
            if (a< pers.getAge()) {
                m2.put(pers.getName(), pers.getAge());
            }
            return m2;

        }
        return m2;
    }


   public static List<String>extractPersonsName(List<Person>personsName){
        List<String> name=new ArrayList<>();
        for(Person pers:personsName){
             name.add(pers.getName());
        }

        return name;
    }
    public static HashMap<String,String> mapNameToEyes(List<Person>pesonsName){
        HashMap<String,String>m3=new HashMap<>();
        for(Person pers:pesonsName){
            m3.put(pers.getName(), pers.getHairColor());

        }
        return m3;
    }
    public static HashMap<Integer,List<Person>> mapAgeToList(List<Person>personsName){
        HashMap<Integer,List<Person>>m4=new HashMap<>();
        for(Person pers:personsName){
            m4.put(pers.getAge(),personsName);
        }
        return m4;
    }


}

