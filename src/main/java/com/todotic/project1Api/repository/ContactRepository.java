package com.todotic.project1Api.repository;

import com.todotic.project1Api.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
