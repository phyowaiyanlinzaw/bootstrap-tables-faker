package com.example.testdatatableswithfaker;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {

    private Long id;
    private String email;
    private String name;
    private String department;
    private String role;
    private int projectCount;
}
