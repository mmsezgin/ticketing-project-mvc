package com.cybertek.enums;

import lombok.Getter;

@Getter
public enum Gender {

    MALE("Male"),FEMALE("Female");
    private final String value;

    private  Gender(String value) {
       this.value=value;
    }

    public String getValue(){
        return  value;
    }

}
