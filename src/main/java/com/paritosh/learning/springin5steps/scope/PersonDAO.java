package com.paritosh.learning.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

@Component(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDAO {

    @Autowired
    private JdbcConnection connection;

    public JdbcConnection getJdbcConnection() {
        return connection;
    }
}
