package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Customer {

    private Long id;
    private String name;
    private String city;
    private String contact;
}
