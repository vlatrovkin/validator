package com.example.validator.controller;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Model {

    @NotNull(message = "{notNull.message}")
    private String name;
}
