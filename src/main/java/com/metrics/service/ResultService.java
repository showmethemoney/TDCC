package com.metrics.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metrics.bean.ResultBean;
import com.metrics.dao.ResultDao;


@Service
public class ResultService
{
	protected static final Logger logger = LoggerFactory.getLogger( ResultService.class );
	@Autowired
	private ResultDao resultDao = null;

	public List<ResultBean> selectResult() {
		return resultDao.select();
	}
}
