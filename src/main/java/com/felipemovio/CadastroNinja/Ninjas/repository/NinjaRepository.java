package com.felipemovio.CadastroNinja.Ninjas.repository;

import com.felipemovio.CadastroNinja.Ninjas.entitys.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
