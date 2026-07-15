package com.fullstack.tickets.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTicketTypeResponseDto {
   private UUID id;


   private String name;

   private Double price;

   private String description;

   private Integer totalAvailable;

   private LocalDate createdAt;

   private LocalDate updatedAt;
}
