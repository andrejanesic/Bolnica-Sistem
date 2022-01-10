package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "procedura_lekar")
public class ProceduraZaposleni {

    @EmbeddedId
    private ProceduraZaposleniPK id;

    @ManyToOne
    @MapsId("proceduraId")
    @JoinColumn(name = "procedura_id")
    private Procedura procedura;

    @ManyToOne
    @MapsId("zaposleniId")
    @JoinColumn(name = "zaposleni_id")
    private Zaposleni zaposleni;

    public ProceduraZaposleniPK getId() {
        return id;
    }

    public void setId(ProceduraZaposleniPK id) {
        this.id = id;
    }

    public Procedura getProcedura() {
        return procedura;
    }

    public void setProcedura(Procedura procedura) {
        this.procedura = procedura;
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
        ProceduraZaposleni that = (ProceduraZaposleni) o;
        return Objects.equals(procedura, that.procedura) && Objects.equals(zaposleni, that.zaposleni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procedura, zaposleni);
    }
}
