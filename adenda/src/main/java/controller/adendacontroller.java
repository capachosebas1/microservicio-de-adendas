package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import model.adenda;
import service.adendaservice;

@RestController
@RequestMapping("/adenda")
@RequiredArgsConstructor
public class adendacontroller {

    private final adendaservice adendaservice;
    
    @PostMapping("/create")
    public void save(@RequestBody adenda adenda){
        adendaservice.save(adenda);
    }

    @GetMapping("/adendas")
    public List<adenda> findAll(){
        return adendaservice.findAll();
    }

    @GetMapping("/adenda/{id}")
    public adenda findbyid(@PathVariable String id){
        return adendaservice.findbyid(id).get();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id){
        adendaservice.deletebyid(id);

    }

    @PutMapping("/put")
    public void update(@RequestBody adenda adenda){
        adendaservice.save(adenda);
    }
    
}
