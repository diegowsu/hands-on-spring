package io.github.dgalhardi.domain.repository;

import io.github.dgalhardi.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
