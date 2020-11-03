package com.codegym.service;

import com.codegym.model.Comment;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class HibernateCommentServiceImpl implements CommentService {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate-conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate-conf.xml")
                    .buildSessionFactory();
            sessionFactory.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Comment> findAll() {
        String queryStr = "SELECT c FROM Comment AS c";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr, Comment.class);
        return query.getResultList();
    }

    @Override
    public Comment findOne(Long id) {
        String queryStr = "SELECT c FROM Comment AS c WHERE c.id = :id";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr, Comment.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public Comment save(Comment comment) {
        return null;
    }

    @Override
    public List<Comment> save(List<Comment> comments) {
        return null;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public List<Comment> findAll(List<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(Comment comment) {

    }

    @Override
    public void delete(List<Comment> comments) {

    }

    @Override
    public void deleteAll() {

    }
}
