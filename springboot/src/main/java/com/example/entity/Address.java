package com.example.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    private Integer userId;
    private String username;
    private String useraddress;
    private String phone;
}