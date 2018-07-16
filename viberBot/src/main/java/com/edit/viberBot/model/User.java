package com.edit.viberBot.model;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.websocket.OnError;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int Id;

    @Column(name = "ViberId")
    private int ViberId;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Subscribed")
    private boolean Subscribed;

   /* @OneToMany(mappedBy = "user" )
    List<Reservation> reservations;*/

    public boolean isSubscribed() {
        return Subscribed;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id" , referencedColumnName = "user_id")
    private List<Reservation> reservationList;


    public User()
    {

    }
    public User(int ViberId , String name , boolean Subsribed)
    {
        this.ViberId = ViberId;
        this.Name = name;
        this.Subscribed = Subsribed;
    }



    public int getViberId() {
        return ViberId;
    }

    public void setViberId(int viberId) {
        ViberId = viberId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean getSubscribed() {
        return Subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        Subscribed = subscribed;
    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}