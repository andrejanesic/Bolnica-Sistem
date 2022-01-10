package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lekar_odeljenje")
public class LekarOdeljenje {

    @EmbeddedId
    private LekarOdeljenjePK id;

    @ManyToOne
    @MapsId("zaposleniId")
    @JoinColumn(name = "zaposleni_id")
    private Zaposleni zaposleni;

    @ManyToOne
    @MapsId("odeljenjeId")
    @JoinColumn(name = "odeljenje_id")
    private Odeljenje odeljenje;

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Odeljenje getOdeljenje() {
        return odeljenje;
    }

    public void setOdeljenje(Odeljenje odeljenje) {
        this.odeljenje = odeljenje;
    }

    public LekarOdeljenjePK getId() {
        return id;
    }

    public void setId(LekarOdeljenjePK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LekarOdeljenje that = (LekarOdeljenje) o;
        return Objects.equals(zaposleni, that.zaposleni) && Objects.equals(odeljenje, that.odeljenje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zaposleni, odeljenje);
    }
}
