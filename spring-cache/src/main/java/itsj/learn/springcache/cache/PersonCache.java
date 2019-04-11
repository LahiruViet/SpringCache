package itsj.learn.springcache.cache;

import itsj.learn.springcache.entity.Person;
import itsj.learn.springcache.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class PersonCache {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonCache.class);

    @Autowired
    private PersonRepository personRepository;

    @Cacheable(value = "personCache", key = "#name")
    public Person findByName(String name){
        LOGGER.info("getting data from Database for name "+name);
        return personRepository.findByName(name);
    }
}
