package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PacijentLekPK implements Serializable {

    @Column(name = "pacijent_id")
    private int pacijentId;

    @Column(name = "lek_id")
    private int lekId;

    public int getPacijentId() {
        return pacijentId;
    }

    public void setPacijentId(int pacijentId) {
        this.pacijentId = pacijentId;
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
        PacijentLekPK that = (PacijentLekPK) o;
        return pacijentId == that.pacijentId && lekId == that.lekId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pacijentId, lekId);
    }
}
