package com.felipemovio.CadastroNinja.config;

import com.felipemovio.CadastroNinja.Missoes.entity.Dificuldade;
import com.felipemovio.CadastroNinja.Missoes.entity.Missao;
import com.felipemovio.CadastroNinja.Missoes.repository.MissaoRepository;
import com.felipemovio.CadastroNinja.Ninjas.entitys.Ninja;
import com.felipemovio.CadastroNinja.Ninjas.repository.NinjaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PopularTabela {

    @Bean
    CommandLineRunner popularBanco(NinjaRepository ninjaRepository, MissaoRepository missaoRepository) {
        return args -> {
            if (ninjaRepository.count() == 0) {

                
                List<Ninja> ninjas = new ArrayList<>();
                ninjas.add( new Ninja(null, "Carlos Silva", "carlos@email.com", 22,
                        null));
                ninjas.add(new Ninja(null, "Davi Rodrigues", "Rod@email.com", 20,
                        null));
                ninjas.add(new Ninja(null, "Naruto Yagami", "Yagami@email.com", 16,
                       null ));

                for (Ninja ninja : ninjas) {
                    ninjaRepository.saveAll(List.of(ninja));
                }


                Missao missao1 = new Missao(null, "investigarAkatsuki", Dificuldade.dificil, null);

                missaoRepository.saveAll(List.of(missao1));

                System.out.println(" populados com sucesso!");
            }
        };
    }
}

