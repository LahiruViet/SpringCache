package itsj.learn.springcache.loader;

import itsj.learn.springcache.entity.Person;
import itsj.learn.springcache.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonLoader {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonLoader.class);

    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    public void load(){
        personRepository.saveAll(getPersonList());
    }

    private List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Lahiru"));
        personList.add(new Person("Tom"));
        return personList;
    }
}
