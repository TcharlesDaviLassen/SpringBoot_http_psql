package mustache.mustache.service;

import org.springframework.data.jpa.repository.JpaRepository;
import mustache.mustache.model.Quadrinho;

import java.util.List;

public interface QuadrinhoRepository extends JpaRepository<Quadrinho, Long> {
    List<Quadrinho> findByEditora(String editora);

    List<Quadrinho> findByTitulo(String titulo);

}
