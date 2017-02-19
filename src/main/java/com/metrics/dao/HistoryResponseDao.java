package com.metrics.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.metrics.entity.HistoryResponse;

@Repository
public class HistoryResponseDao
{
	protected static final Logger logger = LoggerFactory.getLogger( HistoryResponseDao.class );
	private static final String NAMED_QUERY_ALL = "SELECT o FROM HistoryResponse o";
	private static final String NAMED_QUERY_BY_SNDRREF = "SELECT o FROM HistoryResponse o WHERE o.sndrRef = :sndrRef";

	@PersistenceContext
	private EntityManager entityManager = null;

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(HistoryResponse entity) throws Throwable {
		try {
			entityManager.persist( entity );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );

			throw cause;
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.NEVER)
	public List<HistoryResponse> select() {
		List<HistoryResponse> result = null;

		try {
			Query query = entityManager.createQuery( NAMED_QUERY_ALL );

			result = (List<HistoryResponse>) query.getResultList();
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return result;
	}

	@Transactional(propagation = Propagation.NEVER)
	public List<HistoryResponse> queryBySndrRef(String sndrRef) {
		List<HistoryResponse> result = null;

		try {
			Query query = entityManager.createQuery( NAMED_QUERY_BY_SNDRREF );
			query.setParameter( "sndrRef", sndrRef );

			result = query.getResultList();
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return result;
	}
}
