create database `spending_manager`;
create user `sending_manager`@`localhost` IDENTIFIED BY 'admin123456789';
grant all on `spending_manager` to `sending_manager`@`localhost`;

