package com.example.inheritencesingletable;

import com.example.inheritencesingletable.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InheritenceSingleTableApplication {

    private final IDatabase iDatabase;

    public InheritenceSingleTableApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(InheritenceSingleTableApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return args -> {
            iDatabase.createTable();

        };
    }
}
