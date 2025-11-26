package com.felipemovio.CadastroNinja.Missoes.entity;

import com.felipemovio.CadastroNinja.Ninjas.entitys.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Missao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private Dificuldade dificuldade;


    // @OneToManny uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missao")
    private List<Ninja> ninja;
}
