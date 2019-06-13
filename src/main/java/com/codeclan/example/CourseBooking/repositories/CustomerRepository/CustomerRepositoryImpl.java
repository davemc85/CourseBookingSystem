package com.codeclan.example.CourseBooking.repositories.CustomerRepository;

import com.codeclan.example.CourseBooking.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomersOverAgeByTownAndCourse(int age, String town, Long id) {
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("bookings.course", "course");
            cr.add(Restrictions.eq("course.id", id));
            cr.add(Restrictions.eq("course.town", town));
            cr.add(Restrictions.gt("age", age));
            result = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }


        return result;
    }
}
