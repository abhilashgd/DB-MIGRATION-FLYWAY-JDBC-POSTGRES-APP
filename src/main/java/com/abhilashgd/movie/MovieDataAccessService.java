package com.abhilashgd.movie;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieDataAccessService implements MovieDao {
    private final JdbcTemplate jdbcTemplate;

    public MovieDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Movie> selectMovies() {
        var sql = """
                SELECT id,name,release_date
                FROM movie
                LIMIT 100;
                """;
    return jdbcTemplate.query(sql, new MovieRowMapper());
    //below code moved to movie rowMapper class
            //(resultSet,i)->{
//        return new Movie(
//                resultSet.getInt("id"),
//                resultSet.getString("name"),
//                null,
//                LocalDate.parse(
//                        resultSet.getString("release_date"))
//                );
   // });
    }

    @Override
    public int insertMovie(Movie movie) {
        //inserting new record to database
        var sql = """
                INSERT INTO movie (name, release_date) 
                VALUES (?,?);
                """;
     return jdbcTemplate.update(sql,
             movie.name(),
             movie.releaseDate());
    }

    @Override
    public int deleteMovie(int id) {
        var sql = """
                DELETE 
                FROM movie
                WHERE id=?
                """;
      return jdbcTemplate.update(sql, id);
    }

    @Override
    public Optional<Movie> selectMovieById(int id) {
        var sql = """
                SELECT id,name,release_date
                FROM movie
                WHERE id=?
                """;
//       List<Movie> movies =  jdbcTemplate.
//               query(sql,new MovieRowMapper(),id);
//       return movies.stream().findFirst();
        return jdbcTemplate.
              query(sql,new MovieRowMapper(),id)
                    .stream()
                    .findFirst();
    }
    
}
