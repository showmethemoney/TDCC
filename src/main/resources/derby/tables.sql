CREATE TABLE HISTORY_REQUEST (ID VARCHAR(32), ORIGIN VARCHAR(8), TS VARCHAR(19), BCSS_BUS_DT VARCHAR(10), MSG_TYPE VARCHAR(3), NARR VARCHAR(40), SNDR_REF VARCHAR(13), MSG_ACTION VARCHAR(4), RESEND VARCHAR(1), PRIMARY KEY (ID))
CREATE TABLE HISTORY_RESPONSE (ID VARCHAR(32), ORIGIN VARCHAR(8), TS VARCHAR(19), BCSS_BUS_DT VARCHAR(10), MSG_TYPE VARCHAR(3), NARR VARCHAR(40), SNDR_REF VARCHAR(13), MSG_ACTION VARCHAR(4), RESEND VARCHAR(1), PRIMARY KEY (ID)) 