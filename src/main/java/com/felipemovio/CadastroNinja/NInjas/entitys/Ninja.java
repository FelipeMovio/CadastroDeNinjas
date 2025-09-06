package com.felipemovio.CadastroNinja.NInjas.entitys;


import com.felipemovio.CadastroNinja.Missoes.entity.Missao;
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
@Table(name = "cadastro-de-ninjas")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private Integer idade;

    @OneToMany(mappedBy = "cadastro-de-ninjas")
    private List<Missao> missao;
}
