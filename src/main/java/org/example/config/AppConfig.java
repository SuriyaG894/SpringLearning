package org.example.config;

import org.example.model.Alien;
import org.example.model.Computer;
import org.example.model.Desktop;
import org.example.model.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = {"desk","com2"})// we can set more than one bean name for individual bean
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }

    @Bean
    public Alien alien(@Qualifier("laptop") Computer computer){
        Alien alien = new Alien();
        alien.setComputer(computer);
        return alien;
    }

}
