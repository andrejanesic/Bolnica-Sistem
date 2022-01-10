package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Odeljenje {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "odeljenje_id")
    private int odeljenjeId;

    @Basic
    @Column(name = "ime", unique = true)
    private int ime;

    @ManyToOne
    @JoinColumn(name = "zaposleni_id", referencedColumnName = "zaposleni_id")
    private Zaposleni zaposleni;

    public int getOdeljenjeId() {
        return odeljenjeId;
    }

    public void setOdeljenjeId(int odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public int getIme() {
        return ime;
    }

    public void setIme(int ime) {
        this.ime = ime;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Odeljenje odeljenje = (Odeljenje) o;
        return odeljenjeId == odeljenje.odeljenjeId && ime == odeljenje.ime && Objects.equals(zaposleni, odeljenje.zaposleni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odeljenjeId, ime, zaposleni);
    }
}
