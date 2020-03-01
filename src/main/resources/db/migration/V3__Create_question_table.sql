CREATE TABLE `question` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`title` VARCHAR(50) NULL,
	`description` TEXT NULL,
	`gmt_create` BIGINT NULL,
	`gmt_modified` BIGINT NULL,
	`creator` INT NULL,
	`comment_count` INT NULL DEFAULT '0',
	`like_count` INT NULL DEFAULT '0',
	`tag` VARCHAR(256) NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
