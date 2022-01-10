package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "zaposleni_id")
public class Lekar extends Zaposleni {

    @Basic
    @Column(name = "specijalizacija")
    private String specijalizacija;

    public String getSpecijalizacija() {
        return specijalizacija;
    }

    public void setSpecijalizacija(String specijalizacija) {
        this.specijalizacija = specijalizacija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lekar lekar = (Lekar) o;
        return Objects.equals(specijalizacija, lekar.specijalizacija);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specijalizacija);
    }
}
