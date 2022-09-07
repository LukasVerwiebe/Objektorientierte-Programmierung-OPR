# Praktische Aufgabe Nr. 7: Parser

Diese Aufgabe bezieht sich auf die frühere Aufgabe „Test Parser und Ausdrücke“. Es geht um das Parsen und Auswerten von Ausdrücken. Der Parser, dessen Aufgabe es ist, eine textuelle Darstellung eines Ausdrucks in eine Baumstruktur zu überführen, soll hierbei sowohl mit korrekt gebildeten, als auch mit fehlerhaften Ausdrücken umgehen können.

Für die Entwicklung des Parsers ist es sinnvoll, sich zunächst nur um die Erkennung der korrekten Ausdrücke zu kümmern. Die Behandlung fehlerhafter Ausdrücke ist eine Erweiterung und bedeutet nicht, schon Programmiertes wieder verwerfen zu müssen.

Realisieren Sie nun für diese Aufgabe im Paket ausdruck folgende Klassen und Methoden:

Klasse Ausdruck:
• Enthält abstrakte Instanzmethode int gibWert(Variablenbelegung), die den Wert dieses Ausdrucks basierend auf der Variablenbelegung liefert. Die Klassen Konstante, Variable und Operatorausdruck sind Unterklassen von Ausdruck.

Klasse Konstante:
• Enthält Konstruktor Konstante(int), durch den ein konstanter Ausdruck für den angegebenen Wert erzeugt wird.

Klasse Variable:
• Enthält Konstruktor Variable(String), durch den eine Variable mit dem angegebenen Namen erzeugt wird.

Klasse Operatorausdruck:
• Enthält Konstruktor Operatorausdruck(Ausdruck, char, Ausdruck), durch den ein arithmetischer Ausdruck mit den angegebenen Teilausdrücken und dem Operatorsymbol erzeugt
wird.

Klasse Variablenbelegung:

• Enthält Konstruktor Variablenbelegung(), durch den eine Variablenbelegung erzeugt wird, in der zunächst keiner Variablen ein Wert zugeordnet ist.

• Enthält Instanzmethode void belege(String, int), durch die einer Variablen (1. Parameter) ein Wert (2. Parameter) zugeordnet wird. Ein evtl. vorhandener alter Wert wird dabei überschrieben.

• Enthält Instanzmethode int gibWert(String), die den Wert liefert, der der angegebenen Variable zugeordnet ist.

Wozu benötigt man die Klasse Variablenbelegung? Stellen Sie sich vor, Sie sollen den Ausdruck a + 2 + x1 auswerten. Sie werden schnell feststellen, dass dies nicht möglich ist, ohne die Werte von a und x1 zu kennen. Ist die Belegung dieser Variablen z. B. a -> 5 und x1 -> 20, dann lässt sich der Ausdruck zu -13 auswerten. 

Genau hierum geht es bei der Klasse Variablenbelegung. Ein Objekt dieser Klasse repräsentiert die Beziehung zwischen (vielen) Variablen und ihren Werten. 
