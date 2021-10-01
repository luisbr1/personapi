package com.digitalInovation.personapi.enums;

import lombok.Getter;

@Getter

public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    public String description;

    PhoneType(String description) {
        this.description = description;
    }

}
