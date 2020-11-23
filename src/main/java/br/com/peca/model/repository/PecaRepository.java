package br.com.peca.model.repository;

import br.com.peca.model.domain.Peca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Integer> {
}
