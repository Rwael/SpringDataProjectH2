INSERT INTO Countries (country)
SELECT DISTINCT Country
FROM CSVREAD('classpath:Drug_Consumption.csv')
WHERE Country is not NULL;

-- expects the csv on the classpath (src/main/resources)
INSERT INTO Drugusages (ID, age,gender,education,country,ethnicity,Nscore,Escore,Oscore,AScore,Cscore,Impulsive,SS)
SELECT *
FROM CSVREAD('classpath:Drug_Consumption.csv');