# Praktische Aufgabe Nr. 13: Unendliche Folge

Realisieren Sie im Paket folge eine Klasse UnendlicheFolge, mit der unendliche Folgen f ganzer Zahlen repräsentiert werden können, die nach folgenden Regeln aufgebaut sind:

• f0 und f1 werden explizit festgelegt.

• Für alle n > 0 wird fn+2 durch eine Rechenvorschrift aus fn und fn+1 berechnet.

Die Fibonacci-Folge ist eine Folge, die nach diesen Regeln aufgebaut ist. 

Realisieren Sie in der Klasse UnendlicheFolge

• einen Konstruktor UnendlicheFolge(int, int, IntBinaryOperator), durch den eine Folge für zwei Startwerte und eine Rechenvorschrift erzeugt wird (IntBinaryOperator
ist eine Schnittstelle aus dem Paket java.util.function),

• eine Methode int gibWert(), die den nächsten Wert der Folge liefert. Realisieren Sie im gleichen Paket außerdem eine Testklasse UnendlicheFolgeTest. Verwenden
Sie als Testfolge die Fibonacci-Folge und testen Sie, dass die ersten 6 Folgenwerte (0; 1; 1; 2; 3; 5; ...) korrekt geliefert werden.

