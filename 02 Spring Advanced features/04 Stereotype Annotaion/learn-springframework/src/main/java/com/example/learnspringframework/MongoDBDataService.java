package com.example.learnspringframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component
@Primary
@Repository
public class MongoDBDataService implements DataService{

    public int[] retrieveData() {
        return new int[]{1,2,3,4,5,6,7,8,9,10};
    }
}
