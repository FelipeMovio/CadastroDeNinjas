package com.felipemovio.CadastroNinja.Ninjas.services;


import com.felipemovio.CadastroNinja.Ninjas.entitys.Ninja;
import com.felipemovio.CadastroNinja.Ninjas.repository.NinjaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    // criar
    public void cadstraNinja(Ninja ninja){
        ninjaRepository.saveAndFlush(ninja);
    }

    // ver todos criados
    public List<Ninja> verNinjas(){
        return ninjaRepository.findAll();
    }

    // deletar
    public void deletarNinja(Long id){
        ninjaRepository.deleteById(id);
    }
}
