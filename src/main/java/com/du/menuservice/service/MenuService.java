package com.du.menuservice.service;

import com.du.menuservice.entity.Menu;
import com.du.menuservice.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    public Optional<Menu> findById(Long id) {
        return menuRepository.findById(id);
    }

    public void save(Menu menu) {
        menuRepository.save(menu);
    }

    public void deleteById(Long id) {
        menuRepository.deleteById(id);
    }
}
