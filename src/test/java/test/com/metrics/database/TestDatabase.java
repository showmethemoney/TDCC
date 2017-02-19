package test.com.metrics.database;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.metrics.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class TestDatabase
{
	protected static final Logger logger = LoggerFactory.getLogger( TestDatabase.class );
	@PersistenceContext
	private EntityManager entityManager = null;

	@Test
	public void testSelect() {
		try {
			Assert.assertNotNull( entityManager );

			logger.info( "{}", (int) entityManager.createNativeQuery( "values (next value for TDCC_SEQ)" ).getSingleResult() );
			logger.info( "{}", (int) entityManager.createNativeQuery( "values (next value for TDCC_SEQ)" ).getSingleResult() );
			logger.info( "{}", (int) entityManager.createNativeQuery( "values (next value for TDCC_SEQ)" ).getSingleResult() );
			logger.info( "{}", (int) entityManager.createNativeQuery( "values (next value for TDCC_SEQ)" ).getSingleResult() );
			logger.info( "{}", (int) entityManager.createNativeQuery( "values (next value for TDCC_SEQ)" ).getSingleResult() );
			logger.info( "{}", (int) entityManager.createNativeQuery( "values (next value for TDCC_SEQ)" ).getSingleResult() );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

}
