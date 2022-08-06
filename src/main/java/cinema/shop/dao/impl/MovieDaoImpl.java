package cinema.shop.dao.impl;

import cinema.shop.dao.AbstractDao;
import cinema.shop.dao.MovieDao;
import cinema.shop.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
