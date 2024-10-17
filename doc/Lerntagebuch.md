# Lerntagebuch

## Vorgang
Als erstes haben wir den Text durchgelesen und uns Gedanken gemacht,
welche Klassen wir erstellen müssen und was die Mutterklasse ist. 
Und auch welche Klassen von der Mutterklasse erben.

### Klasse Rabattstrategie

Die Klasse Rabattstrategie ist eine abstrakte Klasse. Sie ist die Mutterklasse.
In ihr ist der Parameter String bezeichnung definiert, die an die Unterklassen vererbt wird.
Es ist auch eine abstrakte Methode, die ebenfalls an die Unterklassen vererbt wird.


### Discount Klassen 

Die Discount Klassen erben von Rabattstrategien und returnen den Preis mulitpliziert mit den jeweiligen Prozentsätzen.
Der Konstruktor von der Mutterklasse wird aufgerufen und es wird die Bezeichnung mitgegeben.
getReduzierterPreis wird überschrieben 

### Angebot

In der Angebot Klasse werden mehrere Parameter definiert, im Konstruktor wird ihnen ein Wert zugewiesen und getRabattstrategie() wird aufgerufen

In der getRabattstrategie Methode wird mit MonthValue der Monat in eine Int umgewandelt. Dann werden in der if mit || mehrere Werte geprüft ob der MOnat einen Rabatt bekommt. 

in der getReduziertenPreis Methode wird von der Rabattstrategie Klasse aus die getReduziertePreis aufgerufen und gibt den Wert zurück.

Es sind auch einige Getter und Setter drin.

In der anzeigen() MEthode wird alles auf die Kommandozeile ausgegeben.

In der Main Klasse werden drei verschiedene Angebote erstellt und die anzeigen Methode wird für alle Angebote aufgerufen.





