package com.felipemovio.CadastroNinja.services;

import com.felipemovio.CadastroNinja.entitys.Ninja;
import com.felipemovio.CadastroNinja.repository.NinjaRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class NInjaService {

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
