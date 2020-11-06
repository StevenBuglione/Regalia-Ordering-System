package registrar.RegaliaOrderingSystem.Models;

import javax.persistence.*;

@Entity
@Table(name = "ceremony")
public class Ceremony {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CEREMONY_ID")
    private long id;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
