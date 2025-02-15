package com.tokiomarine.agendamento_transferencias.repository;


import com.tokiomarine.agendamento_transferencias.Entity.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {

}
