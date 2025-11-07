package com.du.menuservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "menu_db")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String coffee;

    private String tea;

    private String shake;

    private String ade;

    private String smoothie;

    private String decaffeination;

    private String drink;

    private String newOne;

    private String extra;

}
