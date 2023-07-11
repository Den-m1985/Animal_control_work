***  итоговая работа  ****

1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).
2. Создать директорию, переместить файл туда.

1.
cat > "Домашние животные"
собака
кошка
хомяк
Ctrl + D

cat > "Вьючные животными"
лошадь
верблюд
осел
Ctrl + D

cat "Домашние животные" "Вьючные животными" > "Друзья человека"
cat "Друзья человека"
mv "Друзья человека" "Новый файл"
2.
mkdir "Новая директория"
mv "Новый файл" "Новая директория”

3.
sudo apt update
apt install mysql-server mysql-client
mysqladmin password -u root -p
mysql -u root -p
CREATE USER 'denis_sql'@'localhost' IDENTIFIED BY 'пароль';
SELECT User,Host FROM mysql.user;


4.
sudo dpkg -i deb [arch=amd64 signed-by=/usr/share/keyrings/oracle-virtualbox-2016.gpg] https://download.virtualbox.org/virtualbox/debian jammy contrib
sudo dpkg -r virtualbox-7.0
