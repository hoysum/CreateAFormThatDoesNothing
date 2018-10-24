package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Forms {
    @NotNull
    @Size(min=3, max=20)
    private String Username;

    @NotNull
    @Size(min=3, max=20)
    private String password;
}
