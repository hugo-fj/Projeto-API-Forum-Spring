package br.com.techugo.forum.controller;

import br.com.techugo.forum.controller.dto.TopicoDto;
import br.com.techugo.forum.modelo.Curso;
import br.com.techugo.forum.modelo.Topico;
import br.com.techugo.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @GetMapping ("/topicos")
    public List<TopicoDto> lista(){
        List<Topico>topicos = topicoRepository.findAll();
        return TopicoDto.converter(topicos);
    }


}
