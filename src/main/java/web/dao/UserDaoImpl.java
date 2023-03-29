package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private UserDao userDao;
    @Override
    public void addUser(User user) {

    }
}
