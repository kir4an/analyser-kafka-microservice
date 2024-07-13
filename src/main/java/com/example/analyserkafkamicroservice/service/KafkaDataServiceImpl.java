package com.example.analyserkafkamicroservice.service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

    private final com.example.dataanalysermicroservice.repository.DataRepository dataRepository;

    @Override
    public void handle(com.example.dataanalysermicroservice.model.Data data) {
        log.info("Data object {} was saved", data);
        dataRepository.save(data);
    }

}

