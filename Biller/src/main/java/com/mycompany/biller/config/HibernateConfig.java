package com.mycompany.biller.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.biller.model"})
@EnableTransactionManagement
public class HibernateConfig {

    // Change the below based on the DBMS you choose
    
    //Oracle DataBase
	private final static String DATABASE_URL = "jdbc:oracle:thin:@127.0.0.1:1521/TestDB";
	private final static String DATABASE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.OracleDialect";
	private final static String DATABASE_USERNAME = "TestDB";
	private final static String DATABASE_PASSWORD = "oracle12c";
    
    
    // MySql DataBase
//    private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/BillerDB1";
//    private final static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
//    private final static String DATABASE_DIALECT = "org.hibernate.dialect.MySQLDialect";
//    private final static String DATABASE_USERNAME = "root";
//    private final static String DATABASE_PASSWORD = "root";

    // dataSource bean will be available
    @Bean("dataSource")
    public DataSource getDataSource() {

        BasicDataSource dataSource = new BasicDataSource();

        // Providing the database connection information
        dataSource.setDriverClassName(DATABASE_DRIVER);
        dataSource.setUrl(DATABASE_URL);
        dataSource.setUsername(DATABASE_USERNAME);
        dataSource.setPassword(DATABASE_PASSWORD);

        return dataSource;

    }

    // sessionFactory bean will be available
    @Bean
    public SessionFactory getSessionFactory(DataSource dataSource) {

        LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);

        builder.addProperties(getHibernateProperties());
        builder.scanPackages("com.mycompany.biller.model");

        return builder.buildSessionFactory();

    }

    // All the hibernate properties will be returned in this method	
    private Properties getHibernateProperties() {

        Properties properties = new Properties();

        properties.put("hibernate.dialect", DATABASE_DIALECT);
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");

        properties.put("hibernate.hbm2ddl.auto", "update");

        return properties;
    }

    // transactionManager bean
    @Bean
    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
        return transactionManager;
    }

}
