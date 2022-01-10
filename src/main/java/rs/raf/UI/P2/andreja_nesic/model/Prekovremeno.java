package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table
public class Prekovremeno {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "prekovremeno_id")
    private int prekovremenoId;

    @Basic
    @Column(name = "datum")
    private Date datum;

    @Basic
    @Column(name = "trajanje")
    private int trajanje;

    @ManyToOne
    @JoinColumn(name = "zaposleni_id")
    private Zaposleni zaposleni;

    public int getPrekovremenoId() {
        return prekovremenoId;
    }

    public void setPrekovremenoId(int prekovremenoId) {
        this.prekovremenoId = prekovremenoId;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
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
        Prekovremeno that = (Prekovremeno) o;
        return prekovremenoId == that.prekovremenoId && trajanje == that.trajanje && Objects.equals(datum, that.datum) && Objects.equals(zaposleni, that.zaposleni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prekovremenoId, datum, trajanje, zaposleni);
    }
}
