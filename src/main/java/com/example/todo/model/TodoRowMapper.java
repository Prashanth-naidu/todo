package com.example.todo.model;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.todo.model.Todo;

public class TodoRowMapper implements RowMapper<Todo> {

    public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new Todo(
                rs.getInt("id"),
                rs.getString("todo"),
                rs.getString("status"),
                rs.getString("priority"));
    }
}
