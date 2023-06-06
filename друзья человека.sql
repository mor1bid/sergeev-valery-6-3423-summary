USE friends_of_man;
DROP TABLE IF EXISTS `mounts`;
CREATE TABLE mounts
	SELECT * from horses
		UNION ALL
	SELECT * from donkeys
		UNION ALL
	SELECT * from camels;
DELETE FROM mounts WHERE SUBSTRING(`Животное (кличка)`, 1, 7) = 'Верблюд';

SELECT * FROM mounts;

DROP TABLE IF EXISTS `youngblood`;
CREATE TABLE youngblood
	SELECT * from cats WHERE SUBSTRING(`Дата рождения`, 7, 10) > 2020 AND SUBSTRING(`Дата рождения`, 7, 10) < year(current_date()) AND SUBSTRING(`Дата рождения`, 4, 5) < month(current_date())
		UNION ALL
	SELECT * from dogs WHERE SUBSTRING(`Дата рождения`, 7, 10) > 2020 AND SUBSTRING(`Дата рождения`, 7, 10) < year(current_date()) AND SUBSTRING(`Дата рождения`, 4, 5) < month(current_date())
		UNION ALL
	SELECT * from hamsters WHERE SUBSTRING(`Дата рождения`, 7, 10) > 2020 AND SUBSTRING(`Дата рождения`, 7, 10) < year(current_date()) AND SUBSTRING(`Дата рождения`, 4, 5) < month(current_date())
		UNION ALL
	SELECT * from donkeys WHERE SUBSTRING(`Дата рождения`, 7, 10) > 2020 AND SUBSTRING(`Дата рождения`, 7, 10) < year(current_date()) AND SUBSTRING(`Дата рождения`, 4, 5) < month(current_date())
		UNION ALL
	SELECT * from horses WHERE SUBSTRING(`Дата рождения`, 7, 10) > 2020 AND SUBSTRING(`Дата рождения`, 7, 10) < year(current_date()) AND SUBSTRING(`Дата рождения`, 4, 5) < month(current_date());
ALTER TABLE youngblood
ADD `Возраст (год)` VARCHAR(50),
ADD `Возраст (месяц)` VARCHAR(50);    
UPDATE youngblood
	SET `Возраст (год)` = YEAR(current_date()) - SUBSTRING(`Дата рождения`, 7, 10);
UPDATE youngblood
	SET `Возраст (месяц)` = FLOOR(MONTH(current_date()) - SUBSTRING(`Дата рождения`, 4, 5));
SELECT * FROM youngblood;

SELECT * FROM cats
JOIN dogs on cats.№ = dogs.№
JOIN donkeys on cats.№ = donkeys.№
JOIN hamsters on cats.№ = hamsters.№
JOIN horses on cats.№ = horses.№
JOIN mounts on cats.№ = mounts.№
JOIN youngblood on cats.№ = youngblood.№