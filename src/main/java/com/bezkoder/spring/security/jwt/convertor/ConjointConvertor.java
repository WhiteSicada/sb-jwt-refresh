package com.bezkoder.spring.security.jwt.convertor;

import com.bezkoder.spring.security.jwt.models.demo.Conjoint;
import com.bezkoder.spring.security.jwt.payload.request.ClientCreationRequest;
import org.springframework.stereotype.Component;

@Component
public class ConjointConvertor {

    public Conjoint dtoToEntity(ClientCreationRequest clientCreationRequest) {
        Conjoint conjoint = new Conjoint();
        conjoint.setFirstName(clientCreationRequest.getConjoint().getFirstName());
        conjoint.setLastName(clientCreationRequest.getConjoint().getLastName());
        conjoint.setCivility(clientCreationRequest.getConjoint().getCivility());
        conjoint.setIsDisabled(clientCreationRequest.getConjoint().getIsDisabled());
        conjoint.setNumeroSecuriteSocial(clientCreationRequest.getConjoint().getNumeroSecuriteSocial());
        conjoint.setNumeroOrganisme(clientCreationRequest.getConjoint().getNumeroOrganisme());
        conjoint.setBeneficiaryOf(clientCreationRequest.getConjoint().getBeneficiaryOf());
        conjoint.setDateNaissanceConjoint(clientCreationRequest.getConjoint().getDateNaissanceConjoint());
        conjoint.setRegimeSocialConjoint(clientCreationRequest.getConjoint().getRegimeSocialConjoint());
        return conjoint;
    }
}
