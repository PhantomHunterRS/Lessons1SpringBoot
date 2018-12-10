CREATE SCHEMA IF NOT EXISTS SPRINGBOOT DEFAULT CHARACTER SET UTF8MB4 COLLATE UTF8MB4_GENERAL_CI;
USE SPRINGBOOT;
CREATE TABLE IF NOT EXISTS ORGANIZATIONS (
    ORGANIZATION_ID INTEGER NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT
    comment 'Id Органиации, Число, Обязатель. заполнение,Уникальный Ключ, Уникальное, i++',
    ORGANIZATION_NAME VARCHAR (255) NOT NULL
    comment 'СокрНазвание Органиации, Текст[255 символов],Обязатель. заполнение',
    ORGANIZATION_FULL_NAME VARCHAR (255) NOT NULL
	comment 'ПолноеНазвание Органиации, Текст[255 символов],Обязатель. заполнение',
    ORGANIZATION_INN VARCHAR (10) NOT NULL UNIQUE
    comment 'ИНН Органиации, Текст[10 символов],Обязатель. заполнение, Уникальное',
    ORGANIZATION_KPP VARCHAR (10) NOT NULL
    comment'КПП Органиации, Текст[10 символов],Обязатель. заполнение',
    ORGANIZATION_ADDRESS VARCHAR (255) NOT NULL
    comment'Адрес Органиации, Текст[255 символов],Обязатель. заполнение',
    ORGANIZATION_PHONE VARCHAR (20) NOT NULL
    comment'Телефон Органиации, Текст[20 символов],Обязатель. заполнение',
    ORGANIZATION_IsAlive BOOLEAN NOT NULL
    comment'Существует или нет, Органиации, Булево[(да или нет)],Обязатель. заполнение'
);
CREATE TABLE IF NOT EXISTS OFFICE (
    OFFICE_ID INTEGER NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT
    comment 'Id Офиса, Число, Обязатель. заполнение,Уникальный Ключ, Уникальное, i++',
    OFFICE_ORGANIZATION_ID INTEGER NOT NULL
    comment 'Id Офиса Органиации,Число, Обязатель. заполнение',
    OFFICE_NAME VARCHAR (255) NOT NULL
    comment 'Название Офиса,Текст(255), Обязатель. заполнение',
    OFFICE_ADDRESS VARCHAR (255) NOT NULL
    comment 'Адрес Офиса,Текст(255), Обязатель. заполнение',
    OFFICE_PHONE VARCHAR (20) NOT NULL
    comment 'Телефон Офиса,Текст(20), Обязатель. заполнение',
    OFFICE_IsAlive BOOLEAN NOT NULL
    comment'Существует или нет Офис, Булево[(да или нет)]'
);
CREATE TABLE IF NOT EXISTS EMPLOYEES (
    EMPLOYEE_ID INTEGER NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT
    comment 'Id Сотрудника, Число, Обязатель. заполнение, Уникальное, i++',
    EMPLOYEE_FIRST_NAME VARCHAR (255) NOT NULL
    comment 'ИмяСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_SECOND_NAME VARCHAR (255) NOT NULL
    comment 'ОтчествоСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_LAST_NAME VARCHAR (255) NOT NULL
    comment 'ФамилияСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_OFFIICE_ID INTEGER NOT NULL
    comment 'Id ОфисаСотрудника, Число, Обязатель. заполнение',
    EMPLOYEE_POSITION VARCHAR (255) NOT NULL
    comment 'ДолжностьСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_PHONE VARCHAR (20) NOT NULL
    comment 'ТелефонСотрудника, Текст(20), Обязатель. заполнение',
	  EMPLOYEE_DOC_CODE INTEGER NOT NULL
    comment 'ГражданствоСотрудника, Текст(50), Обязатель. заполнение',
    EMPLOYEE_DOC_NAME VARCHAR (255) NOT NULL
    comment 'УдостоверениеЛичностиСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_DOC_NUMBER VARCHAR (16) NOT NULL UNIQUE
    comment 'НомерУдостоверениеЛичностиСотрудника, Текст(16), Обязатель. заполнение,Уникальное',
    EMPLOYEE_DOC_DATA DATE NOT NULL
    comment 'ДатаВыдачиУдостЛичностиСотрудника, Дата, Обязатель. заполнение',
    EMPLOYEE_CITIZENSHIP_NAME VARCHAR (255) NOT NULL
    comment 'ГражданствоСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_CITIZENSHIP_CODE INTEGER NOT NULL
    comment 'ГражданствоСотрудника, Число, Обязатель. заполнение',
    EMPLOYEE_IS_IDENTIFIED BOOLEAN NOT NULL
    comment 'Работает/Уволен Сотрудника, Булево, Обязатель. заполнение'
);
CREATE TABLE IF NOT EXISTS DOCS (
    DOCS_NAME VARCHAR (255) NOT NULL
    comment 'УдостоверениеЛичности, Текст, Обязатель. заполнение',
    DOCS_CODE INTEGER NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT
    comment 'ГражданствоСотрудника, Число, Обязатель. заполнение'
    );

