package com.tourism.seligo.service.Impl;

import com.tourism.seligo.dto.*;
import com.tourism.seligo.entity.Booking;
import com.tourism.seligo.entity.Order;
import com.tourism.seligo.entity.Tourist;
import com.tourism.seligo.repo.*;
import com.tourism.seligo.service.TouristService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TouristServiceImpl implements TouristService {
    private final TouristRepo touristRepo;
    private final GuideRepo guideRepo;
    private final HotelRepo hotelRepo;
    private final SellerRepo sellerRepo;
    private final DriverRepo driverRepo;
    private final BookingRepo bookingRepo;
    private final OrderRepo orderRepo;
    private final ModelMapper modelMapper;

    @Autowired
    public TouristServiceImpl(TouristRepo touristRepo, GuideRepo guideRepo, HotelRepo hotelRepo, SellerRepo sellerRepo, DriverRepo driverRepo, BookingRepo bookingRepo, OrderRepo orderRepo, ModelMapper modelMapper) {
        this.touristRepo = touristRepo;
        this.guideRepo = guideRepo;
        this.hotelRepo = hotelRepo;
        this.sellerRepo = sellerRepo;
        this.driverRepo = driverRepo;
        this.bookingRepo = bookingRepo;
        this.orderRepo = orderRepo;
        this.modelMapper = modelMapper;
    }


    // ---------------- Tourist CRUD ----------------
    @Override
    public TouristDto createTourist(TouristDto touristDto) {
        Tourist tourist = modelMapper.map(touristDto, Tourist.class);
        Tourist savedTourist = touristRepo.save(tourist);
        return modelMapper.map(savedTourist, TouristDto.class);
    }

    @Override
    public TouristDto updateTourist(Integer touristId, TouristDto touristDto) {
        Tourist existingTourist = touristRepo.findById(touristId)
                .orElseThrow(() -> new RuntimeException("Tourist not found"));

        modelMapper.map(touristDto, existingTourist);
        Tourist updatedTourist = touristRepo.save(existingTourist);
        return modelMapper.map(updatedTourist, TouristDto.class);
    }

    @Override
    public TouristDto getTouristById(Integer touristId) {
        Tourist tourist = touristRepo.findById(touristId)
                .orElseThrow(() -> new RuntimeException("Tourist not found"));
        return modelMapper.map(tourist, TouristDto.class);
    }

    @Override
    public List<TouristDto> getAllTourists() {
        return touristRepo.findAll()
                .stream()
                .map(t -> modelMapper.map(t, TouristDto.class))
                .collect(Collectors.toList());
    }

    // ---------------- View Other Entities ----------------
    @Override
    public List<GuideDto> getAllGuides() {
        return guideRepo.findAll()
                .stream()
                .map(g -> modelMapper.map(g, GuideDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<HotelDto> getAllHotels() {
        return hotelRepo.findAll()
                .stream()
                .map(h -> modelMapper.map(h, HotelDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<SellerDto> getAllSellers() {
        return sellerRepo.findAll()
                .stream()
                .map(s -> modelMapper.map(s, SellerDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<DriverDto> getAllDrivers() {
        return driverRepo.findAll()
                .stream()
                .map(d -> modelMapper.map(d, DriverDto.class))
                .collect(Collectors.toList());
    }

    // ---------------- Booking & Orders ----------------
    @Override
    public String bookTour(Integer touristId, Integer bookingId) {
        Tourist tourist = touristRepo.findById(touristId)
                .orElseThrow(() -> new RuntimeException("Tourist not found"));
        Booking booking = bookingRepo.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        booking.setTourist(tourist);
        bookingRepo.save(booking);

        return "Booking " + bookingId + " successfully assigned to Tourist " + touristId;
    }

    @Override
    public String placeOrder(Integer touristId, Integer orderId) {
        Tourist tourist = touristRepo.findById(touristId)
                .orElseThrow(() -> new RuntimeException("Tourist not found"));
        Order order = orderRepo.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        order.setTourist(tourist);
        orderRepo.save(order);

        return "Order " + orderId + " successfully placed by Tourist " + touristId;
    }
}
