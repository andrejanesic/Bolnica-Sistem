package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Pacijent;
import rs.raf.UI.P2.andreja_nesic.model.Soba;
import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;

import java.sql.Date;

public class PrijemDto extends AbstractDto<Integer> {

    private int prijemId;
    private Date pocetak;
    private Date kraj;
    private Pacijent pacijent;
    private Soba soba;
    private Zaposleni zaposleni;

    public PrijemDto() {
    }

    public void setPrijemId(int prijemId) {
        this.prijemId = prijemId;
    }

    public int getPrijemId() {
        return this.prijemId;
    }

    public void setPocetak(java.sql.Date pocetak) {
        this.pocetak = pocetak;
    }

    public java.sql.Date getPocetak() {
        return this.pocetak;
    }

    public void setKraj(java.sql.Date kraj) {
        this.kraj = kraj;
    }

    public java.sql.Date getKraj() {
        return this.kraj;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }

    public Pacijent getPacijent() {
        return this.pacijent;
    }

    public void setSoba(Soba soba) {
        this.soba = soba;
    }

    public Soba getSoba() {
        return this.soba;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni() {
        return this.zaposleni;
    }
}