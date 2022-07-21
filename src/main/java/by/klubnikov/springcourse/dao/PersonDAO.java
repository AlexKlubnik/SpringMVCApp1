package by.klubnikov.springcourse.dao;

import by.klubnikov.springcourse.models.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNTER;
    private List<Person> people;
    {
        people=new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNTER, "Lex"));
        people.add(new Person(++PEOPLE_COUNTER, "Bruce"));
        people.add(new Person(++PEOPLE_COUNTER, "Boris"));
        people.add(new Person(++PEOPLE_COUNTER, "Andrey"));
        people.add(new Person(++PEOPLE_COUNTER, "Alex"));
    }

    public List<Person> index(){
        return people;
    }

    public Person shaw (int id){
        Person tempPerson=null;
        for (Person person:people) {
            if (person.getId()==id)
                tempPerson=person;
        }
        return tempPerson;
    }
}
