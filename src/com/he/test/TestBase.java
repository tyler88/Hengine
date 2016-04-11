package com.he.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
 
public class TestBase {
    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
 
    public TestBase() {
        super();
    }
 
    @Before
    public void initEmfAndEm() {
        BasicConfigurator.configure();
        Logger.getLogger("org").setLevel(Level.ERROR);
 
        entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
        entityManager = entityManagerFactory.createEntityManager();
    }
 
    @After
    public void cleanup() {
    	entityManager.close();
    }
}