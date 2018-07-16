package Team2.carBot2share.demo.model;

import javax.persistence.*;


@Entity
@Table(name = "Reservation")
public class Reservation {

    @ManyToOne
    @JoinColumn(name = "RouteId")
    private int RouteId;


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int Id ;


    @Column(name = "ReservedSeats")
    private boolean ReservedSeats;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private int UserId;



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


    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }


    public int getRouteId() {
        return RouteId;
    }

    public void setRouteId(int routeId) {
        RouteId = routeId;
    }

}
