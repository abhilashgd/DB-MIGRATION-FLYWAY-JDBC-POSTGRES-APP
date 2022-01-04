package com.abhilashgd.movie;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/4/22
 */
public class MovieRowMapper implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Movie(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                List.of(),
                LocalDate.parse(
                        resultSet.getString("release_date"))
        );
    }
}
