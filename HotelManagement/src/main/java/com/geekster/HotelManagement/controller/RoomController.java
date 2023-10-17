package com.geekster.HotelManagement.controller;

import com.geekster.HotelManagement.model.*;
import com.geekster.HotelManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    // Crud Operations

    @PostMapping("room")
    public void addRoom(@RequestBody HotelRoom hotelRoom){
        roomService.addRooms(hotelRoom);
    }

    @PostMapping("rooms")
    public String addRoom(@RequestBody List<HotelRoom> rooms){
        return roomService.addRooms(rooms);
    }


    @GetMapping("room/{id}")
    public HotelRoom getRoomById(@PathVariable Integer id){
        return roomService.getRoomById(id);
    }

    @GetMapping("rooms")
    public Iterable<HotelRoom> getAllRooms(){
        return roomService.getAllRooms();
    }

    @GetMapping("room/{id}/exists")
    public boolean checkRoomExists(@PathVariable Integer id){
        return roomService.checkRoomExists(id);
    }

    @GetMapping("rooms/count")
    public Integer getTotalRooms(){
        return roomService.getTotalRooms();
    }

    @DeleteMapping("room/{id}")
    public String deleteRoomById(@PathVariable Integer id){
        return roomService.deleteRoomById(id);
    }


    @PutMapping("room/{id}/{type}")
    public String updateRoomById(@PathVariable Integer id,@PathVariable RoomType type){
        return roomService.updateRoomById(id,type);
    }


    //find rooms by status

    @GetMapping("rooms/status/{status}")
    public List<HotelRoom> getRoomsByStatus(@PathVariable Boolean status)
    {
        return roomService.getRoomsByStatus(status);
    }

    @GetMapping("rooms/status/{status}/type/{type}")
    public List<HotelRoom> getRoomsByStatusAndType(@PathVariable Boolean status,@PathVariable RoomType type)
    {
        return roomService.getRoomsByStatusAndType(status,type);
    }

    @GetMapping("rooms/status/{status}/type/{type}/priceRange")
    public List<HotelRoom> getRoomsByStatusAndTypeAndPrice(@PathVariable Boolean status, @PathVariable RoomType type, @RequestParam Double lLimit, @RequestParam Double uLimit)
    {
        return roomService.getRoomsByStatusAndTypeAndPrice(status,type,lLimit,uLimit);
    }

    @GetMapping("rooms/type/{roomType}")
    public List<HotelRoom> getRoomsByTypeAndPriceSortedDesc(@PathVariable RoomType roomType)
    {
        return roomService.getRoomsByTypeAndPriceSortedDesc(roomType);
    }

    @GetMapping("rooms/type1/{roomType1}/type2/{roomType2}")
    public List<HotelRoom> getBudgetedAcOrNonAC(@PathVariable RoomType roomType1,@PathVariable RoomType roomType2, @RequestParam Double lLimit,@RequestParam Double uLimit)
    {
        return roomService.getBudgetedAcOrNonAC( roomType1, roomType2, lLimit,uLimit);
    }

}
