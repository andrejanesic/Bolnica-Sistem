package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Blok {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "blok_id")
    private int blokId;

    @Column(name = "kod")
    private String kod;

    @Column(name = "ime")
    private String ime;

    @Column(name = "sprat")
    private int sprat;

    @ManyToOne
    @JoinColumn(name = "odeljenje_id")
    private Odeljenje odeljenje;

    public int getBlokId() {
        return blokId;
    }

    public void setBlokId(int blokId) {
        this.blokId = blokId;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public Odeljenje getOdeljenje() {
        return odeljenje;
    }

    public void setOdeljenje(Odeljenje odeljenje) {
        this.odeljenje = odeljenje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blok blok = (Blok) o;
        return blokId == blok.blokId && sprat == blok.sprat && Objects.equals(kod, blok.kod) && Objects.equals(ime, blok.ime) && Objects.equals(odeljenje, blok.odeljenje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blokId, kod, ime, sprat, odeljenje);
    }
}
