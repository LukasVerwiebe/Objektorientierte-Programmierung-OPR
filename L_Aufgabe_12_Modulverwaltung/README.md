# Praktische Aufgabe Nr. 12: Modulverwaltung

In dieser Aufgabe üben Sie die Definition und Anwendung von Aufzählungstypen.

Stellen Sie sich als Anwendungskontext das Thema Prüfungsplanung vor. Aus einer Datenquelle werden Informationen über Module eingelesen. Jedes Modul ist einem oder mehreren Studiengängen zugeordnet. Die Gesamtheit aller Module wird in einer Modulverwaltung verwaltet, die Ausgangspunkt der Prüfungsplanung sein könnte. 

Realisieren Sie dazu im Paket modul eine Klasse Modul zur Repräsentation eines Moduls, eine Klasse Modulverwaltung zur Repräsentation der Moduldaten eines Fachbereichs, eine Klasse Moduldatenleser sowie einen Aufzählungstyp Studiengang, dessen Werte alle Studiengänge des Fachbereichs repräsentieren. 

Implementieren Sie in der Klasse Modul folgende Methoden:

• Einen Konstruktor Modul(String, String). Der erste Parameter ist das Kürzel des Moduls, der zweite die Bezeichnung.

• Eine Instanzmethode void fuegeHinzu(Studiengang) throws IllegalArgumentException. Durch Anwendung der Methode wird einem Modul mitgeteilt, dass es in dem entsprechenden Studiengang angeboten wird. Ein Modul kann in mehreren Studiengängen angeboten werden. Es soll eine Ausnahme mit der Meldung "Ein Modul kann nicht gleichzeitig zu Bachelor- und Masterstudiengang gehören." geworfen werden, wenn einem Modul sowohl ein Bachelor-, als auch ein Masterstudiengang übergeben wird.

Implementieren Sie in der Klasse Modulverwaltung folgende Methoden:

• Einen Konstruktor Modulverwaltung(), um eine Modulverwaltung zu erzeugen, in der sich anfangs kein Modul befindet.

• Eine Instanzmethode void fuegeHinzu(Modul) throws IllegalArgumentException, durch die der Modulverwaltung ein Modul hinzugefügt wird. Es soll eine Ausnahme mit der
Meldung "Das Modul ist bereits vorhanden." geworfen werden, wenn bereits ein Modul mit dem gleichen Kürzel vorhanden ist.

• Eine Instanzmethode Set<Modul> gibModule(boolean fuerBachelor), die entweder alle Bachelormodule (für Parameter true) oder alle Mastermodule liefert. Das Ergebnis der Methode soll derart sein, dass die Module bei Iteration sortiert (nach Modulkürzel) durchlaufen würden.

Implementieren Sie in der Klasse Moduldatenleser folgende Methode:

• Eine Instanzmethode void lies(Reader, Modulverwaltung), um aus den Daten der Datenquelle Informationen über Module zu lesen, daraus Modul-Objekte zu erzeugen und diese der Modulverwaltung zu übergeben.

• Die Datenquelle enthält in einzelnen Zeilen die Daten der Module. Jede Zeile hat folgenden Aufbau (Beispiel): OPR;Objektorientierte Programmierung;IN_BA,MI_BA,WI_BA Sie dürfen davon ausgehen, dass die Datenquelle keine Formatfehler enthält.

Implementieren Sie einen Aufzählungstyp Studiengang mit folgenden Eigenschaften:

• Der Typ enthält Werte mit den Namen IN_BA, MI_BA, WI_BA, IN_MA, MI_MA, WI_MA und IS_MA.

• Eine Instanzmethode boolean istBachelorstudiengang(), durch die ein Studiengang angibt, ob er ein Bachelorstudiengang ist.
