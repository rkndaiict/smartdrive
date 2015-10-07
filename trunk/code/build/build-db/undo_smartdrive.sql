
-- START UNDO OF CHANGE SCRIPT #1000000050: 1000000050_DDL_Individual.sql


DROP TABLE INDIVIDUAL
/


DELETE FROM changelog WHERE change_number = 1000000050;

COMMIT;

-- END UNDO OF CHANGE SCRIPT #1000000050: 1000000050_DDL_Individual.sql


-- START UNDO OF CHANGE SCRIPT #1000000040: 1000000040_DDL_Agency.sql


DROP TABLE AGENCY
/


DELETE FROM changelog WHERE change_number = 1000000040;

COMMIT;

-- END UNDO OF CHANGE SCRIPT #1000000040: 1000000040_DDL_Agency.sql


-- START UNDO OF CHANGE SCRIPT #1000000030: 1000000030_DDL_Common.sql


DROP TABLE CAR_BRAND
/
DROP TABLE CAR
/
DROP TABLE ADDRESS
/
DROP TABLE LOCATION
/


DELETE FROM changelog WHERE change_number = 1000000030;

COMMIT;

-- END UNDO OF CHANGE SCRIPT #1000000030: 1000000030_DDL_Common.sql

