package com.felipemovio.CadastroNinja.Missoes.controller;

import com.felipemovio.CadastroNinja.Missoes.entity.Missao;
import com.felipemovio.CadastroNinja.Missoes.services.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    @Autowired
    private MissaoService service;


    // Criando missao
    @PostMapping
    public void criarMissao(@RequestBody Missao missao){
        service.criarMissao(missao);
    }

    // Ver todas que ja foram criadas
    @GetMapping
    public ResponseEntity<List<Missao>> verTodas(){
        List<Missao> missaos = new ArrayList<>();
        return ResponseEntity.ok(missaos);
    }

    // deletar missao
    @DeleteMapping("/{id}")
    public void deletarMissao(@PathVariable Long id){
        service.deletarMissao(id);
    }


}
