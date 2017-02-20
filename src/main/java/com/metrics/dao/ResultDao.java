package com.metrics.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.metrics.bean.ResultBean;


@Repository
public class ResultDao
{
	protected static final Logger logger = LoggerFactory.getLogger( ResultDao.class );
	private static final String NAMED_QUERY_SELECT_NATVIE = "SELECT req.origin as req_origin, req.ts as req_ts, req.bcss_bus_dt as req_bcssBusDt, req.msg_type as req_msgType, req.narr as req_narr, req.sndr_ref as req_sndrRef, req.msg_action as req_msgAction, req.resend as req_resend, res.origin as res_origin, res.ts as res_ts, res.bcss_bus_dt as res_bcssBusDt, res.msg_type as res_msgType, res.narr as res_narr, res.sndr_ref as res_sndrRef, res.msg_action as res_msgAction, res.resend as res_resend FROM history_request req LEFT JOIN history_response res ON req.sndr_ref = res.sndr_ref";

	@PersistenceContext
	EntityManager entityManager = null;

	@Transactional(propagation = Propagation.NEVER)
	public List<ResultBean> select() {
		List<ResultBean> result = null;

		try {
			// ResultBean @SqlResultSetMapping define at @Entity HistoryRequest
			result = (List<ResultBean>) entityManager.createNativeQuery( NAMED_QUERY_SELECT_NATVIE, "ResultBean" ).getResultList();
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return result;
	}
}
