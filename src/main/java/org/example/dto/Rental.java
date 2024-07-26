package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Rental {
    private Long rentalId;
    private String rentalDate;
    private String returnDate;
    private String expectedReturnDate;
    private double fine;
    private double totalCost;
}
