package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProceduraZaposleniPK implements Serializable {

    @Column(name = "procedura_id")
    private int proceduraId;

    @Column(name = "zaposleni_id")
    private int zaposleniId;

    public int getProceduraId() {
        return proceduraId;
    }

    public void setProceduraId(int proceduraId) {
        this.proceduraId = proceduraId;
    }

    public int getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProceduraZaposleniPK that = (ProceduraZaposleniPK) o;
        return proceduraId == that.proceduraId && zaposleniId == that.zaposleniId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(proceduraId, zaposleniId);
    }
}
