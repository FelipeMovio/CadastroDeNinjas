package com.felipemovio.CadastroNinja.Missoes.services;

import com.felipemovio.CadastroNinja.Missoes.entity.Missao;
import com.felipemovio.CadastroNinja.Missoes.repository.MissaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MissaoService {

    @Autowired
    private MissaoRepository missaoRepository;

    // criar missao
    public void criarMissao(Missao missao){
        missaoRepository.saveAndFlush(missao);
    }

    // ver todas missoes
    public List<Missao> verMissoes(){
        return missaoRepository.findAll();
    }

    // deletar missao
    public void deletarMissao(Long id){
        missaoRepository.deleteById(id);
    }
}
