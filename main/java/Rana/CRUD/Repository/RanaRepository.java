package Rana.CRUD.Repository;

import Rana.CRUD.Entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RanaRepository extends JpaRepository<Registration,Long> {

}
