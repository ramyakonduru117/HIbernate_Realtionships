package com.rel.Relationship.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rel.Relationship.Model.Address;

@Repository
public interface Adressrepository extends JpaRepository<Address, Integer>{

}
