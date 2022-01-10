package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table
public class Odmor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "odmor_id")
    private int odmorId;

    @Basic
    @Column(name = "pocetak", nullable = false)
    private double pocetak;

    @Basic
    @Column(name = "kraj", nullable = false)
    private Date kraj;

    @ManyToOne
    @JoinColumn(name = "zaposleni_id", referencedColumnName = "zaposleni_id")
    private Zaposleni zaposleni;

    public int getOdmorId() {
        return odmorId;
    }

    public void setOdmorId(int odmorId) {
        this.odmorId = odmorId;
    }

    public double getPocetak() {
        return pocetak;
    }

    public void setPocetak(double pocetak) {
        this.pocetak = pocetak;
    }

    public Date getKraj() {
        return kraj;
    }

    public void setKraj(Date kraj) {
        this.kraj = kraj;
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
        Odmor odmor = (Odmor) o;
        return odmorId == odmor.odmorId && Double.compare(odmor.pocetak, pocetak) == 0 && Objects.equals(kraj, odmor.kraj) && Objects.equals(zaposleni, odmor.zaposleni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odmorId, pocetak, kraj, zaposleni);
    }
}
