package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table
public class Dezurstvo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "dezurstvo_id")
    private int dezurstvoId;

    @Basic
    @Column(name = "pocetak", nullable = false)
    private Date pocetak;

    @Basic
    @Column(name = "kraj", nullable = false)
    private Date kraj;

    @ManyToOne
    @JoinColumn(name = "zaposleni_id", referencedColumnName = "zaposleni_id")
    private Zaposleni zaposleni;

    public int getDezurstvoId() {
        return dezurstvoId;
    }

    public void setDezurstvoId(int dezurstvoId) {
        this.dezurstvoId = dezurstvoId;
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
        Dezurstvo dezurstvo = (Dezurstvo) o;
        return dezurstvoId == dezurstvo.dezurstvoId && Objects.equals(pocetak, dezurstvo.pocetak) && Objects.equals(kraj, dezurstvo.kraj) && Objects.equals(zaposleni, dezurstvo.zaposleni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dezurstvoId, pocetak, kraj, zaposleni);
    }
}
