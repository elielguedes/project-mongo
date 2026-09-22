package com.gsDev.workShopMongo.config;

import com.gsDev.workShopMongo.domain.User;
import com.gsDev.workShopMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class instatiet implements CommandLineRunner {

    @Autowired
    private UserRepository Userrepository;

    @Override
    public void run(String... args) throws Exception {
        Userrepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        Userrepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
