package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "covid_lek")
public class CovidLek {

    @EmbeddedId
    private CovidLekPK id;

    @ManyToOne
    @MapsId("lekId")
    @JoinColumn(name = "lek_id")
    private Lek lek;

    @ManyToOne
    @MapsId("covidId")
    @JoinColumn(name = "covid_id")
    private Covid covid;

    public Covid getCovid() {
        return covid;
    }

    public void setCovid(Covid covid) {
        this.covid = covid;
    }

    public Lek getLek() {
        return lek;
    }

    public void setLek(Lek lek) {
        this.lek = lek;
    }

    public CovidLekPK getId() {
        return id;
    }

    public void setId(CovidLekPK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CovidLek covidLek = (CovidLek) o;
        return Objects.equals(id, covidLek.id) && Objects.equals(lek, covidLek.lek) && Objects.equals(covid, covidLek.covid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lek, covid);
    }
}
