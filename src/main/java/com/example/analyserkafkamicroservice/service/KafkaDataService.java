package com.example.analyserkafkamicroservice.service;

import com.example.analyserkafkamicroservice.model.Data;
import org.springframework.stereotype.Service;

@Service
public interface KafkaDataService {

    void handle(Data data);

}
