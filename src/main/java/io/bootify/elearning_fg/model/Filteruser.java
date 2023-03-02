package io.bootify.elearning_fg.model;

import jakarta.validation.constraints.Size;


public class Filteruser {

    @Size(max = 255)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

}
