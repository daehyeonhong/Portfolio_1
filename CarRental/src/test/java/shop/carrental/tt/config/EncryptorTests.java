package shop.carrental.tt.config;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.registry.AlgorithmRegistry;
import org.jasypt.salt.StringFixedSaltGenerator;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration(classes = { RootConfig.class })
public class EncryptorTests {

	@Ignore
	@Test
	public void encryptTest() {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("portfolio");
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		encryptor.setSaltGenerator(new StringFixedSaltGenerator("portfolio1234"));
		String str = "testString";
		String enc = encryptor.encrypt(str);
		String dec = encryptor.decrypt(enc);
		log.info("str ==> " + str + ", enc ==> " + enc + ", dec ==> " + dec);
	}

	@Test
	public void checkSupportAlgorithm() {
		List<Object> supported = new ArrayList<Object>();
		List<Object> unSupported = new ArrayList<Object>();
		for (Object algorithm : AlgorithmRegistry.getAllPBEAlgorithms()) {
			try {
				StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
				encryptor.setPassword("1234");
				encryptor.setAlgorithm(String.valueOf(algorithm));

				String str = "testString";
				String enc = encryptor.encrypt(str);
				String dec = encryptor.decrypt(enc);
				assertTrue(str.equals(dec));
				supported.add(algorithm);
			} catch (Exception e) {
				unSupported.add(algorithm);
			}
		}
	}

	@Ignore
	@Test
	public void encryptSimpleTest() {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		encryptor.setPassword("portfolio");
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		String str = "testString";
		String enc = encryptor.encrypt(str);
		String dec = encryptor.decrypt(enc);
		log.info("str ==> " + str + ", enc ==> " + enc + ", dec ==> " + dec);
	}

}