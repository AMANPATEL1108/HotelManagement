package com.hotelmanagement.HotelManagement.service.interfac;


import com.hotelmanagement.HotelManagement.dto.Response;
import com.hotelmanagement.HotelManagement.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
