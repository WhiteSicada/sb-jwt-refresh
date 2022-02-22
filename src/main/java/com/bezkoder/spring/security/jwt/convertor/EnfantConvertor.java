package com.bezkoder.spring.security.jwt.convertor;

import com.bezkoder.spring.security.jwt.models.demo.Adress;
import com.bezkoder.spring.security.jwt.models.demo.Enfant;
import com.bezkoder.spring.security.jwt.payload.request.ClientCreationRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EnfantConvertor {

    public List<Enfant> dtoToEntity(ClientCreationRequest clientCreationRequest) {
        List<Enfant> enfantList = clientCreationRequest.getEnfantList();
        return enfantList.stream().map(enfant -> {
            return new Enfant(
                    enfant.getDateNaissance(),
                    enfant.getRegimeSocial(),
                    enfant.getJustificatif(),
                    enfant.getFirstName(),
                    enfant.getLastName(),
                    enfant.getCivility(),
                    enfant.getIsDisabled(),
                    enfant.getNumeroSecuriteSocial(),
                    enfant.getNumeroOrganisme(),
                    enfant.getBeneficiaryOf()
            );
        }).collect(Collectors.toList());
    }

}
