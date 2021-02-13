package com.n2s.cllient2.controller;

import com.n2s.cllient2.model.Login_table;
import com.n2s.cllient2.repository.Client2repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//hi hr u
@RestController
public class Client2controller {
@Autowired
Client2repo repository;

@GetMapping("/get")
public List<Login_table> getall (){
    return repository.findAll();
}

@GetMapping("/callclienttwo")
public ResponseEntity<String> callsecondclient() throws Exception{
    String client2responsestring = "Response from client two";
    return new ResponseEntity<String>(client2responsestring , HttpStatus.OK);
}

    }

