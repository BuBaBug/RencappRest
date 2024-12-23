package generation.rencapp.repositories;

import generation.rencapp.models.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
    Notificacion findNotificacionByNotificacionId(Long id);
    @Query(value = "select *  from notificaciones n where n.usuario_id= ?1",nativeQuery = true)
    List<Notificacion> findNotificacionsByUsuarioId(Long id);
}
