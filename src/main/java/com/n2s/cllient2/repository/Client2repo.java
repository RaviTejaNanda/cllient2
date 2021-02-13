package com.n2s.cllient2.repository;

import com.n2s.cllient2.model.Login_table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Client2repo extends JpaRepository<Login_table ,Integer> {

}
