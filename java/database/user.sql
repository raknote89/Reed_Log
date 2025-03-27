-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER reed_log_owner
WITH PASSWORD 'reedlog';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO reed_log_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO reed_log_owner;

CREATE USER reed_log_appuser
WITH PASSWORD 'reedlog';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO reed_log_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO reed_log_appuser;
