package com.metrics.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SequenceDao
{
	protected static final Logger logger = LoggerFactory.getLogger( SequenceDao.class );
	@PersistenceContext
	private EntityManager entityManager = null;
	
	/**
	 * get sequence from derby database
	 * @return
	 */
	@Transactional(propagation = Propagation.NEVER)
	public int getSequence() {
		return (int) entityManager.createNativeQuery( "values (next value for TDCC_SEQ)" ).getSingleResult();
	}
}
