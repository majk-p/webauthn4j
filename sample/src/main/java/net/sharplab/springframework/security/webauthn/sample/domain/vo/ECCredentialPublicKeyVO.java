package net.sharplab.springframework.security.webauthn.sample.domain.vo;

import com.webauthn4j.attestation.authenticator.Curve;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ECCredentialPublicKeyVO extends AbstractCredentialPublicKeyVO {

    private Curve curve;
    private byte[] x;
    private byte[] y;
    private byte[] d;

}