CREATE TABLE IF NOT EXISTS COUNTRIES (
    COUNTRIES_NAME VARCHAR (255) NOT NULL
    comment 'Страна, Текст, Обязатель. заполнение',
    COUNTRIES_CODE INTEGER NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT
    comment 'Классификатор Страны, Число, Обязатель. заполнение, Уникальное'
);

CREATE INDEX UX_ORGANIZATION_FULL_NAME ON ORGANIZATIONS (ORGANIZATION_FULL_NAME)
comment 'Создание Индекса Организации Полного Названия';
CREATE INDEX UX_ORGANIZATION_INN ON ORGANIZATIONS (ORGANIZATION_INN)
comment 'Создание Индекса Организации ИНН';
CREATE INDEX UX_ORGANIZATION_KPP ON ORGANIZATIONS (ORGANIZATION_KPP)
comment 'Создание Индекса Организации КПП';
CREATE INDEX UX_ORGANIZATION_PHONE ON ORGANIZATIONS (ORGANIZATION_PHONE)
comment 'Создание Индекса Организации Телефон';
CREATE INDEX IX_ORGANIZATION_NAME ON ORGANIZATIONS (ORGANIZATION_NAME)
comment 'Создание Индекса Организации СокрНазвание';
CREATE INDEX IX_ORGANIZATION_ADDRESS ON ORGANIZATIONS (ORGANIZATION_ADDRESS)
comment 'Создание Индекса Организации Адреса';
CREATE INDEX IX_ORGANIZATION_IsAlive ON ORGANIZATIONS (ORGANIZATION_IsAlive)
comment 'Создание Индекса Организации Существует/нет';

CREATE INDEX UX_EMPLOYEE_PHONE ON EMPLOYEE(EMPLOYEE_PHONE)
comment 'Создание Индекса Сотрудника Телефона';

CREATE INDEX IX_EMPLOYEE_FIRST_NAME ON EMPLOYEE(EMPLOYEE_FIRST_NAME)
comment 'Создание Индекса по Имени Сотрудника';
CREATE INDEX IX_EMPLOYEE_LAST_NAME ON EMPLOYEE(EMPLOYEE_LAST_NAME)
comment 'Создание Индекса по Фамилии Сотрудника';
CREATE INDEX IX_EMPLOYEE_POSITION ON EMPLOYEE(EMPLOYEE_POSITION)
comment 'Создание Индекса по Должности Сотрудника';
CREATE INDEX IX_EMPLOYEE_DOC_NUMBER ON EMPLOYEE(EMPLOYEE_DOC_NUMBER)
comment 'Создание Индекса по НомеруДокумента Сотрудника';
CREATE INDEX IX_EMPLOYEE_IS_IDENTIFIED ON EMPLOYEE(EMPLOYEE_IS_IDENTIFIED)
comment 'Создание Индекса по Работает/Уволен Сотрудник';

CREATE INDEX UX_OFFICE_PHONE ON OFFICE(OFFICE_PHONE);
CREATE INDEX UX_OFFICE_NAME ON OFFICE(OFFICE_NAME);

CREATE INDEX IX_OFFICE_ADDRESS ON OFFICE(OFFICE_ADDRESS);

ALTER TABLE OFFICE ADD FOREIGN KEY (OFFICE_ORGANIZATION_ID) REFERENCES ORGANIZATIONS (ORGANIZATION_ID);
ALTER TABLE EMPLOYEES ADD FOREIGN KEY (EMPLOYEE_OFFIICE_ID) REFERENCES OFFICE (OFFICE_ID);
ALTER TABLE EMPLOYEES ADD FOREIGN KEY (EMPLOYEE_CITIZENSHIP_CODE) REFERENCES COUNTRIES(COUNTRIES_CODE);
ALTER TABLE EMPLOYEES ADD FOREIGN KEY (EMPLOYEE_DOC_NUMBER) REFERENCES DOCS (DOCS_CODE);