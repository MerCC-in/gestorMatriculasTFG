package es.uma.mcc.matriculas.repository;

import es.uma.mcc.matriculas.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Optional<Usuario> findByUser(String user);
}
