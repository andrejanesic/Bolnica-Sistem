package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Lek;
import rs.raf.UI.P2.andreja_nesic.model.LekReceptPK;
import rs.raf.UI.P2.andreja_nesic.model.Recept;

public class LekReceptDto extends AbstractDto<LekReceptPK> {

    private LekReceptPK id;
    private Recept recept;
    private Lek lek;

    public LekReceptDto() {
    }

    public void setId(LekReceptPK id) {
        this.id = id;
    }

    public LekReceptPK getId() {
        return this.id;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    public Recept getRecept() {
        return this.recept;
    }

    public void setLek(Lek lek) {
        this.lek = lek;
    }

    public Lek getLek() {
        return this.lek;
    }
}