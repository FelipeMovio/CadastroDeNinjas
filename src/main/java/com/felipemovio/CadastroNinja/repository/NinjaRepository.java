package com.felipemovio.CadastroNinja.repository;

import com.felipemovio.CadastroNinja.entitys.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
