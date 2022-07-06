package com.projetoS.user.enumeration;

import lombok.Getter;

@Getter
public enum UserType {

    ADMIN(1, "Admin"),
    NUTRITIONIST(2, "Nutricionista"),
    PERSONAL_TRAINER(3, "Personal Trainer"),
    CLIENTE(4, "Cliente");

    UserType(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int id;
    public String description;

}
