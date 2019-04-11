package itsj.learn.springcache.service;

import itsj.learn.springcache.entity.Person;

public interface PersonService {

    Person findByName(String name);
}
