package com.vladis1350;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalProjectJavaOneApplication {

	public static void main(String[] args) {
		if(args.length == 0) {
			SpringApplication.run(FinalProjectJavaOneApplication.class, args);
		} else
			System.out.println("Unknown arguments");
	}

}
