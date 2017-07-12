package web.securityspring.service;

import web.securityspring.model.User;

/**
 * Service class for {@link web.securityspring.model.User}
 * @author Alexander.
 * @version 1.0
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
