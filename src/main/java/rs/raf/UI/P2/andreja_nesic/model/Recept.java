package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Recept {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "recept_id")
    private int receptId;

    @Basic
    @Column(name = "doza")
    private int doza;

    @Basic
    @Column(name = "pocetak")
    private int pocetak;

    @Basic
    @Column(name = "trajanje")
    private int trajanje;

    @Basic
    @Column(name = "obnavljajuci")
    private boolean obnavljajuci;

    @ManyToOne
    @JoinColumn(name = "pacijent_id")
    private Pacijent pacijent;

    public int getReceptId() {
        return receptId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public int getDoza() {
        return doza;
    }

    public void setDoza(int doza) {
        this.doza = doza;
    }

    public int getPocetak() {
        return pocetak;
    }

    public void setPocetak(int pocetak) {
        this.pocetak = pocetak;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public boolean isObnavljajuci() {
        return obnavljajuci;
    }

    public void setObnavljajuci(boolean obnavljajuci) {
        this.obnavljajuci = obnavljajuci;
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
        Recept recept = (Recept) o;
        return receptId == recept.receptId && doza == recept.doza && pocetak == recept.pocetak && trajanje == recept.trajanje && obnavljajuci == recept.obnavljajuci && Objects.equals(pacijent, recept.pacijent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptId, doza, pocetak, trajanje, obnavljajuci, pacijent);
    }
}
