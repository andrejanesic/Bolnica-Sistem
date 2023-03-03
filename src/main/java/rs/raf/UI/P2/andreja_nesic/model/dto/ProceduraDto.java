package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Pacijent;
import rs.raf.UI.P2.andreja_nesic.model.Soba;

import java.sql.Date;

public class ProceduraDto extends AbstractDto<Integer> {

    private int proceduraId;
    private String tip;
    private Date pocetak;
    private Date kraj;
    private String ime;
    private Pacijent pacijent;
    private Soba soba;

    public ProceduraDto() {
    }

    public void setProceduraId(int proceduraId) {
        this.proceduraId = proceduraId;
    }

    public int getProceduraId() {
        return this.proceduraId;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
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

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
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
}