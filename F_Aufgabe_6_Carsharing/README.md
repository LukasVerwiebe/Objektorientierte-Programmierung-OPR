# Praktische Aufgabe Nr. 6: Carsharing

In dieser Aufgabe sollen einige Funktionen einer CarSharing-Anwendung realisiert werden. CarSharing-Unternehmen unterhalten Standorte, an denen Fahrzeuge stationiert sind. Jedes Fahrzeug besitzt einen Namen und einen festen Standort.

Alle Funktionen sollen in einer Klasse Fahrzeugmanager realisiert werden, die im Paket carsharing liegt. Ein Fahrzeugmanager verwaltet die Fahrzeuge eines CarSharing-Unternehmens.

Realisieren Sie in der Klasse Fahrzeugmanager folgenden Methoden:

• Einen Konstruktor Fahrzeugmanager(), durch den ein Objekt dieser Klasse erzeugt wird. Ein gerade erzeugter Fahrzeugmanager verwaltet anfangs keine Fahrzeuge.

• Eine Instanzmethode void fuegeFahrzeugHinzu(String, String), durch die dem Fahrzeugmanager ein Fahrzeug mit einem bestimmten Namen (erster Parameter) und Standort
(zweiter Parameter) hinzugefügt wird. Falls der Fahrzeugmanager bereits ein Fahrzeug mit diesem Namen verwaltet, soll kein Fahrzeug hinzugefügt werden.

• Eine Instanzmethode ArrayList<String> gibFahrzeugnamen(), die die Namen aller Fahrzeuge alphabetisch sortiert zurückgibt.

• Eine Instanzmethode ArrayList<String> gibFahrzeugnamen(String), die alphabetisch sortiert die Namen aller Fahrzeuge des angegebenen Standorts zurückgibt.

• Eine Instanzmethode boolean bucheFahrzeug(String, String, String), mit der das Fahrzeug mit dem angegebenen Namen (erster Parameter) für einen bestimmten Zeitraum
gebucht wird. Der Beginn des Zeitraums wird durch den zweiten Parameter, das Ende durch den dritten Parameter angegeben. Die Angabe der Zeitpunkte erfolgt im Format JJJJ/MM/TT HH:MM, z. B. 2005/04/22 09:35 für den 22. April 2005, 9:35 Uhr. Die Methode liefert genau dann true zurück, wenn das angegebene Fahrzeug für den gewünschten
Zeitraum gebucht werden kann, d. h. sich der gewünschte Buchungszeitraum mit keiner anderen Buchung dieses Fahrzeugs überschneidet. Kurz gesagt: das Fahrzeug ist in der
gewünschten Zeit frei.

• Eine Instanzmethode ArrayList<String> gibVerfuegbareFahrzeuge(String, String, String), die alphabetisch sortiert die Namen aller Fahrzeuge des angegebenen Standorts (erster Parameter) zurückgibt, die in einem bestimmten Zeitraum (zweiter und dritter Parameter) verfügbar sind. Ein Fahrzeug ist in einem Zeitraum verfügbar, wenn es für diesen Zeitraum gebucht werden kann.

Sie können davon ausgehen, dass alle Methoden mit gültigen Parametern aufgerufen werden, d. h. bei Aufruf der Methoden werden nur

• gültige Namen für Fahrzeuge und Standorte übergeben,

• das Format der Zeit- und Datumsangaben ist korrekt,

• der Beginn eines Zeit- oder Datumsbereichs liegt nicht später als dessen Ende.

Realisieren Sie außerdem eine Testklasse FahrzeugmanagerTest basierend auf JUnit. Die Klasse soll ebenfalls im Paket carsharing liegen (im NetBeans-Projekt gibt es damit unter src und test ein Verzeichnis carsharing).
