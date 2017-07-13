package web.securityspring.service;

/**
 * Service for security.
 *
 * @author Alexander
 * @version 1.0
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
