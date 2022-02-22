package com.bezkoder.spring.security.jwt.convertor;

import com.bezkoder.spring.security.jwt.models.demo.Adress;
import com.bezkoder.spring.security.jwt.models.demo.Client;
import com.bezkoder.spring.security.jwt.models.demo.Conjoint;
import com.bezkoder.spring.security.jwt.payload.request.ClientCreationRequest;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ClientConvertor {

//    public EquipeDto entityToDto(Equipe equipe){
//        EquipeDto equipeDto = new EquipeDto();
//        equipeDto.setId(equipe.getId());
//        equipeDto.setName(equipe.getName());
//        return equipeDto;
//    }
//    public List<EquipeDto> entitiesToDtos(List<Equipe> equipeList){
//        return equipeList.stream().map(this::entityToDto).collect(Collectors.toList());
//    }

    public Client dtoToEntity(ClientCreationRequest clientCreationRequest, Adress adress, Conjoint conjoint) {
        return new Client(
                clientCreationRequest.getDateNaissanceSouscripteur(),
                clientCreationRequest.getRegimeSocialSouscripteur(),
                clientCreationRequest.getNom(),
                clientCreationRequest.getPrenom(),
                clientCreationRequest.getCivilite(),
                clientCreationRequest.getEmail(),
                clientCreationRequest.getPhone(),
                clientCreationRequest.getMobile(),
                clientCreationRequest.getIsDisabled(),
                clientCreationRequest.getImatriculation(),
                clientCreationRequest.getBirthPlace(),
                clientCreationRequest.getBirthCountry(),
                clientCreationRequest.getDateEffet(),
                clientCreationRequest.getDateEffetComplementaire(),
                clientCreationRequest.getNonFumeur(),
                clientCreationRequest.getNonPrisEnChargeCentPourCentSecu(),
                clientCreationRequest.getNonTitulaireRenteInvalidite(),
                clientCreationRequest.getPasEnArretProfessionnelle(),
                adress,
                conjoint
        );
    }
}
