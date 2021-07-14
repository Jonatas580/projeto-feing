package jonatas.santos.project.learn.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_andress")
public class Andress {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "cep")
    private String cep;
    private String state;
    private String city;
    private String neighborhood;
    private String street;

    public Andress(){

    }

    public Andress(String cep, String state, String city, String neighborhood, String street) {
        this.cep = cep;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
    }

    public String getCep() {
        return cep;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Andress{" +
                "cep='" + cep + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Andress andress = (Andress) o;
        return Objects.equals(cep, andress.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep);
    }
}
