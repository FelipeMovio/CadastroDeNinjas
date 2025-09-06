package com.felipemovio.CadastroNinja.Missoes.entity;

import com.felipemovio.CadastroNinja.NInjas.entitys.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Missao")
public class Missao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private Dificuldade dificuldade;


    // @OneToManny uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missao")
    private Ninja ninja;
}
