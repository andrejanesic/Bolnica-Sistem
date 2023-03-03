package rs.raf.UI.P2.andreja_nesic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import rs.raf.UI.P2.andreja_nesic.model.Odmor;

@Repository
public interface OdmorRepository extends JpaRepository<Odmor, Integer>, JpaSpecificationExecutor<Odmor> {
}