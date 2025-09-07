package com.felipemovio.CadastroNinja.Ninjas.services;

import com.felipemovio.CadastroNinja.Ninjas.entitys.Ninja;
import com.felipemovio.CadastroNinja.Ninjas.repository.NinjaRepository;
import lombok.RequiredArgsConstructor;
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
