package com.edit.viberBot.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Routes")
public class Route {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "route_id")
    @Id
    private int Id;

    @Column(name = "Start")
    private String Start;

    @Column(name = "Destination")
    private String Destination ;

    @Column(name = "Date")
    private Date Date;

    @Column(name = "Time")
    private Time Time;

    @Column(name = "AvailableSeats")
    private int AvailableSeats;

 /*   @OneToMany(mappedBy = "route")
    List<Reservation> reservations;*/

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "route_id" , referencedColumnName = "route_id")
    private List<Reservation> reservationList;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStart() {
        return Start;
    }

    public void setStart(String start) {
        Start = start;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public java.sql.Time getTime() {
        return Time;
    }

    public void setTime(java.sql.Time time) {
        Time = time;
    }

    public int getAvailableSeats() {
        return AvailableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        AvailableSeats = availableSeats;
    }

}
