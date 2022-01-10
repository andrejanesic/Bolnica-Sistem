package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Osiguranje {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "osiguranje_id")
    private int osiguranjeId;

    @Basic
    @Column(name = "tip")
    private String tip;

    @Basic
    @Column(name = "broj")
    private String broj;

    @ManyToOne
    @JoinColumn(name = "pacijent_id")
    private Pacijent pacijent;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public int getOsiguranjeId() {
        return osiguranjeId;
    }

    public void setOsiguranjeId(int osiguranjeId) {
        this.osiguranjeId = osiguranjeId;
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
        Osiguranje that = (Osiguranje) o;
        return osiguranjeId == that.osiguranjeId && Objects.equals(tip, that.tip) && Objects.equals(broj, that.broj) && Objects.equals(pacijent, that.pacijent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osiguranjeId, tip, broj, pacijent);
    }
}
