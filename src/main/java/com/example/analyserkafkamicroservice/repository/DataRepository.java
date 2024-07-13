package com.example.analyserkafkamicroservice.repository;


import com.example.analyserkafkamicroservice.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
