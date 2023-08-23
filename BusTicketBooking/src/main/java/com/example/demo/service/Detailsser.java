package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Details;
import com.example.demo.repository.Detailsrep;

@Service
public class Detailsser {
@Autowired
Detailsrep re;
public Details add(Details d) {
	return re.save(d);
}
public List<Details> showdetails(Details d){
	return re.findAll();
}
public List<Details> saveall(List<Details> ss){
	   return (List<Details>) re.saveAll(ss);
}
public Optional<Details> showbyid(int id){
	   return re.findById(id);
}
public Details modify(Details d) {
	return re.saveAndFlush(d);
}
public String updateinfobyid(int id,Details s) {
	re.saveAndFlush(s);
	if(re.existsById(id)) {
		return "Updated";
	}
	else {
		return "Enter valid id";
	}
}
public void remove(Details d) {
	re.delete(d);
	
}
public void delid(int id) {
	re.deleteById(id);
}
}

