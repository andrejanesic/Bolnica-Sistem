package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Zaposleni {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "zaposleni_id")
    private int zaposleniId;

    @Basic
    @Column(name = "ime", nullable = false)
    private String ime;

    @Basic
    @Column(name = "prezime", nullable = false)
    private String prezime;

    public int getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zaposleni zaposleni = (Zaposleni) o;
        return zaposleniId == zaposleni.zaposleniId && Objects.equals(ime, zaposleni.ime) && Objects.equals(prezime, zaposleni.prezime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zaposleniId, ime, prezime);
    }
}
