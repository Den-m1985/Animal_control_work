#CREATE DATABASE man_friends;
USE man_friends;


-- 8. Создать таблицы с иерархией из диаграммы в БД
-- 9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
DROP TABLE IF EXISTS Cats;
CREATE TABLE Cats 
(       
	id INT AUTO_INCREMENT PRIMARY KEY,
	cat_name VARCHAR(10) NOT NULL,
	dateOfBirth DATE NOT NULL
);
INSERT INTO Cats (cat_name, dateOfBirth)
VALUES
('Barsik', '2020-02-4'),
('Marsik', '2020-03-4'),
('Parsik', '2020-04-4');
#SELECT * FROM Cats;

DROP TABLE IF EXISTS Dogs;
CREATE TABLE Dogs 
(       
	id INT AUTO_INCREMENT PRIMARY KEY,
	dog_name VARCHAR(10) NOT NULL,
	dateOfBirth DATE NOT NULL
);
INSERT INTO Dogs (dog_name, dateOfBirth)
VALUES
('Sharik', '2020-02-4'),
('Marik', '2022-03-4'),
('Parik', '2020-04-4');
#SELECT * FROM Dogs;

DROP TABLE IF EXISTS Horses;
CREATE TABLE Horses 
(       
	id INT AUTO_INCREMENT PRIMARY KEY,
	horse_name VARCHAR(10) NOT NULL,
	dateOfBirth DATE NOT NULL
);
INSERT INTO Horses (horse_name, dateOfBirth)
VALUES
('Horse_1', '2020-02-4'),
('Horse_2', '2023-03-4'),
('Horse_3', '2020-04-4');
#SELECT * FROM Horses;

DROP TABLE IF EXISTS Camel;
CREATE TABLE Camel 
(       
	id INT AUTO_INCREMENT PRIMARY KEY,
	camel_name VARCHAR(10) NOT NULL,
	dateOfBirth DATE NOT NULL
);
INSERT INTO Camel (camel_name, dateOfBirth)
VALUES
('Pushok', '2020-02-4'),
('Mushok', '2022-03-4'),
('Nushok', '2021-04-4');
#SELECT * FROM Camel;

DROP TABLE IF EXISTS Donkeys;
CREATE TABLE Donkeys 
(       
	id INT AUTO_INCREMENT PRIMARY KEY,
	donkey_name VARCHAR(10) NOT NULL,
	dateOfBirth DATE NOT NULL
);
INSERT INTO Donkeys (donkey_name, dateOfBirth)
VALUES
('Pushok', '2020-02-4'),
('Mushok', '2022-03-4'),
('Nushok', '2021-04-4');
#SELECT * FROM Donkeys;


-- 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
-- питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
DROP TABLE Camel;

SELECT * FROM Horses
UNION ALL
SELECT * FROM Donkeys;


-- 11.Создать новую таблицу “молодые животные” в которую попадут все
-- животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
-- до месяца подсчитать возраст животных в новой таблице
DROP TABLE IF EXISTS YoungAnimals;
CREATE TABLE YoungAnimals 
(       
  id INT AUTO_INCREMENT PRIMARY KEY,
  animal_name VARCHAR(10) NOT NULL,
  dateOfBirth DATE NOT NULL,
  ageInMonths INT
);

INSERT INTO YoungAnimals (animal_name, dateOfBirth, ageInMonths)
SELECT cat_name, dateOfBirth, TIMESTAMPDIFF(MONTH, dateOfBirth, CURDATE()) FROM Cats
WHERE dateOfBirth > DATE_SUB(CURDATE(), INTERVAL 3 YEAR) 
  AND dateOfBirth < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);

INSERT INTO YoungAnimals (animal_name, dateOfBirth, ageInMonths)
SELECT dog_name, dateOfBirth, TIMESTAMPDIFF(MONTH, dateOfBirth, CURDATE()) FROM Dogs
WHERE dateOfBirth > DATE_SUB(CURDATE(), INTERVAL 3 YEAR) 
  AND dateOfBirth < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);

INSERT INTO YoungAnimals (animal_name, dateOfBirth, ageInMonths)
SELECT horse_name, dateOfBirth, TIMESTAMPDIFF(MONTH, dateOfBirth, CURDATE()) FROM Horses
WHERE dateOfBirth > DATE_SUB(CURDATE(), INTERVAL 3 YEAR) 
  AND dateOfBirth < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);
  
  INSERT INTO YoungAnimals (animal_name, dateOfBirth, ageInMonths)
SELECT donkey_name, dateOfBirth, TIMESTAMPDIFF(MONTH, dateOfBirth, CURDATE()) FROM Donkeys
WHERE dateOfBirth > DATE_SUB(CURDATE(), INTERVAL 3 YEAR) 
  AND dateOfBirth < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);
  
  SELECT * FROM YoungAnimals;
  /*
1. Создаем таблицу "молодые животные"
2. Далее, мы используем оператор INSERT INTO с подзапросами данных из таблиц Cats, Dogs и т.д.
3. В каждом подзапросе мы выбираем имя животного (cat_name, dog_name или horse_name), 
	дату рождения (dateOfBirth) и с помощью функции TIMESTAMPDIFF вычисляем возраст 
    в месяцах от даты рождения до текущей даты.
4. Затем мы добавляем условие WHERE для проверки, что дата рождения попадает в диапазон 
	от 1 года до 3 лет назад от текущей даты.
5. Результаты выборки добавляются в таблицу YoungAnimals с помощью оператора INSERT INTO.
*/



-- 12 Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
-- прошлую принадлежность к старым таблицам.
SELECT cat_name, dateOfBirth, 'cats' AS animal_type FROM Cats
UNION ALL
SELECT dog_name, dateOfBirth, 'dogs' AS animal_type FROM Dogs
UNION ALL
SELECT horse_name, dateOfBirth, 'horses' AS animal_type FROM Horses
UNION ALL
SELECT donkey_name, dateOfBirth, 'Donkeys' AS animal_type FROM Donkeys;
