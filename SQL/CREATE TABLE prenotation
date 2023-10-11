CREATE TABLE `prenotation` (
	`id_prenotation` INT(11) NOT NULL AUTO_INCREMENT,
	`costumers_names` VARCHAR(255) NOT NULL COLLATE 'latin1_swedish_ci',
	`number_of_people_booked` INT(11) NOT NULL,
	`booking_date_and_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`duration_of_the_booking` INT(11) NOT NULL,
	`price` DOUBLE NOT NULL,
	`extra_customer_requests` VARCHAR(255) NOT NULL COLLATE 'latin1_swedish_ci',
	`cancel_the_reservation` BIT(1) NOT NULL,
	`reservation_confirmed` BIT(1) NOT NULL,
	PRIMARY KEY (`id_prenotation`) USING BTREE
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=4
;
