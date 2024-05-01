package org.example.finalproject.Controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.finalproject.API.ApiResponse;
import org.example.finalproject.Model.Booking;
import org.example.finalproject.Service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/v1/booking/")
@RestController
public class BookController {
    private final BookingService bookingService;
     @PostMapping("/add")
    public ResponseEntity addSports(@RequestBody @Valid Booking booking) {
        bookingService.addBooking(booking);
        return ResponseEntity.status(200).body(new ApiResponse("Booking added successfully"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateSports(@PathVariable Integer id, @RequestBody @Valid Booking booking) {
        bookingService.updateBooking(id, booking);
        return ResponseEntity.status(200).body(new ApiResponse("Booking updated successfully"));
    }

    @GetMapping("/get")
    public List<Booking> getAllSports() {
        return bookingService.getAllBookings();
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteSports(@PathVariable Integer id){
        bookingService.deleteBooking(id);
        return ResponseEntity.status(200).body(new ApiResponse("Booking deleted successfully"));
    }
}
