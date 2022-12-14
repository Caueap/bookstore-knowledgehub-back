package com.api2.bookstore.mappers;

import com.api2.bookstore.dtos.rentaldto.RentalDeliveryDto;
import com.api2.bookstore.dtos.rentaldto.RentalReqDelDto;
import com.api2.bookstore.dtos.rentaldto.RentalRequestDto;
import com.api2.bookstore.dtos.rentaldto.RentalResponseDto;
import com.api2.bookstore.models.RentalModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RentalMapper {

    RentalMapper INSTANCE = Mappers.getMapper(RentalMapper.class);

    RentalModel toModel(RentalRequestDto rentalRequestDto);

//    RentalModel toModel(RentalResponseDto rentalResponseDto);

    RentalModel toModel(RentalReqDelDto rentalReqDelDto);

//    RentalResponseDto toDTO(RentalModel rentalModel);

    RentalDeliveryDto toDTO(RentalModel rentalModel);






}
