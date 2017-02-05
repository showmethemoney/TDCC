package test.com.metrics.xml.message;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestTDCC
{
	protected static final Logger logger = LoggerFactory.getLogger( TestTDCC.class );

	@Test
	public void testOPC() {
		String[] xmls = new String[] {
		        "<?xml version=\"1.0\" encoding=\"CNS11643\"?><!DOCTYPE BCSSMESSAGE SYSTEM \"FiscBCSS.dtd\"><BCSSMESSAGE ORIGIN=\"BCSS\" TS=\"2016-11-23T09:54:33\" BCSS_BUS_DT=\"2016-11-23\" MSG_TYPE=\"002\" SNDR_REF=\"0000000000000\" ACTION=\"LFCP\" RESEND=\"N\"><LC_NOTIFP REF_TYPE=\"22\" REF=\"NTQPHLUMKLZGD\" ST=\"ACPT\" SNDR_REF=\"1051123000007\"/></BCSSMESSAGE>123456789",
		        "<?xml version=\"1.0\" encoding=\"CNS11643\"?><!DOCTYPE BCSSMESSAGE SYSTEM \"FiscBCSS.dtd\"><BCSSMESSAGE ORIGIN=\"BCSS\" TS=\"2016-11-23T11:18:24\" BCSS_BUS_DT=\"2016-11-23\" MSG_TYPE=\"002\" SNDR_REF=\"0000000000009\" ACTION=\"LFCP\" RESEND=\"N\"><LC_NOTIFP REF_TYPE=\"24\" REF=\"HIGTVMVOKLZGD\" ST=\"ACPT\" SNDR_REF=\"1051123000002\"/></BCSSMESSAGE>", };

		Pattern p = Pattern.compile( "</BCSSMESSAGE>(.+)" );

		for (String xml : xmls) {
			Matcher m = p.matcher( xml );

			String opcCode = null;
			if (m.find()) {
				opcCode = m.group( 1 );
			}

			if (StringUtils.isNotBlank( opcCode )) {
				logger.info( "remove end : {}", StringUtils.removeEnd( xml, opcCode ) );
			}
		}
	}

	@Ignore
	@Test
	public void testParsing() {
		String[] xmls = new String[] {
		        "<?xml version=\"1.0\" encoding=\"CNS11643\"?><!DOCTYPE BCSSMESSAGE SYSTEM \"FiscBCSS.dtd\"><BCSSMESSAGE ORIGIN=\"BCSS\" TS=\"2016-11-23T09:54:33\" BCSS_BUS_DT=\"2016-11-23\" MSG_TYPE=\"002\" SNDR_REF=\"0000000000000\" ACTION=\"LFCP\" RESEND=\"N\"><LC_NOTIFP REF_TYPE=\"22\" REF=\"NTQPHLUMKLZGD\" ST=\"ACPT\" SNDR_REF=\"1051123000007\"/></BCSSMESSAGE>",
		        "<?xml version=\"1.0\" encoding=\"CNS11643\"?><!DOCTYPE BCSSMESSAGE SYSTEM \"FiscBCSS.dtd\"><BCSSMESSAGE ORIGIN=\"BCSS\" TS=\"2016-11-23T11:18:24\" BCSS_BUS_DT=\"2016-11-23\" MSG_TYPE=\"002\" SNDR_REF=\"0000000000009\" ACTION=\"LFCP\" RESEND=\"N\"><LC_NOTIFP REF_TYPE=\"24\" REF=\"HIGTVMVOKLZGD\" ST=\"ACPT\" SNDR_REF=\"1051123000002\"/></BCSSMESSAGE>",
		        "<?xml version = \"1.0\" encoding=\"CNS11643\"?><!DOCTYPE BCSSMESSAGE SYSTEM \"FiscBCSS.dtd\"><BCSSMESSAGE MSG_TYPE=\"101\" ACTION=\"DI\" ORIGIN=\"B0060000\" TS=\"2016-11-23T09:31:54\" SNDR_REF=\"1051123000005\" BCSS_BUS_DT=\"2016-11-23\"><DEP ISIN=\"006000009227\" ISS_TYPE=\"2\" ISSR_NM=\"拲褎齡鞄?迻襬\" ISSR_ID=\"285840**\" ISSR_BUS_CODE=\"012511\" ISSR_GRP_ID=\"2\" PRTY_ID=\"B0060000\" PSDB_ID=\"P0060000\" BRNCH_ID=\"0065078\" FVAL=\"3000000\" ISS_DAYS=\"180\" ISS_DT=\"2016-11-25\" DEP_DT=\"2016-11-23\" SELL_DT=\"2016-11-25\" MAT_DT=\"2017-05-24\" TH_MAT_DT=\"2017-05-24\"><DENOMINATION ID=\"300\" FVAL=\"3000000\" UVAL=\"3000000\" UNITS=\"1\" /><AGREER AGR_ID=\"0060327\" AGRM_REF=\"006000009227\" /><ENDORSEE END_ID=\"\" END_ADDR=\"\" /></DEP></BCSSMESSAGE>B0060000646579B7",
		        "<?xml version=\"1.0\" encoding=\"CNS11643\"?><!DOCTYPE BCSSMESSAGE SYSTEM \"FiscBCSS.dtd\"><BCSSMESSAGE ORIGIN=\"BCSS\" TS=\"2016-11-23T16:19:34\" BCSS_BUS_DT=\"2016-11-23\" MSG_TYPE=\"040\" SNDR_REF=\"0000000000018\" ACTION=\"IM\" RESEND=\"N\"><IM MSG=\"本日交易已結束，庫存１６：５７款項１６：５７交割１７：１０台外幣庫存１７：１８。\"><SNDR><BCSS_USER PRTY_ID=\"BCSS\"/></SNDR><RCVR><BCSS_USER PRTY_ID=\"B0060000\"/></RCVR></IM></BCSSMESSAGE>",
		        "<?xml version=\"1.0\" encoding=\"CNS11643\"?><!DOCTYPE BCSSMESSAGE SYSTEM \"FiscBCSS.dtd\"><BCSSMESSAGE ORIGIN=\"BCSS\" TS=\"2016-11-23T12:24:09\" BCSS_BUS_DT=\"2016-11-23\" MSG_TYPE=\"003\" SNDR_REF=\"0000000000016\" ACTION=\"RDM\" RESEND=\"N\"><CSH_ADVICE REF=\"DZZXSTDQKLZGD\" TSF_SIDE=\"R\" FT_REF=\"999999\" RDMP_TAX_AMT=\"2959\"><PRTY><STLM_PRTY PRTY_ID=\"B0060000\" ACCT_ID=\"*************\"/></PRTY><CPRTY><STLM_PRTY PRTY_ID=\"P0060000\" ACCT_ID=\"*************\"/></CPRTY><SEC_LEG ISIN=\"006000008786\"><SEC_GEN_LEG GEN_ID=\"000\" SEC_AMT=\"5000000\"><SEC_UNITS_LEG UNITS=\"1\" UVAL=\"5000000\"/><FRST_LEG><CSH_LEG CSH_AMT=\"4997041\"/><TAX_IMP TAX_AMT=\"0\"/></FRST_LEG></SEC_GEN_LEG></SEC_LEG><CSH_LEG CSH_AMT=\"4997041\"/></CSH_ADVICE></BCSSMESSAGE>" };

		Pattern p = Pattern.compile( "<BCSSMESSAGE .*><(\\w+) " );

		for (String xml : xmls) {
			Matcher m = p.matcher( xml );

			if (m.find()) {
				logger.info( m.group( 1 ) );
			}
		}
	}
}
