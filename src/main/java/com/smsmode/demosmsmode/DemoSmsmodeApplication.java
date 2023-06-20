package com.smsmode.demosmsmode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan({
		"com.smsmode.demosmsmode"
})
@EnableTransactionManagement
public class DemoSmsmodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSmsmodeApplication.class, args);
	}

}
