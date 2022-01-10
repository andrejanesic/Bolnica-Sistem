package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReceptLekarPK implements Serializable {

    @Column(name = "zaposleni_id")
    private int zaposleniId;

    @Column(name = "recept_id")
    private int receptId;

    public int getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
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
        ReceptLekarPK that = (ReceptLekarPK) o;
        return zaposleniId == that.zaposleniId && receptId == that.receptId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zaposleniId, receptId);
    }
}
