package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table
public class Procedura {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "procedura_id")
    private int proceduraId;

    @Basic
    @Column(name = "tip", nullable = false)
    private String tip;

    @Basic
    @Column(name = "pocetak", nullable = false)
    private Date pocetak;

    @Basic
    @Column(name = "kraj")
    private Date kraj;

    @Basic
    @Column(name = "ime", nullable = false)
    private String ime;

    @ManyToOne
    @JoinColumn(name = "pacijent_id", referencedColumnName = "pacijent_id")
    private Pacijent pacijent;

    @ManyToOne
    @JoinColumn(name = "soba_id", referencedColumnName = "soba_id")
    private Soba soba;

    public int getProceduraId() {
        return proceduraId;
    }

    public void setProceduraId(int proceduraId) {
        this.proceduraId = proceduraId;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
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

    public Soba getSoba() {
        return soba;
    }

    public void setSoba(Soba soba) {
        this.soba = soba;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procedura procedura = (Procedura) o;
        return proceduraId == procedura.proceduraId && Objects.equals(tip, procedura.tip) && Objects.equals(pocetak, procedura.pocetak) && Objects.equals(kraj, procedura.kraj) && Objects.equals(ime, procedura.ime) && Objects.equals(pacijent, procedura.pacijent) && Objects.equals(soba, procedura.soba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proceduraId, tip, pocetak, kraj, ime, pacijent, soba);
    }
}
