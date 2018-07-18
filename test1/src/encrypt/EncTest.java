package encrypt;

import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class EncTest {

	public static void main(String[] args) {
		String a = "hrxfqKD5GH8eAP937rPbxS3NnLUlnUa52u\\/PKNL3be90T2vORJoWaHq7m2ConXhWVzXLhtsmNVi0Lx2qiC6K9w==";
		String b = enc(a);
		String c = decrypt(a); 
		
		System.out.println("encrypt : "+ b);
		System.out.println("decrypt : "+c);
		
	}

	private static StandardPBEStringEncryptor getEncryptor() {
		Security.addProvider(new BouncyCastleProvider());
		StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
		pbeEnc.setProviderName("BC");
		pbeEnc.setAlgorithm("PBEWITHSHA256AND128BITAES-CBC-BC");
		pbeEnc.setPassword("env");
		return pbeEnc;
	}
	
	private static String decrypt(String encText) {
		StandardPBEStringEncryptor pbeEnc = getEncryptor();
		return pbeEnc.decrypt(encText);
	}
	
	private static String enc(String plainText) {
		StandardPBEStringEncryptor pbeEnc = getEncryptor();
		return pbeEnc.encrypt(plainText);
	}

}
