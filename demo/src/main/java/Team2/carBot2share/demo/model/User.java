package Team2.carBot2share.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name = "ViberId")
    private int ViberId;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Subscribed")
    private boolean Subscribed;




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