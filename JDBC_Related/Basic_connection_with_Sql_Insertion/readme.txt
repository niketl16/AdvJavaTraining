create database jdbc_example;




CREATE TABLE `employee` (               
	`id` int(11) NOT NULL DEFAULT '0',    
	`name` varchar(30) DEFAULT NULL,      
	`salary` int(11) DEFAULT NULL,        
	PRIMARY KEY (`id`)                    
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ;