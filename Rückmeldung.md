# Anforderungen

Wir haben alle Anforderungen erfüllt

Die Methode AllByCountryIs ist SQL Injection anfällig.

- ein SELECT mit mindestens zwei WHERE = distinctCountries

- ein SELECT mit Limit (bestenfals mit spring `Paging`) = findAllByGenderIs

- ein DELETE mit einem WHERE = deleteDrugUsageEntityByID

- ein SELECT mit einem JOIN der zwei Tabellen = GetallDrugUsageEntity

was ging gut
--
Das Repsitory mit den Controller zu Verknüpfen ging sehr einfach und hat fast keine probleme ausgelöst ausser Probleme in Repository Aufgedeckt

was fehlt noch
--
Um es villeicht besser zu machen könnte man eine Dokumentation für die Api machen