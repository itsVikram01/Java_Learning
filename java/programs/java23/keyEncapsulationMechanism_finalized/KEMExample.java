package java23.keyEncapsulationMechanism_finalized;

import javax.crypto.KeyAgreement;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

// KEM encapsulates a symmetric key using a recipient's public key.
// The recipient can then decapsulate the symmetric key using their private key.
public class KEMExample {
    public static void main(String[] args) throws Exception {
        // Step 1: Generate a key pair for the recipient
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("X25519");
        keyPairGenerator.initialize(256);
        KeyPair recipientKeyPair = keyPairGenerator.generateKeyPair();

        // Step 2: Extract the public key (to share with the sender)
        PublicKey recipientPublicKey = recipientKeyPair.getPublic();

        // Step 3: Sender generates an ephemeral key pair
        KeyPair senderEphemeralKeyPair = keyPairGenerator.generateKeyPair();
        PrivateKey senderEphemeralPrivateKey = senderEphemeralKeyPair.getPrivate();
        PublicKey senderEphemeralPublicKey = senderEphemeralKeyPair.getPublic();

        // Step 4: Sender performs key agreement (encapsulation)
        KeyAgreement senderKeyAgreement = KeyAgreement.getInstance("X25519");
        senderKeyAgreement.init(senderEphemeralPrivateKey);
        senderKeyAgreement.doPhase(recipientPublicKey, true);
        byte[] sharedSecret = senderKeyAgreement.generateSecret();

        // Step 5: Encapsulated key (the sender sends this to the recipient)
        byte[] encapsulatedKey = senderEphemeralPublicKey.getEncoded();

        System.out.println("Encapsulated Key (to send): " + Base64.getEncoder().encodeToString(encapsulatedKey));
        System.out.println("Shared Secret (sender's side): " + Base64.getEncoder().encodeToString(sharedSecret));

        // Step 6: Recipient performs key agreement (decapsulation)
        KeyAgreement recipientKeyAgreement = KeyAgreement.getInstance("X25519");
        recipientKeyAgreement.init(recipientKeyPair.getPrivate());
        //recipientKeyAgreement.doPhase(KeyFactory.getInstance("X25519").generatePublic(new X509EncodedKeySpec(encapsulatedKey)), true);
        byte[] recoveredSecret = recipientKeyAgreement.generateSecret();

        System.out.println("Shared Secret (recipient's side): " + Base64.getEncoder().encodeToString(recoveredSecret));

        // Validate that the shared secrets match
        if (Base64.getEncoder().encodeToString(sharedSecret).equals(Base64.getEncoder().encodeToString(recoveredSecret))) {
            System.out.println("Shared secrets match!");
        } else {
            System.out.println("Shared secrets do not match!");
        }
    }
}
