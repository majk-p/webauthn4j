package com.webauthn4j.validator.attestation;

import com.webauthn4j.attestation.statement.AttestationStatement;
import com.webauthn4j.attestation.statement.AttestationType;
import com.webauthn4j.attestation.statement.NoneAttestationStatement;
import com.webauthn4j.validator.RegistrationObject;

public class NoneAttestationStatementValidator implements AttestationStatementValidator {

    @Override
    public AttestationType validate(RegistrationObject registrationObject) {
        return AttestationType.None;
    }

    @Override
    public boolean supports(RegistrationObject registrationObject) {
        AttestationStatement attestationStatement = registrationObject.getAttestationObject().getAttestationStatement();
        return NoneAttestationStatement.class.isAssignableFrom(attestationStatement.getClass());
    }
}
