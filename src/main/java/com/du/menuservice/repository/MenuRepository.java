package com.du.menuservice.repository;

import com.du.menuservice.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {

    List<Menu> findByName(String name);

    List<Menu> findByPrice(int price);

    List<Menu> findBySize(int size);

    List<Menu> findByShake(String shake);
}
