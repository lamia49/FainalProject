package org.example.finalproject.Repository;

import org.example.finalproject.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepositry extends JpaRepository<Booking, Integer> {
    Booking findBookingById(int id);

}
