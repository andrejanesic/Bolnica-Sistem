package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table
public class Prijem {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "prijem_id")
    private int prijemId;

    @Basic
    @Column(name = "pocetak")
    private Date pocetak;

    @Basic
    @Column(name = "kraj")
    private Date kraj;

    @ManyToOne
    @JoinColumn(name = "pacijent_id")
    private Pacijent pacijent;

    @ManyToOne
    @JoinColumn(name = "soba_id")
    private Soba soba;

    @ManyToOne
    @JoinColumn(name = "zaposleni_id")
    private Zaposleni zaposleni;

    public int getPrijemId() {
        return prijemId;
    }

    public void setPrijemId(int prijemId) {
        this.prijemId = prijemId;
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

    public Soba getSoba() {
        return soba;
    }

    public void setSoba(Soba soba) {
        this.soba = soba;
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
        Prijem prijem = (Prijem) o;
        return prijemId == prijem.prijemId && Objects.equals(pocetak, prijem.pocetak) && Objects.equals(kraj, prijem.kraj) && Objects.equals(pacijent, prijem.pacijent) && Objects.equals(soba, prijem.soba) && Objects.equals(zaposleni, prijem.zaposleni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prijemId, pocetak, kraj, pacijent, soba, zaposleni);
    }
}
