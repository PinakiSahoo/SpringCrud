package com.crud.bootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crud.bootdemo.model.Person;
import com.crud.bootdemo.service.PersonService;

@Controller
public class PersonController {

	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("person", new Person());
		return "greeting";
	}

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public String addPagePerson(@ModelAttribute Person person, Model model) {
		personService.createPerson(person);
		model.addAttribute("persons", personService.getAllPersons());
		return "result";
	}
	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
	public String getPerson(@ModelAttribute Person person, Model model) {
		List<Person> list=personService.getAllPersons();
		model.addAttribute("persons", personService.getAllPersons());
		return "result";
	}
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public String deletePerson(@ModelAttribute Person person, Model model) {

		personService.deletePerson(person);

		model.addAttribute("persons", personService.getAllPersons()); 
		return "deleteperson";
	}

}
