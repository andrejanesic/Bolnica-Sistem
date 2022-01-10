package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Soba {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "soba_id")
    private int sobaId;

    @Basic
    @Column(name = "broj")
    private String broj;

    @ManyToOne
    @JoinColumn(name = "blok_id")
    private Blok blok;

    public int getSobaId() {
        return sobaId;
    }

    public void setSobaId(int sobaId) {
        this.sobaId = sobaId;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public Blok getBlok() {
        return blok;
    }

    public void setBlok(Blok blok) {
        this.blok = blok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soba soba = (Soba) o;
        return sobaId == soba.sobaId && Objects.equals(broj, soba.broj) && Objects.equals(blok, soba.blok);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sobaId, broj, blok);
    }
}
