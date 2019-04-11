package itsj.learn.springcache.repository;

import itsj.learn.springcache.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findByName(String name);
}
