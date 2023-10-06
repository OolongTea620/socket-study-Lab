package com.bid.soketstudy.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {
    @Value("${}")
    private String uri;
    @Value("${}")
    private String databaseName;
    @Bean
    public MongoDatabase mongoDatabase() throws Exception{
        MongoClient mongoClient = MongoClients.create(uri); //URI insert
        return mongoClient.getDatabase(databaseName); //database name;
    }
}
