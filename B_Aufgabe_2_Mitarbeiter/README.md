# Praktische Aufgabe Nr. 2: Mitarbeiter

In dieser Aufgabe geht es um Mitarbeiter und Vorgesetzte in einem Unternehmen. Mitarbeiter sind alle Personen, die in dem Unternehmen beschäftigt sind. Vorgesetzte sind spezielle Mitarbeiter, die anderen Mitarbeitern vorgesetzt sein können. Jeder Mitarbeiter hat höchstens einen Vorgesetzten.

Alle Personen besitzen einen Namen und ein Bestelllimit, innerhalb dessen sie Bestellungen durchführen können. Das Limit gilt pro Bestellung. Vorgesetzte können ein individuelles Bestelllimit besitzen, alle anderen Mitarbeiter haben ein einheitliches Limit. Dieses Limit beträgt – sofern kein anderer Wert festgelegt wurde – EUR 20,-. Vorgesetzte, die kein explizites Limit haben, besitzen das Limit wie „normale“ Mitarbeiter.

Realisieren Sie im Paket personal zwei Klassen Mitarbeiter und Vorgesetzter, deren Objekte die Personen des Unternehmens repräsentieren. Ein Vorgesetzter ist auch ein Mitarbeiter. Deshalb sollen beide Klassen hierarchisch zueinander angeordnet werden.

Realisieren Sie folgende Methoden (in welchen Klassen, müssen Sie z. T. selbst entscheiden):

• Einen Konstruktor Mitarbeiter(String), durch den ein „gewöhnlicher“ Mitarbeiter mit einem bestimmten Namen erzeugt wird.

• Einen entsprechenden Konstruktor Vorgesetzter(String).

• Eine statische Methode void setzeAllgemeinesLimit(int), durch die das Bestelllimit aller Mitarbeiter sowie der Vorgesetzten ohne explizites Limit festgesetzt wird.

• Eine Instanzmethode void setzeVorgesetzten(Vorgesetzter), durch die einer Person ein Vorgesetzter zugeordnet wird. Durch Aufruf dieser Methode mit Parameter null entzieht man einer Person den Vorgesetzten.

• Eine Instanzmethode void setzeBestelllimit(int), durch die einem Vorgesetzten ein Limit zugeordnet wird.

• Eine Instanzmethode boolean darfBestellen(int), durch die jeder Mitarbeiter (damit natürlich auch jeder Vorgesetzter) angibt, ob er eine Beschaffung in der angegebenen Höhe durchführen darf.

• Eine Instanzmethode String gibInfo(), durch die jeder Mitarbeiter einen Info-Text über sich zurückgibt. Abhängig von der Person und der Tatsache, ob sie einen Vorgesetzten hat oder nicht, soll einer der folgenden (einzeiligen) Sätze zurückgegeben werden (die Namen und Beträge sind natürlich nur Beispiele).

• Eine Instanzmethode String gibHierarchie(), durch die jeder Mitarbeiter seine vollständige Personalhierarchie liefert. Das Ergebnis der Methode soll mehrzeilig aufgebaut sein, jeweils eine Zeile pro Stufe der Personalhierarchie (’nn’ ist Zeichen für Zeilenumbruch). Der Mitarbeiter selbst steht am Ende der Zeichenkette, sein oberster Vorgesetzter am Anfang (s. auch Testablauf). Das Ergebnis soll nicht mit einem Zeilenumbruch enden.
