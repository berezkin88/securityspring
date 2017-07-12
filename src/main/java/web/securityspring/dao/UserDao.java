package web.securityspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.securityspring.model.User;

/**
 * Created by Alexander on 12/07/2017.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
