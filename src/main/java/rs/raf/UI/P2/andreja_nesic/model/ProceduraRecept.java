package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "procedura_recept")
public class ProceduraRecept {

    @EmbeddedId
    private ProceduraReceptPK id;

    @ManyToOne
    @MapsId("proceduraId")
    @JoinColumn(name = "procedura_id", referencedColumnName = "procedura_id")
    private Procedura procedura;

    @ManyToOne
    @MapsId("receptId")
    @JoinColumn(name = "recept_id", referencedColumnName = "recept_id")
    private Recept recept;

    public ProceduraReceptPK getId() {
        return id;
    }

    public void setId(ProceduraReceptPK id) {
        this.id = id;
    }

    public Procedura getProcedura() {
        return procedura;
    }

    public void setProcedura(Procedura procedura) {
        this.procedura = procedura;
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
        ProceduraRecept that = (ProceduraRecept) o;
        return Objects.equals(procedura, that.procedura) && Objects.equals(recept, that.recept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procedura, recept);
    }
}
