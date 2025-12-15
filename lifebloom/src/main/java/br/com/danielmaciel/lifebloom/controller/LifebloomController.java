package br.com.danielmaciel.lifebloom.controller;

import br.com.danielmaciel.lifebloom.entity.Lifebloom;
import br.com.danielmaciel.lifebloom.repository.LifebloomRepository;
import br.com.danielmaciel.lifebloom.service.LifebloomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lifebloom")

public class LifebloomController {
    private LifebloomService lifebloomService;

    public LifebloomController(LifebloomService lifebloomService) {
        this.lifebloomService = lifebloomService;
    }

    @PostMapping
    List<Lifebloom> create(@RequestBody Lifebloom lifebloom) {
        return lifebloomService.create(lifebloom);
    }

    @GetMapping
    List<Lifebloom> list() {
        return lifebloomService.list();
    }
    @PutMapping
    List<Lifebloom> update(@RequestBody Lifebloom lifebloom) {
        return lifebloomService.update(lifebloom);
    }
    @DeleteMapping("{id}")
    List<Lifebloom> delete(@PathVariable("id")Long id) {
        return lifebloomService.delete(id);
    }
}