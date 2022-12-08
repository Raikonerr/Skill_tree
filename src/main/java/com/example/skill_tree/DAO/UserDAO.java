package com.example.skill_tree.DAO;

import com.example.skill_tree.entities.User;
import com.example.skill_tree.config.Config;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import jakarta.persistence.Query;

@Repository
public class UserDAO {
    public User getUser(String username){
        Config config = Config.getConfig();
        Query query = config.getEntityManager().createQuery("SELECT u FROM User u WHERE u.username = :username");
        query.setParameter("username",username);
        return (User) query.getSingleResult();
    }

    public void addUser(User user) {
        Config config = Config.getConfig();
        try {
            config.getEntityManager().getTransaction().begin();
            config.getEntityManager().persist(user);
            config.getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            config.getEntityManager().getTransaction().rollback();
        }
    }

    public void updateUser(User user) {
        Config config = Config.getConfig();
        try {
            config.getEntityManager().getTransaction().begin();
            config.getEntityManager().merge(user);
            config.getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            config.getEntityManager().getTransaction().rollback();
        }
    }

    public void deleteUser(User user) {
        Config config = Config.getConfig();
        try {
            config.getEntityManager().getTransaction().begin();
            config.getEntityManager().remove(user);
            config.getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            config.getEntityManager().getTransaction().rollback();
        }
    }

    public User getUserById(Long id) {
        Config config = Config.getConfig();
        return config.getEntityManager().find(User.class, id);
    }

    public User getUserByEmail(String email) {
        Config config = Config.getConfig();
        Query query = config.getEntityManager().createQuery("SELECT u FROM User u WHERE u.email = :email");
        query.setParameter("email",email);
        return (User) query.getSingleResult();
    }

    public User login(String email, String password) {
        Config config = Config.getConfig();
        EntityManager em = config.getEntityManager();
        try {
            em.getTransaction().begin();
            Query query = config.getEntityManager().createQuery("SELECT u FROM User u WHERE u.email = :email AND u.password = :password");
            query.setParameter("email",email);
            query.setParameter("password",password);
            User users = (User) query.getSingleResult();
            em.getTransaction().commit();
            return  users;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            em.close();
        }

    }





}
