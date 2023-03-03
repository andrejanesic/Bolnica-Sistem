package rs.raf.UI.P2.andreja_nesic.model.dto;

public class LekarDto extends AbstractDto<String> {

    private String specijalizacija;

    public LekarDto() {
    }

    public void setSpecijalizacija(String specijalizacija) {
        this.specijalizacija = specijalizacija;
    }

    public String getSpecijalizacija() {
        return this.specijalizacija;
    }
}