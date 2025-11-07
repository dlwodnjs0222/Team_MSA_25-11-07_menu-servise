package com.du.menuservice.service;

import com.du.menuservice.entity.Menu;
import com.du.menuservice.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    public List<Menu> findByCoffee(String coffee) {
        return menuRepository.findByName(coffee);
    }

    public List<Menu> findByTea(String tea) {
        return menuRepository.findByName(tea);
    }

    public List<Menu> findByShake(String shake) {
        return menuRepository.findByShake(shake);
    }

    public List<Menu> findByAde(String ade) {
        return menuRepository.findByName(ade);
    }

    public List<Menu>  findBySmoothie(String smoothie) {
        return menuRepository.findByName(smoothie);
    }

    public List<Menu> findByDrink(String drink) {
        return menuRepository.findByName(drink);
    }

    public List<Menu> findByDecaffeination(String  decaffeination) {
        return menuRepository.findByName(decaffeination);
    }

    public List<Menu> findByNewOne(String newOne) {
        return menuRepository.findByName(newOne);
    }

    public List<Menu> findByExtra(String extra) {
        return menuRepository.findByName(extra);
    }

    public Menu save(Menu menu) {
        return menuRepository.save(menu);
    }


    public void delete(Menu menu) {
        menuRepository.delete(menu);
    }
}
