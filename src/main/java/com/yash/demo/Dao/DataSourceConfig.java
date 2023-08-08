package com.yash.demo.Dao;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
	
	@Bean
	public DataSourceProperties dataSourceProperties() {
	return new DataSourceProperties();
	}

	@Bean
	public DataSource customDataSource(DataSourceProperties dataSourceProperties) {
		System.out.println("custom datasource");
	return new MyCustomBasicDataSourceFactory(dataSourceProperties);
	}

}
