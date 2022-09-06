# Praktische Aufgabe Nr. 14: Wörterstream

Realisieren Sie im Paket folge eine Klasse Woerterstream mit einer Methode Stream<String> gibStream(). Die Elemente des Streams sollen alle Wörter sein, die sich aus den 26 Buchstaben a bis z bilden lassen (einschließlich des leeres Worts). Der Stream enthält die Wörter in lexikografisch aufsteigender Reihenfolge. Den Anfang des Stream bildet somit das leere Wort gefolgt von a, b, ..., z, aa, ab, ..., az, ba, ..., zz, aaa, ...

Realisieren Sie im gleichen Paket außerdem eine Testklasse WoerterstreamTest, in der Sie ein sinnvolles Anfangsstück des Streams verwenden und insbesondere testen, ob die Übergänge, bei denen die Wörter länger werden (z. B. von z zu aa), richtig funktionieren.
