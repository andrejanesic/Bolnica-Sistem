package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table
public class Dijagonza {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "dijagnoza_id")
    private int dijagnozaId;

    @Basic
    @Column(name = "pocetak")
    private Date pocetak;

    @Basic
    @Column(name = "kraj")
    private Date kraj;

    @Basic
    @Column(name = "sifra")
    private String sifra;

    @Basic
    @Column(name = "ime")
    private String ime;

    @ManyToOne
    @JoinColumn(name = "pacijent_id")
    private Pacijent pacijent;

    public int getDijagnozaId() {
        return dijagnozaId;
    }

    public void setDijagnozaId(int dijagnozaId) {
        this.dijagnozaId = dijagnozaId;
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

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
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
        Dijagonza dijagonza = (Dijagonza) o;
        return dijagnozaId == dijagonza.dijagnozaId && Objects.equals(pocetak, dijagonza.pocetak) && Objects.equals(kraj, dijagonza.kraj) && Objects.equals(sifra, dijagonza.sifra) && Objects.equals(ime, dijagonza.ime) && Objects.equals(pacijent, dijagonza.pacijent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dijagnozaId, pocetak, kraj, sifra, ime, pacijent);
    }
}
