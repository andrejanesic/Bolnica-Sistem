package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Pacijent;

import java.sql.Date;

public class CovidDto extends AbstractDto<Integer> {

    private int covidId;
    private Date pocetak;
    private Date kraj;
    private Pacijent pacijent;

    public CovidDto() {
    }

    public void setCovidId(int covidId) {
        this.covidId = covidId;
    }

    public int getCovidId() {
        return this.covidId;
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
}