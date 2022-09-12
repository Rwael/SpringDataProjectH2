# SpringDataProjectH2
2-3 Personen, Rahmenbedingungen:

selbst ein Datensatz wählen, in etwa: >=1000 rows, >=3Columns, 2Tables, z.B. von

- https://www.kaggle.com/datasets
- https://opendata.swiss
- https://www.coderstool.com/sql-test-data-generator

Abgabe am Mo 2022-09-26 als git-Repository

H2-Datenbank und Daten werden beim Programmstart geladen

ein Spring Data repository als reines Interface mit folgenden Methoden:

- ein SELECT mit mindestens zwei WHERE

- ein SELECT mit Limit (bestenfals mit spring `Paging`)

- ein DELETE mit einem WHERE

- ein SELECT mit einem JOIN der zwei Tabellen

eine komplizierte Abfrage welche nur mit einem `@Query` möglich ist

alle Methoden mit JUnit getestet

alle Methoden als REST-endpunkt verfügbar

eine Selbsteinschätzung im README:

was ging gut, was ist toll, was fehlt noch, erwartete Note (min 4.5)

Bonus: eine Methode, welche SQL-Injection anfällig ist