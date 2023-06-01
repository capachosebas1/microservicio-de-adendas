package service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import model.adenda;
import repository.adendarepository;

@Service

@RequiredArgsConstructor

public class adendaservice {
    private final adendarepository adendarepository;

    public void save (adenda adenda)
    {
        adendarepository.save(adenda);
    }

    public List<adenda> findAll(){
        return adendarepository.findAll();
    }

    public Optional<adenda> findbyid(String id){
        return adendarepository.findById(id);
    }

    public void deletebyid(String id){
        adendarepository.deleteById(id);
    }
}
