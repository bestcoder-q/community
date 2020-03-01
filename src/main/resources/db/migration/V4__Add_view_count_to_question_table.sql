ALTER TABLE `question`
	ADD COLUMN `view_count` INT(11) NULL DEFAULT '0' AFTER `comment_count`;