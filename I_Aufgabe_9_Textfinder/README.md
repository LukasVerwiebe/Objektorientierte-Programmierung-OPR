# Praktische Aufgabe Nr. 9: Textfinder

Viele byte-orientierte Datenströme enthalten Text „in Klarschrift“. Zum Beispiel können digitale Fotos die Angabe des Kameratyps und andere Aufnahmeinformationen enthalten. Zip-Dateien enthalten die Namen der gepackten Dateien und übersetzte Java-Klassen (class-Dateien) enthalten die Namen von Klassen und Variablen im Klartext. 

In dieser Aufgabe sollen Sie eine Klasse Textfinder schreiben, die „lesbare“ Zeichenfolgen aus einem byte-orientierten Datenstrom herausfiltert. Betrachten Sie dafür einen Bytewert b als dasjenige Zeichen, dessen Code b ist. Beispiel: der Bytewert 65 steht für das Zeichen a, da dieses Zeichen den Code 65 besitzt.

Eine lesbare Zeichenfolge ist eine Bytefolge, die mit einem Buchstaben (a-z und A-Z, keine Umlaute) beginnt, gefolgt von beliebig vielen Buchstaben oder Ziffern. Der Textfinder soll die längstmöglichen „lesbaren“ Zeichenfolgen finden.

Realisieren Sie im Paket bytefolge eine Klasse Textfinder mit folgenden Methoden:

• Einen Konstruktor Textfinder(InputStream, int), der einen Textfinder für die übergebene Datenquelle erzeugt. Der Textfinder soll nur Wörter finden, die mindestens die angegebene Länge besitzen.

• Eine Methode Set<String> gibWoerter(), die die Menge aller Wörter, die der Textfinder in der Datenquelle gefunden hat, zurückgibt.

• Eine Methode int gibHaeufigkeit(String), die angibt, wie häufig das übergebene Wort in dem Datenstrom gefunden wurde. Wurde das Wort nicht gefunden, soll 0 zurückgegeben werden.

Da der Eingabestrom eine unvorhersehbare Länge haben kann, dürfen Sie die Datenquelle nicht zunächst komplett einlesen, sondern müssen die Worterkennung während des Einlesens durchführen.
