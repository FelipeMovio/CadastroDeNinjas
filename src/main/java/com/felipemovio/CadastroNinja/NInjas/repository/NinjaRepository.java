package com.felipemovio.CadastroNinja.NInjas.repository;

import com.felipemovio.CadastroNinja.NInjas.entitys.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
