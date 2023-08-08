package com.yash.demo.Dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

public class MyCustomBasicDataSourceFactory extends org.springframework.jdbc.datasource.AbstractDataSource {

	private DataSource targetDataSource;

	public MyCustomBasicDataSourceFactory(DataSourceProperties dataSourceProperties) {
		this.targetDataSource = dataSourceProperties.initializeDataSourceBuilder().build();
	}

	@Override
	public Connection getConnection() throws SQLException {
		try {
			if (100 % 2 == 0) {
				return targetDataSource.getConnection();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return targetDataSource.getConnection(username, password);
	}

}
