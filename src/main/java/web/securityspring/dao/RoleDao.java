package web.securityspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.securityspring.model.Role;

/**
 * Created by Alexander on 12/07/2017.
 */
public interface RoleDao extends JpaRepository<Role, Long> {

}
