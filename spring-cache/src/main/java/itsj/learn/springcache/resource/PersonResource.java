package itsj.learn.springcache.resource;

import itsj.learn.springcache.entity.Person;
import itsj.learn.springcache.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/")
public class PersonResource {

    @Autowired
    private PersonService personService;

    @GetMapping("person/{name}")
    public Person findByName(@PathVariable String name){
        return personService.findByName(name);
    }
}
