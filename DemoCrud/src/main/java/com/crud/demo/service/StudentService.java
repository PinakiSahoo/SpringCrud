package com.crud.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.model.Student;
import com.crud.demo.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	
	public String insert(Student student) {
       repository.save(student);
        return "sucessfully added";
    }
    public Iterable<Student> findAll() {
        return repository.findAll();
    }
    
    public Optional<Student> find(Long id) {
        return repository.findById(id);
    }
    public void updateProduct(Student student) {
       repository.save(student);
    }
    public void deleteProduct(Long id) {
       repository.deleteById(id);
    }


}
