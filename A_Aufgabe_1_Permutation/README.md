# Praktische Aufgabe Nr. 1: Permutation

In dieser Aufgabe geht es darum, alle möglichen Anordnungen (Permutationen) von Zahlen zu generieren. Die Zahlen 0 bis 3 lassen sich z. B. als 0; 1; 2; 3 oder 1; 3; 0; 2 anordnen. (Es gibt noch 22 weitere
Anordnungen dieser Zahlen. Allgemein gibt es für n verschiedene Zahlen n! Anordnungen.)

Realisieren Sie im Paket permutation ein Klasse Permutation mit folgenden Methoden:

• Einen Konstruktor Permutation(int), durch den für einen Parameter n ein Objekt erzeugt wird, das eine Anordnung der Zahlen 0; 1; : : : n 􀀀 1 repräsentiert. Die Zahlen sollen in dem erzeugten
Objekt aufsteigend angeordnet sein. Sie dürfen davon ausgehen, dass der Parameter größer als 0 ist.

• Eine Instanzmethode String gibAlsText(), die eine textuelle Darstellung einer Permutation erzeugt. In dieser Darstellung sollen die Zahlen entsprechend ihrer Anordnung hintereinander
stehen, getrennt durch einen Strich. Beispiel: (new Permutation(6)).gibAlsText() soll 0-1-2-3-4-5 liefern.

• Eine Instanzmethode boolean naechstePermutation(), die zu der aktuellen Anordnung der Zahlen die lexikografisch nächste Anordnung berechnet, sofern es noch eine gibt. Falls die
aktuelle Anordnung bereits die lexikografisch letzte ist, soll die Methode false liefern, sonst true.

Die Methode boolean naechstePermutation() soll zur aktuellen Anordnung die lexikografisch nächste berechnen. Wer den Begriff „lexikografische Ordnung“ nicht kennt, kann sich einfach vorstellen,
die Zahlen wären Buchstaben eines Alphabets (0 der erste Buchstabe, 1 der zweite, 2 der dritte usw.). Dann ist eine Anordnung der Zahlen wie ein Wort aus diesen Buchstaben - und die
lexikografische Reihenfolge der Wörter entspräche der Reihenfolge der Wörter in einem Lexikon.

Realisieren Sie im Paket permutation außerdem eine Klasse PermutationTest zum Test der Methoden der Klasse Permutation.
