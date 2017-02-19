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

import com.metrics.entity.HistoryRequest;

@Repository
public class HistoryRequestDao
{
	protected static final Logger logger = LoggerFactory.getLogger( HistoryRequestDao.class );
	private static final String NAMED_QUERY_ALL = "SELECT o FROM HistoryRequest o";

	@PersistenceContext
	private EntityManager entityManager = null;

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(HistoryRequest entity) {
		try {
			entityManager.persist( entity );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.NEVER)
	public List<HistoryRequest> select() {
		List<HistoryRequest> result = null;

		try {
			Query query = entityManager.createQuery( NAMED_QUERY_ALL );

			result = (List<HistoryRequest>) query.getResultList();
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return result;
	}
}
