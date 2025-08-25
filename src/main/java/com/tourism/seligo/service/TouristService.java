package com.tourism.seligo.service;

import com.tourism.seligo.dto.*;

import java.util.List;

public interface TouristService {
    TouristDto createTourist(TouristDto touristDto);
    TouristDto updateTourist(Integer touristId, TouristDto touristDto);
    TouristDto getTouristById(Integer touristId);
    List<TouristDto> getAllTourists();

    // View other profiles
    List<GuideDto> getAllGuides();
    List<HotelDto> getAllHotels();
    List<SellerDto> getAllSellers();
    List<DriverDto> getAllDrivers();

    // Booking & Order (placeholders)
    String bookTour(Integer touristId, Integer bookingId);
    String placeOrder(Integer touristId, Integer orderId);

}
