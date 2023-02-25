package es.uma.mcc.matriculas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import es.uma.mcc.matriculas.model.Authority;
import es.uma.mcc.matriculas.model.Usuario;
import es.uma.mcc.matriculas.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {
		
	@Autowired
	UsuarioRepository userRepository;
		
	@Override
	public UserDetails loadUserByUsername(String username)  {
			
	//Buscar el usuario con el repositorio y si no existe lanzar una exepcion
	Usuario appUser = userRepository.findByUser(username).orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));
	     
	//Mapear nuestra lista de Authority con la de spring security 
	List grantList = new ArrayList();
	for (Authority authority: appUser.getAuthority()) {
	    // ROLE_USER, ROLE_ADMIN,..
	    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
	        grantList.add(grantedAuthority);

	}
	    
			
	//Crear El objeto UserDetails que va a ir en sesion y retornarlo.
	UserDetails user = (UserDetails) new User(appUser.getUser(), appUser.getPassword(),grantList);
	    return user;
	}
	    
}
	

