package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Recept;
import rs.raf.UI.P2.andreja_nesic.model.ReceptLekarPK;
import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;

public class ReceptLekarDto extends AbstractDto<ReceptLekarPK> {

    private ReceptLekarPK id;
    private Zaposleni zaposleni;
    private Recept recept;

    public ReceptLekarDto() {
    }

    public void setId(ReceptLekarPK id) {
        this.id = id;
    }

    public ReceptLekarPK getId() {
        return this.id;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni() {
        return this.zaposleni;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    public Recept getRecept() {
        return this.recept;
    }
}