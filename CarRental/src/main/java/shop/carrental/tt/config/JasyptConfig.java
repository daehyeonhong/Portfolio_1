package shop.carrental.tt.config;

import java.util.Base64;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.jasypt.salt.SaltGenerator;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfig {

	private static final String ENCRYPT_KEY = "portfolio";

	public StringEncryptor stringEncryptor() {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPassword(ENCRYPT_KEY);
		config.setAlgorithm("PBEWithMD5AndDES");
		config.setKeyObtentionIterations(1000);
		config.setPoolSize(1);
		config.setProviderName("hong");
		config.setSaltGeneratorClassName(SaltGenerator.class.getName());
		config.setStringOutputType(Base64.class.getName());
		encryptor.setConfig(config);
		return encryptor;
	}

}