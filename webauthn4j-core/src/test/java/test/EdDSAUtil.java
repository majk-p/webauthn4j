package test;

import com.webauthn4j.util.exception.UnexpectedCheckedException;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.security.*;

public class EdDSAUtil {

    public static @NonNull KeyPair createKeyPair() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("Ed25519");
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new UnexpectedCheckedException(e);
        }
    }
}
