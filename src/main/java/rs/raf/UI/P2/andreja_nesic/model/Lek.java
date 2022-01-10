package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Lek {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "lek_id")
    private int lekId;

    @Basic
    @Column(name = "naziv")
    private String naziv;

    @Basic
    @Column(name = "proizvodjac")
    private String proizvodjac;

    @Basic
    @Column(name = "grupa")
    private String grupa;

    @Basic
    @Column(name = "tip")
    private String tip;

    @Basic
    @Column(name = "sastav")
    private String sastav;

    public int getLekId() {
        return lekId;
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getSastav() {
        return sastav;
    }

    public void setSastav(String sastav) {
        this.sastav = sastav;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lek lek = (Lek) o;
        return lekId == lek.lekId && Objects.equals(naziv, lek.naziv) && Objects.equals(proizvodjac, lek.proizvodjac) && Objects.equals(grupa, lek.grupa) && Objects.equals(tip, lek.tip) && Objects.equals(sastav, lek.sastav);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lekId, naziv, proizvodjac, grupa, tip, sastav);
    }
}
