package br.com.techugo.forum.repository;

import br.com.techugo.forum.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {

    Curso findByNome(String nome);
}
