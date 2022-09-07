# Praktische Aufgabe Nr. 5: Test Parser

In einer späteren praktischen Aufgabe realisieren Sie einen Parser für arithmetische Ausdrücke in Infixdarstellung. Die Ausdrücke bestehen aus Konstanten (ganzzahlig und > 0), aus Variablen, den vier Grundrechenarten und Klammern. Ein Beispiel für einen solchen Ausdruck ist

Damit Sie die JUnit-Tests realisieren können, müssen Sie die Klassen und Methoden kennen, diespäter das gewünschte Verhalten realisieren.

Klasse Parser:
Ein Objekt dieser Klasse repräsentiert einen Parser, der zur Infixdarstellung eines Ausdrucks die zugehörige Baumdarstellung berechnet. Die Klasse enthält die

• Instanzmethode Ausdruck parse(String), die die Textdarstellung eines Ausdrucks parst und die Baumdarstellung in Form eines Objekts der Klasse Ausdruck zurückgibt. Die Infixdarstellung kann beliebig viele Leerzeichen (einschließlich 0 Leerzeichen!) zwischen den Bestandteilen des Ausdrucks enthalten.

Klasse Ausdruck:
Ausdrücke werden durch verschiedene Klassen repräsentiert, abhängig davon, ob es sich um Konstanten oder Variablen handelt, oder um Operatoren (Grundrechenarten), die zwei Ausdrücke miteinander verknüpfen. Die Klasse Ausdruck ist die abstrakte Oberklasse dieser Klassen. Sie enthält die

• abstrakte Instanzmethode int gibWert(Variablenbelegung), die den Wert dieses Ausdrucks basierend auf der übergebenen Variablenbelegung liefert.

Klasse Variablenbelegung:
Ein Objekt dieser Klasse repräsentiert die Belegung von (vielen) Variablen. Die Klasse enthält

• Konstruktor Variablenbelegung(), durch den eine Variablenbelegung erzeugt wird, in der zunächst keiner Variablen ein Wert zugeordnet ist.

• Instanzmethode void belege(String, int), durch die einer Variablen (1. Parameter) ein Wert (2. Parameter) zugeordnet wird. Ein evtl. vorhandener alter Wert wird dabei überschrieben.

• Enthält Instanzmethode int gibWert(String), die den Wert liefert, der der angegebenen Variable zugeordnet ist.

Klasse Konstante:
Ein Objekt dieser Klasse repräsentiert eine Konstante. Die Klasse ist direkte Unterklasse von Ausdruck und enthält den

• Konstruktor Konstante(int), durch den ein konstanter Ausdruck für den angegebenen Werterzeugt wird.

Klasse Variable:
Ein Objekt dieser Klasse repräsentiert eine Variable. Die Klasse ist direkte Unterklasse von Ausdruck und enthält den

• Konstruktor Variable(String), durch den eine Variable mit dem angegebenen Namen erzeugt wird.

Klasse Operatorausdruck:
Ein Objekt dieser Klasse repräsentiert einen Ausdruck, der zwei Ausdrücke mit einem Operator verknüpft. Die Klasse ist direkte Unterklasse von Ausdruck und enthält den

• Konstruktor Operatorausdruck(Ausdruck, char, Ausdruck), durch den ein arithmetischer Ausdruck mit den angegebenen Teilausdrücken und dem Operatorsymbol erzeugt wird.

Realisieren Sie nun in dieser Aufgabe basierend auf JUnit Testklassen ParserTest, KonstanteTest, VariableTest und OperatorausdruckTest zum Test der Methoden der Anwendungsklassen Parser, etc. Die Testklassen sollen im Paket ausdruck angelegt werden.
