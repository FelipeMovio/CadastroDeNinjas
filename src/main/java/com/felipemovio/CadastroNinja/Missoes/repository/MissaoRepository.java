package com.felipemovio.CadastroNinja.Missoes.repository;

import com.felipemovio.CadastroNinja.Missoes.entity.Missao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository<Missao, Long> {
}
