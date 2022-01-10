package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "zaposleni_id")
public class Sestra extends Zaposleni {

    @Basic
    @Column(name = "pozicija", nullable = false)
    private String pozicija;

    @Basic
    @Column(name = "licenca", nullable = false)
    private byte licenca;

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public byte getLicenca() {
        return licenca;
    }

    public void setLicenca(byte licenca) {
        this.licenca = licenca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sestra sestra = (Sestra) o;
        return licenca == sestra.licenca && Objects.equals(pozicija, sestra.pozicija);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pozicija, licenca);
    }
}
