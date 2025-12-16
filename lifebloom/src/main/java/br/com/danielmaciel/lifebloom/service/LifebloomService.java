package br.com.danielmaciel.lifebloom.service;

import br.com.danielmaciel.lifebloom.entity.Lifebloom;
import br.com.danielmaciel.lifebloom.repository.LifebloomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LifebloomService {
    private LifebloomRepository lifebloomRepository;

    public LifebloomService(LifebloomRepository lifebloomRepository) {
        this.lifebloomRepository = lifebloomRepository;
    }
    public List<Lifebloom> list() {
        return lifebloomRepository.findAll();
    }

    public List<Lifebloom> create(Lifebloom lifebloom) {
        lifebloomRepository.save(lifebloom);
        return list();
    }
    public List<Lifebloom> update(Lifebloom lifebloom) {
        lifebloomRepository.save(lifebloom);
        return list();
    }
    public List<Lifebloom> delete(Long id) {
        lifebloomRepository.deleteById(id);
        return list();
    }
}