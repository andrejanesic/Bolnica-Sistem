package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Procedura;
import rs.raf.UI.P2.andreja_nesic.model.ProceduraZaposleniPK;
import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;

public class ProceduraZaposleniDto extends AbstractDto<ProceduraZaposleniPK> {

    private ProceduraZaposleniPK id;
    private Procedura procedura;
    private Zaposleni zaposleni;

    public ProceduraZaposleniDto() {
    }

    public void setId(ProceduraZaposleniPK id) {
        this.id = id;
    }

    public ProceduraZaposleniPK getId() {
        return this.id;
    }

    public void setProcedura(Procedura procedura) {
        this.procedura = procedura;
    }

    public Procedura getProcedura() {
        return this.procedura;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni() {
        return this.zaposleni;
    }
}