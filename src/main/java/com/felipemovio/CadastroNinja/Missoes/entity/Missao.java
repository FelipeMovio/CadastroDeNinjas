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
@Table(name = "Missoes")
public class Missao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeMissao;
    private Dificuldade dificuldade;

    @JoinColumn(name = "Ninja_id")
    @OneToMany
    private Ninja ninja;
}
