package test.com.metrics.database;

import java.io.StringReader;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.metrics.AppConfig;
import com.metrics.entity.HistoryRequest;
import com.metrics.entity.HistoryResponse;
import com.metrics.service.HistoryRequestService;
import com.metrics.service.HistoryResponseService;
import com.metrics.xml.message.tdcc.xml.DEPMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class TestDatabase
{
	protected static final Logger logger = LoggerFactory.getLogger( TestDatabase.class );
	@PersistenceContext
	private EntityManager entityManager = null;
	@Autowired
	private HistoryRequestService requestService = null;
	@Autowired
	private HistoryResponseService responseService = null;

	@Test
	public void testLeftJoin() {
		String xml = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance( DEPMessage.class );
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			xml = "<?xml version = \"1.0\" encoding=\"CNS11643\"?><BCSSMESSAGE MSG_TYPE=\"101\" ACTION=\"DI\" ORIGIN=\"B0060000\" TS=\"2016-11-23T09:31:54\" SNDR_REF=\"1051123000005\" BCSS_BUS_DT=\"2016-11-23\"><DEP ISIN=\"006000009227\" ISS_TYPE=\"2\" ISSR_NM=\"HELLWORLD\" ISSR_ID=\"285840**\" ISSR_BUS_CODE=\"012511\" ISSR_GRP_ID=\"2\" PRTY_ID=\"B0060000\" PSDB_ID=\"P0060000\" BRNCH_ID=\"0065078\" FVAL=\"3000000\" ISS_DAYS=\"180\" ISS_DT=\"2016-11-25\" DEP_DT=\"2016-11-23\" SELL_DT=\"2016-11-25\" MAT_DT=\"2017-05-24\" TH_MAT_DT=\"2017-05-24\"><DENOMINATION ID=\"300\" FVAL=\"3000000\" UVAL=\"3000000\" UNITS=\"1\" /><AGREER AGR_ID=\"0060327\" AGRM_REF=\"006000009227\" /><ENDORSEE END_ID=\"\" END_ADDR=\"\" /></DEP></BCSSMESSAGE>";
			DEPMessage message = (DEPMessage) unmarshaller.unmarshal( new StringReader( xml ) );
			requestService.save( message );

			xml = "<?xml version = \"1.0\" encoding=\"CNS11643\"?><BCSSMESSAGE MSG_TYPE=\"101\" ACTION=\"DI\" ORIGIN=\"B0060000\" TS=\"2016-11-23T09:31:54\" SNDR_REF=\"1051123000007\" BCSS_BUS_DT=\"2016-11-23\"><DEP ISIN=\"006000009227\" ISS_TYPE=\"2\" ISSR_NM=\"HELLWORLD\" ISSR_ID=\"285840**\" ISSR_BUS_CODE=\"012511\" ISSR_GRP_ID=\"2\" PRTY_ID=\"B0060000\" PSDB_ID=\"P0060000\" BRNCH_ID=\"0065078\" FVAL=\"3000000\" ISS_DAYS=\"180\" ISS_DT=\"2016-11-25\" DEP_DT=\"2016-11-23\" SELL_DT=\"2016-11-25\" MAT_DT=\"2017-05-24\" TH_MAT_DT=\"2017-05-24\"><DENOMINATION ID=\"300\" FVAL=\"3000000\" UVAL=\"3000000\" UNITS=\"1\" /><AGREER AGR_ID=\"0060327\" AGRM_REF=\"006000009227\" /><ENDORSEE END_ID=\"\" END_ADDR=\"\" /></DEP></BCSSMESSAGE>";
			message = (DEPMessage) unmarshaller.unmarshal( new StringReader( xml ) );
			requestService.save( message );

			xml = "<?xml version = \"1.0\" encoding=\"CNS11643\"?><BCSSMESSAGE MSG_TYPE=\"101\" ACTION=\"DI\" ORIGIN=\"B0060000\" TS=\"2016-11-23T09:31:54\" SNDR_REF=\"1051123000005\" BCSS_BUS_DT=\"2016-11-23\"><DEP ISIN=\"006000009227\" ISS_TYPE=\"2\" ISSR_NM=\"HELLWORLD\" ISSR_ID=\"285840**\" ISSR_BUS_CODE=\"012511\" ISSR_GRP_ID=\"2\" PRTY_ID=\"B0060000\" PSDB_ID=\"P0060000\" BRNCH_ID=\"0065078\" FVAL=\"3000000\" ISS_DAYS=\"180\" ISS_DT=\"2016-11-25\" DEP_DT=\"2016-11-23\" SELL_DT=\"2016-11-25\" MAT_DT=\"2017-05-24\" TH_MAT_DT=\"2017-05-24\"><DENOMINATION ID=\"300\" FVAL=\"3000000\" UVAL=\"3000000\" UNITS=\"1\" /><AGREER AGR_ID=\"0060327\" AGRM_REF=\"006000009227\" /><ENDORSEE END_ID=\"\" END_ADDR=\"\" /></DEP></BCSSMESSAGE>";
			message = (DEPMessage) unmarshaller.unmarshal( new StringReader( xml ) );
			responseService.save( message );

			logger.info( "requestService.select() size : {}", requestService.select().size() );
			logger.info( "responseService.select() size : {}", responseService.select().size() );

			for (HistoryRequest request : requestService.select()) {
				List result = responseService.queryBySndrRef( request.getSndrRef() );
				
				logger.info( "result size : {}", result.size() );
			}

			// Query query = entityManager.createQuery( "SELECT req FROM HistoryRequest req LEFT JOIN com.metrics.entity.HistoryResponse res ON req.sndrRef =
			// res.sndrRef" );
			// List result = query.getResultList();
			//
			// logger.info( "result : {}", result.size() );
			// for(Object obj : result) {
			// HistoryRequest request = (HistoryRequest) obj;
			//
			// logger.info( "{}, {}, {}", request.getMsgType(), request.getAction(), request.getSndrRef() );
			// }
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	@Ignore
	@Test
	public void testHistoryRequest() {
		try {
			String xml = "<?xml version = \"1.0\" encoding=\"CNS11643\"?><BCSSMESSAGE MSG_TYPE=\"101\" ACTION=\"DI\" ORIGIN=\"B0060000\" TS=\"2016-11-23T09:31:54\" SNDR_REF=\"1051123000005\" BCSS_BUS_DT=\"2016-11-23\"><DEP ISIN=\"006000009227\" ISS_TYPE=\"2\" ISSR_NM=\"HELLWORLD\" ISSR_ID=\"285840**\" ISSR_BUS_CODE=\"012511\" ISSR_GRP_ID=\"2\" PRTY_ID=\"B0060000\" PSDB_ID=\"P0060000\" BRNCH_ID=\"0065078\" FVAL=\"3000000\" ISS_DAYS=\"180\" ISS_DT=\"2016-11-25\" DEP_DT=\"2016-11-23\" SELL_DT=\"2016-11-25\" MAT_DT=\"2017-05-24\" TH_MAT_DT=\"2017-05-24\"><DENOMINATION ID=\"300\" FVAL=\"3000000\" UVAL=\"3000000\" UNITS=\"1\" /><AGREER AGR_ID=\"0060327\" AGRM_REF=\"006000009227\" /><ENDORSEE END_ID=\"\" END_ADDR=\"\" /></DEP></BCSSMESSAGE>";
			JAXBContext jaxbContext = JAXBContext.newInstance( DEPMessage.class );

			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			DEPMessage message = (DEPMessage) unmarshaller.unmarshal( new StringReader( xml ) );

			requestService.save( message );

			List<HistoryRequest> result = requestService.select();

			logger.info( "size : {}", result.size() );

			for (HistoryRequest entity : result) {
				logger.info( "{}, {}, {}", entity.getMsgType(), entity.getAction(), entity.getSndrRef() );
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	@Ignore
	@Test
	public void testHistoryResponse() {
		try {
			String xml = "<?xml version = \"1.0\" encoding=\"CNS11643\"?><BCSSMESSAGE MSG_TYPE=\"101\" ACTION=\"DI\" ORIGIN=\"B0060000\" TS=\"2016-11-23T09:31:54\" SNDR_REF=\"1051123000007\" BCSS_BUS_DT=\"2016-11-23\"><DEP ISIN=\"006000009227\" ISS_TYPE=\"2\" ISSR_NM=\"HELLWORLD\" ISSR_ID=\"285840**\" ISSR_BUS_CODE=\"012511\" ISSR_GRP_ID=\"2\" PRTY_ID=\"B0060000\" PSDB_ID=\"P0060000\" BRNCH_ID=\"0065078\" FVAL=\"3000000\" ISS_DAYS=\"180\" ISS_DT=\"2016-11-25\" DEP_DT=\"2016-11-23\" SELL_DT=\"2016-11-25\" MAT_DT=\"2017-05-24\" TH_MAT_DT=\"2017-05-24\"><DENOMINATION ID=\"300\" FVAL=\"3000000\" UVAL=\"3000000\" UNITS=\"1\" /><AGREER AGR_ID=\"0060327\" AGRM_REF=\"006000009227\" /><ENDORSEE END_ID=\"\" END_ADDR=\"\" /></DEP></BCSSMESSAGE>";
			JAXBContext jaxbContext = JAXBContext.newInstance( DEPMessage.class );

			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			DEPMessage message = (DEPMessage) unmarshaller.unmarshal( new StringReader( xml ) );

			responseService.save( message );

			List<HistoryResponse> result = responseService.select();

			logger.info( "size : {}", result.size() );

			for (HistoryResponse entity : result) {
				logger.info( "{}, {}, {}", entity.getMsgType(), entity.getAction(), entity.getSndrRef() );
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	@Ignore
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
