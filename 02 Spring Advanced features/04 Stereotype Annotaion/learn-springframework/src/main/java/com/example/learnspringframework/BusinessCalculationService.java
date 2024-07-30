package com.example.learnspringframework;

import org.springframework.stereotype.Service;

import java.util.Arrays;

// @Component
@Service
public class BusinessCalculationService {

    private MongoDBDataService dataService;

    public BusinessCalculationService(MongoDBDataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
