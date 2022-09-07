# Praktische Aufgabe Nr. 10: Textverarbeiter

In dieser Aufgabe geht es

• allgemein um die wortweise Verarbeitung von Texten aus beliebigen zeichenorientierten Datenquellen und

• speziell um die Indexierung von Texten.

Realisieren Sie dazu im Paket textverarbeitung eine Klasse Textverarbeiter. Aufgabe eines Objekts dieser Klasse ist es, den gesamten Text einer zeichenorientierten Datenquelle einzulesen und die einzelnen Wörter einem Wortverarbeiter zur weiteren Verarbeitung zu übergeben.

Implementieren Sie in der Klasse Textverarbeiter folgende Methoden:

• Einen Konstruktor Textverarbeiter(Wortverarbeiter). Durch den Parameter wird dem Textverarbeiter der Wortverarbeiter übergeben, der die Verarbeitung der einzelnen Wörter übernimmt.

• Eine Instanzmethode void verarbeite(Reader) throws IOException zur Verarbeitung des Texts aus der übergebenen Datenquelle. Zeichen zur Worttrennung sind .,:;!?-()
sowie das Leerzeichen.

Realisieren Sie im Paket textverarbeitung außerdem eine Schnittstelle Wortverarbeiter mit folgenden Methoden:

• Eine Instanzmethode void verarbeite(String) zur Verarbeitung eines Worts.

• Eine Instanzmethode void verarbeiteZeilenende(), durch die dem Wortverarbeiter mitgeteilt wird, dass das Ende einer Textzeile erreicht wurde.

Ein Textverarbeiter kann nun zusammen mit geeigneten Wortverarbeitern beliebige Operationen auf den Wörtern eines Texts ausführen. Eine mögliche Operation ist es, einen Wortindex für einen Text zu erstellen. Der Wortindex eines Texts besteht aus den Wörtern des Texts (bestimmte Ausschlusswörter sollen ausgenommen werden) und der Information, in welchen Zeilen des Texts die einzelnen Wörter vorkommen. Der Index enthält kein Wort doppelt.

Realisieren Sie im Paket textverarbeitung eine Klasse Indexierer, die mit einem Textverarbeiter verwendet werden kann, mit folgenden Methoden:

• Einen Konstruktor Indexierer(Collection<String>), durch den ein Indexierer erzeugt wird. Der Parameter gibt die Ausschlusswörter an.

• Eine Instanzmethode List<String> gibWoerter(), die alle Wörter des Index in alphabetisch sortierter Reihenfolge liefert. Es soll die „gewöhnliche“ Ordnung auf Strings verwendet werden.

• Eine Instanzmethode String gibZeilennummern(String), die in Form einer Zeichenkette alle Zeilennummern zu einem Wort liefert. Die Zeichenkette enthält die Zeilennummern in aufsteigender Reihenfolge, jeweils durch Komma und Leerzeichen getrennt. Keine Zeilennummer erscheint doppelt.

Beispiel: Kommt ein Wort in einem Text in den Zeilen 1, 3, 4 und 24 vor und indexiert man diesen Text, dann liefert diese Methode für das Wort die Zeichenkette "1,␣3,␣4,␣24". 

Ist das übergebene Wort nicht im Index enthalten, liefert die Methode die leere Zeichenkette.

Schreiben Sie außerdem zwei Testklassen TextverarbeiterTest und IndexiererTest. Überlegen Sie sich dafür selbst sinnvolle Testmuster. Selbstverständlich ist es ratsam, mit den Testklassen zu beginnen.
