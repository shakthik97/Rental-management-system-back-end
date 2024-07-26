package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Item {

    private Long itemId;
    private String itemName;
    private boolean availability;
    private double rentalPerDay;
    private double finePerDay;
}
