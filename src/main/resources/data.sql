-- expects the csv on the classpath (src/main/resources)
INSERT INTO DrugUsage (ID,Age,Gender,Education,Country,Ethnicity,Nscore,Escore,Oscore,AScore,Cscore,Impulsive,SS,Alcohol,Amphet,Amyl,Benzos,Caff,Cannabis,Choc,Coke,Crack,Ecstasy,Heroin,Ketamine,Legalh,LSD,Meth,Mushrooms,Nicotine,Semer,VSA)
SELECT *
FROM CSVREAD('classpath:Drug_Consumption.csv');

INSERT INTO COUNTRY (name)
SELECT DISTINCT Country
FROM CSVREAD('classpath:Drug_Consumption.csv');
WHERE Country is not NULL;