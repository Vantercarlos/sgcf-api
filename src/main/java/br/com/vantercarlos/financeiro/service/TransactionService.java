package br.com.vantercarlos.financeiro.service;

import br.com.vantercarlos.financeiro.entity.Transaction;
import br.com.vantercarlos.financeiro.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> findById(long id) {
        return transactionRepository.findById(id);
    }

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public String delete(long id) {
        transactionRepository.deleteById(id);
        return "Item Excluído com sucesso!";
    }

    public Transaction update(Transaction updatedTransaction, long id) {
        Optional<Transaction> optionalTransaction = transactionRepository.findById(id);

        if (optionalTransaction.isPresent()) {
            Transaction existingTransaction = optionalTransaction.get();
            existingTransaction.setDescricao(updatedTransaction.getDescricao());
            existingTransaction.setAmount(updatedTransaction.getAmount());
            existingTransaction.setDate(updatedTransaction.getDate());

            return transactionRepository.save(existingTransaction);
        } else {
            throw new RuntimeException("Transaction not found with id: " + id);
        }
    }
}
