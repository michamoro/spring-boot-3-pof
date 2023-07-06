package com.poc;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Nonnull
    @NotBlank
    private String titulo;

    @Nonnull
    @NotNull
    @Positive
    private Float precio;

    public Curso(@NotNull String titulo, float v) {
        this.titulo = titulo;
        this.precio = v;
    }

    public Curso() {
    }
}
