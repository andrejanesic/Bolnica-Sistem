package rs.raf.UI.P2.andreja_nesic.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "zaposleni_id")
public class Racunovodja extends Zaposleni {
}
