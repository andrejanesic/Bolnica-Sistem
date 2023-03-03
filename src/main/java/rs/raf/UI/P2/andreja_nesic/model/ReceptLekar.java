package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "recept_lekar")
public class ReceptLekar {

    @EmbeddedId
    private ReceptLekarPK id;

    @ManyToOne
    @MapsId("zaposleniId")
    @JoinColumn(name = "zaposleni_id", referencedColumnName = "zaposleni_id")
    private Zaposleni zaposleni;

    @ManyToOne
    @MapsId("receptId")
    @JoinColumn(name = "recept_id", referencedColumnName = "recept_id")
    private Recept recept;

    public ReceptLekarPK getId() {
        return id;
    }

    public void setId(ReceptLekarPK id) {
        this.id = id;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Recept getRecept() {
        return recept;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceptLekar that = (ReceptLekar) o;
        return Objects.equals(zaposleni, that.zaposleni) && Objects.equals(recept, that.recept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zaposleni, recept);
    }
}
