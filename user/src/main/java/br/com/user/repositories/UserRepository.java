package br.com.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
