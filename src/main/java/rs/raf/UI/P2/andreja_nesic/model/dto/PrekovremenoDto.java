package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;

import java.sql.Date;

public class PrekovremenoDto extends AbstractDto<Integer> {

    private int prekovremenoId;
    private Date datum;
    private int trajanje;
    private Zaposleni zaposleni;

    public PrekovremenoDto() {
    }

    public void setPrekovremenoId(int prekovremenoId) {
        this.prekovremenoId = prekovremenoId;
    }

    public int getPrekovremenoId() {
        return this.prekovremenoId;
    }

    public void setDatum(java.sql.Date datum) {
        this.datum = datum;
    }

    public java.sql.Date getDatum() {
        return this.datum;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public int getTrajanje() {
        return this.trajanje;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni() {
        return this.zaposleni;
    }
}