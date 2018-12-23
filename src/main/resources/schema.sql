CREATE SCHEMA IF NOT EXISTS SPRINGBOOT DEFAULT CHARACTER SET UTF8MB4 COLLATE UTF8MB4_GENERAL_CI;
USE SPRINGBOOT;
CREATE TABLE IF NOT EXISTS ORGANIZATIONS (
    ORGANIZATION_ID INTEGER UNIQUE PRIMARY KEY AUTO_INCREMENT
    COMMENT 'Id Органиации, Число, Обязатель. заполнение,Уникальный Ключ, Уникальное, i++',
    ORGANIZATION_NAME VARCHAR (255) NOT NULL
    COMMENT 'СокрНазвание Органиации, Текст[255 символов],Обязатель. заполнение',
    ORGANIZATION_FULL_NAME VARCHAR (255) NOT NULL
	  COMMENT 'ПолноеНазвание Органиации, Текст[255 символов],Обязатель. заполнение',
    ORGANIZATION_INN INTEGER (10) NOT NULL UNIQUE
    COMMENT 'ИНН Органиации, Число[10 символов],Обязатель. заполнение, Уникальное',
    ORGANIZATION_KPP INTEGER (10) NOT NULL
    COMMENT 'КПП Органиации, Число [10 символов],Обязатель. заполнение',
    ORGANIZATION_ADDRESS VARCHAR (255) NOT NULL
    COMMENT 'Адрес Органиации, Текст[255 символов],Обязатель. заполнение',
    ORGANIZATION_PHONE VARCHAR (20)
    COMMENT 'Телефон Органиации, Текст[20 символов]',
    ORGANIZATION_IsAlive BOOLEAN NOT NULL
    COMMENT 'Существует или нет, Органиации, Булево[(да или нет)],Обязатель. заполнение'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci
COMMENT ='Таблица Организации'
;
CREATE TABLE IF NOT EXISTS OFFICES (
    OFFICE_ID INTEGER UNIQUE PRIMARY KEY AUTO_INCREMENT
    COMMENT 'Id Офиса, Число, Обязатель. заполнение,Уникальный Ключ, Уникальное, i++',
    OFFICE_NAME VARCHAR (255) NOT NULL
    COMMENT 'Название Офиса,Текст(255), Обязатель. заполнение',
    OFFICE_ADDRESS VARCHAR (255) NOT NULL
    COMMENT 'Адрес Офиса,Текст(255), Обязатель. заполнение',
    OFFICE_PHONE VARCHAR (20)
    COMMENT 'Телефон Офиса,Текст(20)',
    OFFICE_IsAlive BOOLEAN NOT NULL
    COMMENT'Существует или нет Офис, Булево[(да или нет)]'
)
COMMENT ='Таблица Офиса'
;
CREATE TABLE IF NOT EXISTS EMPLOYEES (
    EMPLOYEE_ID INTEGER UNIQUE PRIMARY KEY AUTO_INCREMENT
    COMMENT 'Id Сотрудника, Число, Обязатель. заполнение, Уникальное, i++',
    EMPLOYEE_FIRST_NAME VARCHAR (255) NOT NULL
    COMMENT 'ИмяСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_SECOND_NAME VARCHAR (255)
    COMMENT 'ОтчествоСотрудника, Текст(255)',
    EMPLOYEE_LAST_NAME VARCHAR (255) NOT NULL
    COMMENT 'ФамилияСотрудника, Текст(255)',
    EMPLOYEE_OFFIICE_ID INTEGER NOT NULL
    COMMENT 'Id ОфисаСотрудника, Число, Обязатель. заполнение',
    EMPLOYEE_ORGANIZATION_ID INTEGER NOT NULL
    COMMENT 'Id Организации, Число, Обязатель. заполнение',
    EMPLOYEE_POSITION VARCHAR (255) NOT NULL
    COMMENT 'ДолжностьСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_PHONE VARCHAR (20)
    COMMENT 'ТелефонСотрудника, Текст(20), Обязатель. заполнение',
	  EMPLOYEE_DOC_CODE INTEGER
    COMMENT 'ГражданствоСотрудника, Текст(50), Обязатель. заполнение',
    EMPLOYEE_DOC_NAME VARCHAR (255)
    COMMENT 'УдостоверениеЛичностиСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_DOC_NUMBER VARCHAR (16) NOT NULL UNIQUE
    COMMENT 'НомерУдостоверениеЛичностиСотрудника, Текст(16), Обязатель. заполнение,Уникальное',
    EMPLOYEE_DOC_DATA DATE NOT NULL
    COMMENT 'ДатаВыдачиУдостЛичностиСотрудника, Дата, Обязатель. заполнение',
    EMPLOYEE_CITIZENSHIP_NAME VARCHAR (255)
    COMMENT 'ГражданствоСотрудника, Текст(255), Обязатель. заполнение',
    EMPLOYEE_CITIZENSHIP_CODE INTEGER
    COMMENT 'КодГражданствоСотрудника, Число, Обязатель. заполнение',
    EMPLOYEE_IS_IDENTIFIED BOOLEAN NOT NULL
    COMMENT 'Работает/Уволен Сотрудника, Булево, Обязатель. заполнение'
)
COMMENT ='Таблица Сотрудника'
;
CREATE TABLE IF NOT EXISTS DOCS (
    DOCS_ID INTEGER UNIQUE
    COMMENT 'ID документа, Число, Уникальное значение',
    DOCS_NAME VARCHAR (255) NOT NULL
    COMMENT 'УдостоверениеЛичности, Текст, Обязатель. заполнение',
    DOCS_CODE INTEGER NOT NULL
    COMMENT 'ГражданствоСотрудника, Число, Обязатель. заполнение'
    )
COMMENT ='Таблица Документа'
;

CREATE TABLE IF NOT EXISTS COUNTRIES (
    COUNTRIES_ID INTEGER UNIQUE
    COMMENT 'ID страны, Число, Уникальное значение',
    COUNTRIES_NAME VARCHAR (255) NOT NULL
    COMMENT 'Страна, Текст, Обязатель. заполнение',
    COUNTRIES_CODE INTEGER NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT
    COMMENT 'Классификатор Страны, Число, Обязатель. заполнение, Уникальное'
)
COMMENT ='Таблица Страны'
;

CREATE TABLE IF NOT EXISTS ADDRESS (
    ADDRESS_ID INTEGER UNIQUE
    COMMENT 'ID Адреса, Число, Уникальное значение',
    ADDRESS_ZIPCODE INTEGER NOT NULL UNIQUE
    COMMENT 'Почтовое отделение, Число, Уникальное значение',
    ADDRESS_CITY VARCHAR (255)
    COMMENT 'Город, Текст',
    ADDRESS_STREET VARCHAR (255)
    COMMENT 'Улица, Текст',
    ADDRESS_HOUSE VARCHAR (6)
    COMMENT 'Номер Дома, Текст',
    ADDRESS_HOUSING VARCHAR (4)
    COMMENT 'Номер Корпуса, Текст',
    ADDRESS_APARTAMENT VARCHAR (4)
    COMMENT 'Номер Квартиры или офиса, Текст',
)
COMMENT ='Таблица Адреса'
;
   /*I. Связь таблиц Офис и Адресса - ManyToMany*/
CREATE TABLE IF NOT EXISTS CONNECTION_OFFICES_ADDRESS (
    CONNECTION_OFFICES_ID;
    CONNECTION_ADDRESS_ID;
    PRIMARY KEY (CONNECTION_OFFICES_ID, CONNECTION_ADDRESS_ID)
);
CREATE INDEX UX_OFFICE_ADDRESS_ID ON CONNECTION_OFFICES_ADDRESS (CONNECTION_ADDRESS_ID);
ALTER TABLE CONNECTION_OFFICES_ADDRESS ADD FOREIGN KEY (CONNECTION_OFFICES_ID) REFERENCES ADDRESS(ADDRESS_ID);
CREATE INDEX IX_OFFICE_ADDRESS_ID ON CONNECTION_OFFICES_ADDRESS (CONNECTION_OFFICES_ID);
ALTER TABLE CONNECTION_OFFICES_ADDRESS ADD FOREIGN KEY (CONNECTION_ADDRESS_ID) REFERENCES OFFICES(OFFICE_ID);
    /****************************************************************************/
   /* II. Связь таблиц Организации и Адресса - ManyToMany*/
  CREATE TABLE IF NOT EXISTS CONNECTION_ORGANIZATIONS_ADDRESS (
    CONNECTION_ORGANIZATION_ID;
    CONNECTION_ADDRESS_ID;
    PRIMARY KEY (CONNECTION_ORGANIZATION_ID, CONNECTION_ADDRESS_ID)
);
CREATE INDEX UX_ORGANIZATION_ADDRESS_ID ON CONNECTION_ORGANIZATION_ADDRESS (CONNECTION_ADDRESS_ID);
ALTER TABLE CONNECTION_ORGANIZATION_ADDRESS ADD FOREIGN KEY (CONNECTION_ORGANIZATION_ID) REFERENCES ADDRESS(ADDRESS_ID);
CREATE INDEX IX_ORGANIZATION_ADDRESS_ID ON CONNECTION_ORGANIZATION_ADDRESS (CONNECTION_ORGANIZATION_ID);
ALTER TABLE CONNECTION_ORGANIZATION_ADDRESS ADD FOREIGN KEY (CONNECTION_ADDRESS_ID) REFERENCES ORGANIZATIONS(ORGANIZATION_ID);
    /****************************************************************************/
 /* III. Связь таблиц Сотрудника и Документов - ManyToMany*/
  CREATE TABLE IF NOT EXISTS CONNECTION_EMPLOYEES_DOCS (
    CONNECTION_EMPLOYEES_ID;
    CONNECTION_DOCS_ID;
    PRIMARY KEY (CONNECTION_EMPLOYEES_ID, CONNECTION_DOCS_ID)
);
CREATE INDEX UX_EMPLOYEES_DOCS_ID ON CONNECTION_EMPLOYEES_DOCS (CONNECTION_DOCS_ID);
ALTER TABLE CONNECTION_EMPLOYEES_DOCS ADD FOREIGN KEY (CONNECTION_EMPLOYEES_ID) REFERENCES DOCS (DOCS_ID);
CREATE INDEX IX_EMPLOYEES_DOCS_ID ON CONNECTION_EMPLOYEES_DOCS (CONNECTION_DOCS_ID);
ALTER TABLE CONNECTION_EMPLOYEES_DOCS ADD FOREIGN KEY (CONNECTION_DOCS_ID) REFERENCES EMPLOYEES (EMPLOYEE_ID);
    /****************************************************************************/
 /* IV. Связь таблиц Сотрудника и Страна - ManyToOne*/
  CREATE TABLE IF NOT EXISTS CONNECTION_EMPLOYEES_DOCS (
    CONNECTION_EMPLOYEES_ID;
    CONNECTION_COUNTRIES_ID;
    PRIMARY KEY (CONNECTION_COUNTRIES_ID)
);
CREATE INDEX X_EMPLOYEES_COUNTRIES_ID ON CONNECTION_EMPLOYEES_DOCS (CONNECTION_COUNTRIES_ID);
ALTER TABLE CONNECTION_EMPLOYEES_DOCS ADD FOREIGN KEY (EMPLOYEE_CITIZENSHIP_CODE) REFERENCES COUNTRIES (COUNTRIES_ID);
 /****************************************************************************/
  /* V. Связь таблиц Сотрудника и Офис - ManyToOne*/
  CREATE TABLE IF NOT EXISTS CONNECTION_EMPLOYEES_OFFICE (
    CONNECTION_EMPLOYEES_ID;
    CONNECTION_OFFICE_ID;
    PRIMARY KEY (CONNECTION_OFFICE_ID)
);
CREATE INDEX X_EMPLOYEES_OFFICE_ID ON CONNECTION_EMPLOYEES_OFFICE (CONNECTION_OFFICE_ID);
ALTER TABLE CONNECTION_EMPLOYEES_OFFICE ADD FOREIGN KEY (EMPLOYEE_OFFIICE_ID) REFERENCES OFFICES (OFFICE_ID);
 /****************************************************************************/
  /* VI. Связь таблиц Сотрудника и Организации - ManyToOne*/
  CREATE TABLE IF NOT EXISTS CONNECTION_EMPLOYEES_ORGANIZATION(
    CONNECTION_EMPLOYEES_ID;
    CONNECTION_ORGANIZATION_ID;
    PRIMARY KEY (CONNECTION_ORGANIZATION_ID)
);
CREATE INDEX X_EMPLOYEES_ORGANIZATION_ID ON CONNECTION_EMPLOYEES_ORGANIZATION (CONNECTION_ORGANIZATION_ID);
ALTER TABLE CONNECTION_EMPLOYEES_ORGANIZATION ADD FOREIGN KEY (EMPLOYEE_ORGANIZATION_ID) REFERENCES ORGANIZATIONS (ORGANIZATION_ID);
 /****************************************************************************/