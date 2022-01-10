package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table
public class Obuka {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "obuka_id")
    private int obukaId;

    @Basic
    @Column(name = "procedura", nullable = false)
    private String procedura;

    @Basic
    @Column(name = "pocetak", nullable = false)
    private Date pocetak;

    @Basic
    @Column(name = "kraj")
    private Date kraj;

    @Basic
    @Column(name = "sertifikat")
    private String sertifikat;

    @Basic
    @Column(name = "kod", nullable = false)
    private String kod;

    @ManyToOne
    @JoinColumn(name = "zaposleni_id", referencedColumnName = "zaposleni_id")
    private Zaposleni zaposleni;

    public int getObukaId() {
        return obukaId;
    }

    public void setObukaId(int obukaId) {
        this.obukaId = obukaId;
    }

    public String getProcedura() {
        return procedura;
    }

    public void setProcedura(String procedura) {
        this.procedura = procedura;
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

    public String getSertifikat() {
        return sertifikat;
    }

    public void setSertifikat(String sertifikat) {
        this.sertifikat = sertifikat;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
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
        Obuka obuka = (Obuka) o;
        return obukaId == obuka.obukaId && Objects.equals(procedura, obuka.procedura) && Objects.equals(pocetak, obuka.pocetak) && Objects.equals(kraj, obuka.kraj) && Objects.equals(sertifikat, obuka.sertifikat) && Objects.equals(kod, obuka.kod) && Objects.equals(zaposleni, obuka.zaposleni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obukaId, procedura, pocetak, kraj, sertifikat, kod, zaposleni);
    }
}
