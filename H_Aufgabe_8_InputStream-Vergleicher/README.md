# Praktische Aufgabe Nr. 8: Inputstream-Vergleicher

Realisieren Sie im Paket streamverarbeitung eine Klasse InputStreamVergleicher mit einer Methode boolean sindGleich(InputStream, InputStream, long). Die Methode

soll genau dann true liefern, wenn eine der folgenden Bedingungen erfüllt ist:

• Beide Eingabeströme sind mindestens n Bytes lang (3. Parameter) und stimmen in den Folgen ihrer jeweils ersten n Bytes überein.

• Beide Eingabeströme sind gleich lang, die Länge ist jedoch kürzer als n Bytes, und sie stimmen in ihren Bytefolgen überein.

Realisieren Sie im gleichen Paket außerdem eine Testklasse mit mindestens vier relevanten Testfällen.
