package com.felipemovio.CadastroNinja.Ninjas.entitys;


import com.felipemovio.CadastroNinja.Missoes.entity.Missao;
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
@Table(name = "ninjas")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private Integer idade;

    // @ManyToOne varias ninjas em uma unica missao
    @ManyToOne
    @JoinColumn(name = "missao_name") // chave estrangeira
    private  Missao missao;
}
