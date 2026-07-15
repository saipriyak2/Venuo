package com.fullstack.tickets.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTicketTypeResponseDto {
   private UUID id;
   private String name;
   private Double price;
   private String description;
   private Integer totalAvailable;
   private LocalDate createdAt;
   private LocalDate updatedAt;
}
