# Anforderungen

Wir haben alle Anforderungen erfüllt

Die Methode AllByCountryIs ist SQL Injection anfällig.

- ein SELECT mit mindestens zwei WHERE = distinctCountries

- ein SELECT mit Limit (bestenfals mit spring `Paging`) = findAllByGenderIs

- ein DELETE mit einem WHERE = deleteDrugUsageEntityByID

- ein SELECT mit einem JOIN der zwei Tabellen = GetallDrugUsageEntity