package com.example.regcont;

import com.example.regcont.repository.AsientoRepo;
import com.example.regcont.repository.CuentaRepo;
import com.example.regcont.repository.MayorRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class RegContApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegContApplication.class, args);
    }
}
