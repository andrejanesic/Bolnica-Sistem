package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table
public class Covid {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "covid_id")
    private int covidId;

    @Column(name = "pocetak")
    private Date pocetak;

    @Column(name = "kraj")
    private Date kraj;

    @ManyToOne
    @JoinColumn(name = "pacijent_id")
    private Pacijent pacijent;

    public int getCovidId() {
        return covidId;
    }

    public void setCovidId(int covidId) {
        this.covidId = covidId;
    }

    public Date getPocetak() {
        return pocetak;
    }

    public void setPocetak(Date pocetak) {
        this.pocetak = pocetak;
    }

    public Date getKraj() {
        return kraj;
    }

    public void setKraj(Date kraj) {
        this.kraj = kraj;
    }

    public Pacijent getPacijent() {
        return pacijent;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Covid covid = (Covid) o;
        return covidId == covid.covidId && Objects.equals(pocetak, covid.pocetak) && Objects.equals(kraj, covid.kraj) && Objects.equals(pacijent, covid.pacijent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(covidId, pocetak, kraj, pacijent);
    }
}
