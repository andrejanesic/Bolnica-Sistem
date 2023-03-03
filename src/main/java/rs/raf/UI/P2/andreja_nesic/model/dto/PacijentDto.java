package rs.raf.UI.P2.andreja_nesic.model.dto;

public class PacijentDto extends AbstractDto<Integer> {

    private int pacijentId;
    private String ime;
    private String prezime;
    private String jmbg;
    private String ulica;
    private String broj;
    private String grad;
    private String postanskiBroj;
    private String drzava;
    private String telefon;

    public PacijentDto() {
    }

    public void setPacijentId(int pacijentId) {
        this.pacijentId = pacijentId;
    }

    public int getPacijentId() {
        return this.pacijentId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getJmbg() {
        return this.jmbg;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getUlica() {
        return this.ulica;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getBroj() {
        return this.broj;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getGrad() {
        return this.grad;
    }

    public void setPostanskiBroj(String postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getPostanskiBroj() {
        return this.postanskiBroj;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getDrzava() {
        return this.drzava;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefon() {
        return this.telefon;
    }
}