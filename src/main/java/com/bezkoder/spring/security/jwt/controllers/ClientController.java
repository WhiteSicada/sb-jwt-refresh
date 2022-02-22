package com.bezkoder.spring.security.jwt.controllers;


import com.bezkoder.spring.security.jwt.models.demo.Client;
import com.bezkoder.spring.security.jwt.payload.request.ClientCreationRequest;
import com.bezkoder.spring.security.jwt.repository.ClientRepository;
import com.bezkoder.spring.security.jwt.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public Page<Client> getAllClients(Pageable pageable) {
        return clientRepository.findAll(pageable);
    }

    @PostMapping("/clients")
    public ResponseEntity<?> createClient(@Valid @RequestBody ClientCreationRequest clientCreationRequest) {
        Client savedClient = clientService.createClient(clientCreationRequest);
        return ResponseEntity.ok().body(savedClient);
    }

//    @PutMapping("/clients/{clientId}")
//    public Post updateClient(@PathVariable Long postId, @Valid @RequestBody Post postRequest) {
//        return postRepository.findById(postId).map(post -> {
//            post.setTitle(postRequest.getTitle());
//            post.setDescription(postRequest.getDescription());
//            post.setContent(postRequest.getContent());
//            return postRepository.save(post);
//        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
//    }
//
//
//    @DeleteMapping("/clients/{clientId}")
//    public ResponseEntity<?> deleteClient(@PathVariable Long postId) {
//        return postRepository.findById(postId).map(post -> {
//            postRepository.delete(post);
//            return ResponseEntity.ok().build();
//        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
//    }

}
