package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.adenda;

@Repository
public interface adendarepository extends MongoRepository<adenda,String>{
    
}
