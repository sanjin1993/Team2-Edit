package com.edit.viberBot.model;

import javax.persistence.*;


@Entity
@Table(name = "Reservations")
public class Reservation {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "reservation_id")
    private int Id;

  /* @ManyToOne
    @JoinColumn(name = "RouteId")
    private int RouteId;
    /* Route route;*/

    @Column(name = "ReservedSeats")
    private boolean ReservedSeats;

    /*@ManyToOne
    @JoinColumn(name = "UserId")
    private int UserId;
   /* User user;*/

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    private int user_id;

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    private int route_id;
    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id" , referencedColumnName = "user_id")
    private User users;*/

    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "routes_id" , referencedColumnName = "routes_id")
    private Route routes;*/


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public boolean isReservedSeats() {
        return ReservedSeats;
    }

    public void setReservedSeats(boolean reservedSeats) {
        ReservedSeats = reservedSeats;
    }


   /* public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }*/


    /*public int getRouteId() {
        return RouteId;
    }

    public void setRouteId(int routeId) {
        RouteId = routeId;
    }*/

}
