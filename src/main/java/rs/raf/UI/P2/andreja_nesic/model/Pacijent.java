package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Pacijent {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pacijent_id")
    private int pacijentId;

    @Basic
    @Column(name = "ime", nullable = false)
    private String ime;

    @Basic
    @Column(name = "prezime", nullable = false)
    private String prezime;

    @Basic
    @Column(name = "jmbg", nullable = false)
    private String jmbg;

    @Basic
    @Column(name = "ulica")
    private String ulica;

    @Basic
    @Column(name = "broj")
    private String broj;

    @Basic
    @Column(name = "grad")
    private String grad;

    @Basic
    @Column(name = "postanski_broj")
    private String postanskiBroj;

    @Basic
    @Column(name = "drzava", nullable = false)
    private String drzava;

    @Basic
    @Column(name = "telefon", nullable = false)
    private String telefon;

    public int getPacijentId() {
        return pacijentId;
    }

    public void setPacijentId(int pacijentId) {
        this.pacijentId = pacijentId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(String postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacijent pacijent = (Pacijent) o;
        return pacijentId == pacijent.pacijentId && Objects.equals(ime, pacijent.ime) && Objects.equals(prezime, pacijent.prezime) && Objects.equals(jmbg, pacijent.jmbg) && Objects.equals(ulica, pacijent.ulica) && Objects.equals(broj, pacijent.broj) && Objects.equals(grad, pacijent.grad) && Objects.equals(postanskiBroj, pacijent.postanskiBroj) && Objects.equals(drzava, pacijent.drzava) && Objects.equals(telefon, pacijent.telefon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pacijentId, ime, prezime, jmbg, ulica, broj, grad, postanskiBroj, drzava, telefon);
    }
}
