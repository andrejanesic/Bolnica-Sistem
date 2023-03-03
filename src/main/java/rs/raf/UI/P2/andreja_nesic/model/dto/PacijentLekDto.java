package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Lek;
import rs.raf.UI.P2.andreja_nesic.model.Pacijent;
import rs.raf.UI.P2.andreja_nesic.model.PacijentLekPK;

public class PacijentLekDto extends AbstractDto<PacijentLekPK> {

    private PacijentLekPK id;
    private Pacijent pacijent;
    private Lek lek;

    public PacijentLekDto() {
    }

    public void setId(PacijentLekPK id) {
        this.id = id;
    }

    public PacijentLekPK getId() {
        return this.id;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }

    public Pacijent getPacijent() {
        return this.pacijent;
    }

    public void setLek(Lek lek) {
        this.lek = lek;
    }

    public Lek getLek() {
        return this.lek;
    }
}