package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LekReceptPK implements Serializable {

    @Column(name = "recept_id")
    private int receptId;

    @Column(name = "lek_id")
    private int lekId;

    public int getReceptId() {
        return receptId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public int getLekId() {
        return lekId;
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LekReceptPK that = (LekReceptPK) o;
        return receptId == that.receptId && lekId == that.lekId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptId, lekId);
    }
}
