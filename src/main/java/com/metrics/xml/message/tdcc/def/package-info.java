@XmlJavaTypeAdapters({ @XmlJavaTypeAdapter(value = StringAdapter.class, type = String.class) })
/**
 * @author ethan
 *
 */
package com.metrics.xml.message.tdcc.def;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import com.metrics.xml.message.adapter.StringAdapter;
