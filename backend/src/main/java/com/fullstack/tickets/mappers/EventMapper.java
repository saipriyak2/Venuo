package com.fullstack.tickets.mappers;


import com.fullstack.tickets.domain.CreateEventRequest;
import com.fullstack.tickets.domain.CreateTicketTypeRequest;
import com.fullstack.tickets.domain.UpdateEventRequest;
import com.fullstack.tickets.domain.UpdateTicketTypeRequest;
import com.fullstack.tickets.domain.dtos.*;
import com.fullstack.tickets.domain.entities.Event;
import com.fullstack.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {
    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);
    CreateEventRequest fromDto(CreateEventRequestDto dto);
    CreateEventResponseDto toDto(Event event);

    ListEventTicketTypeResponseDto toDto(TicketType ticketType);
    ListEventResponseDto toListEventResponseDto(Event event);

    GetEventTicketTypesResponseDto toGetEventTicketTypesResponseDto(TicketType ticketType);
    GetEventDetailsResponseDto toGetEventDetailsResponseDto(Event event);

    UpdateTicketTypeRequest fromDto(UpdateTicketTypeRequestDto dto);
    UpdateEventRequest fromDto(UpdateEventRequestDto dto);
    UpdateTicketTypeResponseDto toUpdateTicketTypeResponseDto(TicketType ticketType);
    UpdateEventResponseDto toUpdateEventResponseDto(Event event);

    ListPublishedEventResponseDto toListPublishedEventResponseDto(Event event);
    GetPublishedEventDetailsTicketTypeResponseDto  toGetPublishedEventDetailsTicketTypeResponseDto(TicketType ticketType);
    GetPublishedEventDetailsResponseDto toGetPublishedEventDetailsResponseDto(Event event);

}


