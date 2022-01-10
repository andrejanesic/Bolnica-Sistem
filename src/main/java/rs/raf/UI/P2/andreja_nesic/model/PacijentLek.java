package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pacijent_lek")
public class PacijentLek {

    @EmbeddedId
    private PacijentLekPK id;

    @ManyToOne
    @MapsId("pacijentId")
    @JoinColumn(name = "pacijent_id")
    private Pacijent pacijent;

    @ManyToOne
    @MapsId("lekId")
    @JoinColumn(name = "lek_id")
    private Lek lek;

    public PacijentLekPK getId() {
        return id;
    }

    public void setId(PacijentLekPK id) {
        this.id = id;
    }

    public Pacijent getPacijent() {
        return pacijent;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }

    public Lek getLek() {
        return lek;
    }

    public void setLek(Lek lekId) {
        this.lek = lekId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacijentLek that = (PacijentLek) o;
        return Objects.equals(pacijent, that.pacijent) && Objects.equals(lek, that.lek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pacijent, lek);
    }
}
