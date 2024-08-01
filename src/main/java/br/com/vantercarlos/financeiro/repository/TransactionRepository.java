package br.com.vantercarlos.financeiro.repository;

import br.com.vantercarlos.financeiro.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
