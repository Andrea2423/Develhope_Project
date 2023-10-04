CREATE TABLE `room` (
	`room_ID` INT(10) NOT NULL AUTO_INCREMENT,
	`room_number` INT(10) NOT NULL,
	`room_type` VARCHAR(100) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`room_guest` INT(10) NOT NULL,
	`room_cost` DOUBLE NOT NULL,
	`room_available` TINYINT(1) NOT NULL,
	`room_clean` TINYINT(1) NOT NULL,
	PRIMARY KEY (`room_ID`) USING BTREE,
	UNIQUE INDEX `room_number` (`room_number`) USING BTREE
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB
;
