package com.felipemovio.CadastroNinja.Ninjas.controller;


import com.felipemovio.CadastroNinja.Ninjas.entitys.Ninja;
import com.felipemovio.CadastroNinja.Ninjas.services.NinjaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
@RequiredArgsConstructor
public class NinjaControlle {

    @Autowired
    private NinjaService ninjaService;

    // Criar Ninja
    @PostMapping
    public void criarNinja(@RequestBody Ninja ninja){
        ninjaService.cadastraNinja(ninja);
    }

//    ver todos ninjas criados
    @GetMapping
    public ResponseEntity<List<Ninja>> verTodosNinjas(){
        List<Ninja> ninjas = ninjaService.verNinjas();
        return ResponseEntity.ok(ninjas);
    }

    @DeleteMapping("/{id}")
    public void deletarNinja(@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }
}
