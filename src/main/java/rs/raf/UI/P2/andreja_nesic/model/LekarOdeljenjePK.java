package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LekarOdeljenjePK implements Serializable {

    @Column(name = "zaposleni_id")
    private int zaposleniId;

    @Column(name = "odeljenje_id")
    private int odeljenjeId;

    public int getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public int getOdeljenjeId() {
        return odeljenjeId;
    }

    public void setOdeljenjeId(int odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LekarOdeljenjePK that = (LekarOdeljenjePK) o;
        return zaposleniId == that.zaposleniId && odeljenjeId == that.odeljenjeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zaposleniId, odeljenjeId);
    }
}
