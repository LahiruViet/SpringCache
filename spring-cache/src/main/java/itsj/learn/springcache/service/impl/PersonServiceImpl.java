package itsj.learn.springcache.service.impl;

import itsj.learn.springcache.cache.PersonCache;
import itsj.learn.springcache.entity.Person;
import itsj.learn.springcache.repository.PersonRepository;
import itsj.learn.springcache.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonCache personCache;

    @Override
    public Person findByName(String name) {
        return personCache.findByName(name);
    }
}
