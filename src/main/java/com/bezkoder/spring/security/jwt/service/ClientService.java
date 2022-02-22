package com.bezkoder.spring.security.jwt.service;

import com.bezkoder.spring.security.jwt.convertor.AdressConvertor;
import com.bezkoder.spring.security.jwt.convertor.ClientConvertor;
import com.bezkoder.spring.security.jwt.convertor.ConjointConvertor;
import com.bezkoder.spring.security.jwt.convertor.EnfantConvertor;
import com.bezkoder.spring.security.jwt.exception.ResourceNotFoundException;
import com.bezkoder.spring.security.jwt.models.demo.Adress;
import com.bezkoder.spring.security.jwt.models.demo.Client;
import com.bezkoder.spring.security.jwt.models.demo.Conjoint;
import com.bezkoder.spring.security.jwt.models.demo.Enfant;
import com.bezkoder.spring.security.jwt.payload.request.ClientCreationRequest;
import com.bezkoder.spring.security.jwt.repository.AdressRepository;
import com.bezkoder.spring.security.jwt.repository.ClientRepository;
import com.bezkoder.spring.security.jwt.repository.ConjointRepository;
import com.bezkoder.spring.security.jwt.repository.EnfantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientService {

    //Convertors

    @Autowired
    private ClientConvertor clientConvertor;

    @Autowired
    private AdressConvertor adressConvertor;

    @Autowired
    private ConjointConvertor conjointConvertor;

    @Autowired
    private EnfantConvertor enfantConvertor;


    // Repositories

    @Autowired
    private AdressRepository adressRepository;

    @Autowired
    private ConjointRepository conjointRepository;

    @Autowired
    private EnfantRepository enfantRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Transactional
    public Client createClient(ClientCreationRequest clientCreationRequest) {
        // adress
        Adress adress = adressConvertor.dtoToEntity(clientCreationRequest);
        Adress savedAdress = adressRepository.save(adress);

        // conjoint
        Conjoint conjoint = conjointConvertor.dtoToEntity(clientCreationRequest);
        Conjoint savedConjoint = conjointRepository.save(conjoint);

        // client
        Client client = clientConvertor.dtoToEntity(clientCreationRequest, savedAdress, savedConjoint);
        Client savedClient = clientRepository.save(client);


        // enfantList
        List<Enfant> enfantList = enfantConvertor.dtoToEntity(clientCreationRequest);
        enfantList.stream().map(enfant -> {
            enfant.setClient(savedClient);
            return enfantRepository.save(enfant);
        });

        return clientRepository.findById(savedClient.getId()).orElseThrow(() -> new ResourceNotFoundException("client Id " + savedClient.getId() + " not found"));
    }
}
