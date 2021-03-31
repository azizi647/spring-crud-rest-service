package net.azizli.springcrudrestservice.repository;

import net.azizli.springcrudrestservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Aziz on 3/29/2021.
 * @project spring-crud-rest-service
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
