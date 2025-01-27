package com.todotic.project1Api.controller;

import com.todotic.project1Api.entity.Contact;
import com.todotic.project1Api.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/api/contacts")
@RestController
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping
    public Iterable<Contact> list() {
        return contactRepository.findAll();
    }

    @GetMapping("{id}")
    public Contact get(@PathVariable Integer id) {
        return contactRepository
                .findById(id)
                .orElse(null);
    }

    @PostMapping
    public Contact create(@RequestBody Contact contact) {
        contact.setCreatedAt(LocalDateTime.now());
        return contactRepository.save(contact);
    }

    @PutMapping("{id}")
    public Contact update(@PathVariable Integer id,
                          @RequestBody Contact contact) {
        Contact contactFromDb = contactRepository
                .findById(id)
                .orElse(null);
        return contactRepository.save(contact);
    }

}
