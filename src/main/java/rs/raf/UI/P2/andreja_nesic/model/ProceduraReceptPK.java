package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProceduraReceptPK implements Serializable {

    @Column(name = "procedura_id")
    private int proceduraId;

    @Column(name = "recept_id")
    private int receptId;

    public int getProceduraId() {
        return proceduraId;
    }

    public void setProceduraId(int proceduraId) {
        this.proceduraId = proceduraId;
    }

    public int getReceptId() {
        return receptId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProceduraReceptPK that = (ProceduraReceptPK) o;
        return proceduraId == that.proceduraId && receptId == that.receptId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(proceduraId, receptId);
    }
}
