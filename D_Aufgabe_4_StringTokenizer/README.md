# Praktische Aufgabe Nr. 4: StringTokenizer

Der Zweck dieser Aufgabe ist es, das Schreiben von JUnit-Tests zu üben.

Realisieren Sie im Paket string eine Klasse StringTest basierend auf JUnit zum Test der Methode String substring(int, int) der Klasse String. Überlegen Sie sich selbst mindestens vier sinnvolle Testfälle. Lesen Sie bitte auch die JavaDoc-Dokumentation zur Methode substring. Sie werden sehen, dass die Methode in einem speziellen Fall, abhängig von den beiden nummerischen Parametern, dasselbe Objekt liefert, auf das die Methode angewendet wird. Einer der Testfälle, die Sie schreiben, soll dies prüfen (Stichwort assertSame).

Realisieren Sie im Paket string ebenfalls eine Klasse TokensTest zum Test der statischen Methode String[] tokens(String, String) der Klasse Tokens. Überlegen Sie sich selbst geeignete Testfälle. Die Klasse Tokens müssen Sie ebenfalls im Paket string realisieren. Die Methode tokens(s, t) soll alle Tokens in einem Feld liefern, die ein durch new StringTokenizer(s, t) erzeugter StringTokenizer liefern würde.

Realisieren Sie im gleichen Paket schließlich eine Klasse StringTokenizerTest zum Test der Methoden String nextToken() und boolean hasMoreTokens() der Klasse StringTokenizer. Erzeugen Sie zum Test einen StringTokenizer für die Zeichenkette "--abc␣+-xyz" und die Trenner "+-". In dieser Testklasse ist eine setUp-Methode sinnvoll.
