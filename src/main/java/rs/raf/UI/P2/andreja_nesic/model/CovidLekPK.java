package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CovidLekPK implements Serializable {

    @Column(name = "covid_id")
    private int covidId;

    @Column(name = "lek_id")
    private int lekId;

    public int getCovidId() {
        return covidId;
    }

    public void setCovidId(int covidId) {
        this.covidId = covidId;
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
        CovidLekPK that = (CovidLekPK) o;
        return covidId == that.covidId && lekId == that.lekId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(covidId, lekId);
    }
}
