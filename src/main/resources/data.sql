create table device(
id integer not NULL,
device_name varchar (255) NOT NULL,
description varchar (255),
date_added timestamp ,
primary key(id)
);

INSERT INTO device(id, device_name, description, date_added) values (123,'Laptop','MacPro',current_timestamp );
INSERT INTO device(id, device_name, description, date_added) values (456,'Mobile','Iphone',current_timestamp );
INSERT INTO device(id, device_name, description, date_added) values (789,'PDA','Zebra',current_timestamp );
INSERT INTO device(id, device_name, description, date_added) values (546,'Laptop','Sony',current_timestamp );
