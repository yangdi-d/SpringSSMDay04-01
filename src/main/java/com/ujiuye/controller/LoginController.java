package com.ujiuye.controller;

import com.ujiuye.pojo.Person;
import com.ujiuye.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
    @Autowired
    PersonService personService;
    @RequestMapping("toLogin")
    public String toLogin(Person person, Model model){

        Person person1 = personService.query(person);
        if (person1!=null){
            model.addAttribute("name",person1.getName());
            return "main";
        }else {
            return "error";
        }

    }
    @RequestMapping("toRegist")
    public String toRegist(Person person, Model model){

        int i = personService.savePerson(person);
        System.out.println(i);
        if (i>0){
            model.addAttribute("name",person.getName());
            return "main";
        }else {
            return "error";
        }

    }

    @RequestMapping("toDelete")
    public String toDelete(Person person, Model model){
        int i = personService.deletePerson(person);
        System.out.println(i);
        model.addAttribute("id",person.getId());
        return "delete";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(Person person, Model model){
        int i = personService.updatePerson(person);
        System.out.println(i);
        model.addAttribute("id",person.getId());
        return "update";
    }
}
