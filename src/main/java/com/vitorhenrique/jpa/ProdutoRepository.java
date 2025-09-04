package com.vitorhenrique.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    @Query("SELECT COUNT(*) FROM Produto")
    Long countQuantityOfProduto();
    @Query("SELECT Nome FROM Produto ORDER BY Nome ASC")
    List<String> orderByProdutoName();
    List<Produto> findBynomeStartingWith(String prefix);
}