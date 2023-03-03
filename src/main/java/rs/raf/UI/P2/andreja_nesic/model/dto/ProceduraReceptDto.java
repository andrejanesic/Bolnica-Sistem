package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Procedura;
import rs.raf.UI.P2.andreja_nesic.model.ProceduraReceptPK;
import rs.raf.UI.P2.andreja_nesic.model.Recept;

public class ProceduraReceptDto extends AbstractDto<ProceduraReceptPK> {

    private ProceduraReceptPK id;
    private Procedura procedura;
    private Recept recept;

    public ProceduraReceptDto() {
    }

    public void setId(ProceduraReceptPK id) {
        this.id = id;
    }

    public ProceduraReceptPK getId() {
        return this.id;
    }

    public void setProcedura(Procedura procedura) {
        this.procedura = procedura;
    }

    public Procedura getProcedura() {
        return this.procedura;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    public Recept getRecept() {
        return this.recept;
    }
}