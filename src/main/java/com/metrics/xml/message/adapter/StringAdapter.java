package com.metrics.xml.message.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringAdapter extends XmlAdapter<String, String>
{
	protected static final Logger logger = LoggerFactory.getLogger( StringAdapter.class );
	@Override
	public String unmarshal(String v) throws Exception {
		return v;
	}

	@Override
	public String marshal(String v) throws Exception {
		// if the value's length = 0 return null, else do nothing
		if (null != v) {
			return 0 == StringUtils.trim( v ).length() ? null : v;
		} else {
			return v;
		}
	}

}
