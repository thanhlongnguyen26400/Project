package spending_management_project.constant;

/**
 * Constant for authority.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 2017/8/7
 * @since JDK1.8
 */
public interface AuthorityConstant {

    String RESOURCE_ID = "api";
    String SCOPE = "read";
    String GRANT_TYPE = "password,refresh_token";
    String AUTHORITY = "USER";
    String BASIC = "basic";
    String BEARER = "bearer";
    String HEADER = "Authorization";
    String PREFIX = "Bearer ";
    String SECRET = "123456";
    String ADMIN = "ROLE_ADMIN";
    String USER = "ROLE_USER";
    long ROOT_ID = 0;
}
