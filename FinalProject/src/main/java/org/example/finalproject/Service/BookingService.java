package org.example.finalproject.Service;

import lombok.AllArgsConstructor;
import org.example.finalproject.Model.Booking;
import org.example.finalproject.Repository.BookingRepositry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookingService {
    private final BookingRepositry bookingRepositry;

    public List<Booking> getAllBookings(){
       return bookingRepositry.findAll();
    }

    public void addBooking(Booking booking){
        bookingRepositry.save(booking);
    }
    public void updateBooking(Integer id,Booking booking){
        Booking booking1=bookingRepositry.findBookingById(id);
        booking1.setBookingDate(booking.getBookingDate());
        bookingRepositry.save(booking1);
    }

    public void deleteBooking(Integer id){
         Booking booking=bookingRepositry.findBookingById(id);
    }




}
