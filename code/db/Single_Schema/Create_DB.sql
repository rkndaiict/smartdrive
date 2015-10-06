SET DEFINE OFF
spool on
spool Create_DB_log.txt

-- Common  Module
@../common/ddl/createtable.sql;

commit;

spool off;
disconnect;
exit;
