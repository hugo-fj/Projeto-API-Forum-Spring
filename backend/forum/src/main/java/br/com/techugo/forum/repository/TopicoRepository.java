package br.com.techugo.forum.repository;

import br.com.techugo.forum.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico,Long> {

    Page<Topico> findByCurso_Nome(String nomeCurso, Pageable paginacao);

}
