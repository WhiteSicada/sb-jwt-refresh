package com.bezkoder.spring.security.jwt.convertor;

import com.bezkoder.spring.security.jwt.models.demo.Adress;
import com.bezkoder.spring.security.jwt.payload.request.ClientCreationRequest;
import org.springframework.stereotype.Component;

@Component
public class AdressConvertor {

    public Adress dtoToEntity(ClientCreationRequest clientCreationRequest) {
        Adress adress = new Adress();
        adress.setStreetName(clientCreationRequest.getAdress().getStreetName());
        adress.setStreetNumber(clientCreationRequest.getAdress().getStreetNumber());
        adress.setStreetType(clientCreationRequest.getAdress().getStreetType());
        adress.setRepetition(clientCreationRequest.getAdress().getRepetition());
        adress.setCityName(clientCreationRequest.getAdress().getCityName());
        adress.setCityZipCode(clientCreationRequest.getAdress().getCityZipCode());
        adress.setComplement(clientCreationRequest.getAdress().getComplement());
        adress.setCodeInsee(clientCreationRequest.getAdress().getCodeInsee());
        return adress;
    }
}
