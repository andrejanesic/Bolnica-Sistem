package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lek_recept")
public class LekRecept {

    @EmbeddedId
    private LekReceptPK id;

    @ManyToOne
    @MapsId("receptId")
    @JoinColumn(name = "recept_id", referencedColumnName = "recept_id")
    private Recept recept;

    @ManyToOne
    @MapsId("lekId")
    @JoinColumn(name = "lek_id", referencedColumnName = "lek_id")
    private Lek lek;

    public LekReceptPK getId() {
        return id;
    }

    public void setId(LekReceptPK id) {
        this.id = id;
    }

    public Recept getRecept() {
        return recept;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    public Lek getLek() {
        return lek;
    }

    public void setLek(Lek lek) {
        this.lek = lek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LekRecept lekRecept = (LekRecept) o;
        return Objects.equals(recept, lekRecept.recept) && Objects.equals(lek, lekRecept.lek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recept, lek);
    }
}
