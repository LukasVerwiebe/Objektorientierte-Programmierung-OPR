# Praktische Aufgabe Nr. 3: Operatoren

Der Zweck dieser Aufgabe ist es, die wichtigen Konzepte dieses Kapitels – Hierarchie von Klassen, Überschreiben von Methoden, abstrakte Klassen und Methoden, Template-Methoden – an einem möglichst kleinen, einfachen Beispiel zu üben. Es geht in dieser Aufgabe um Operatoren. Ein Operator kann genau zwei Dinge:

• Er kann auf ein Argument angewendet werden und liefert einen Wert.

• Er kann eine textuelle Information über sich zurückgeben.

Realisieren Sie im Paket operator ein abstrakte Klasse Operator mit folgenden Methoden:

• Eine Methode public abstract double wendeAn(double argument), um den Operator auf das übergebene Argument anzuwenden.

• Eine (Template-)Methode public String gibInfo(), durch die der Operator eine textuelle Information über sich gibt. Diese Methode ist eine Template-Methode. Sie ist nicht abstrakt, sondern wird konkret implementiert.

Realisieren Sie im Paket operator darüber hinaus eine Klasse Fakultaet als direkte Unterklasse von Operator. Sie dürfen bei der Implementierung der Methode wendeAn davon ausgehen, dass die Methode nur auf sinnvolle Argumente angewendet wird, also nur auf natürliche Zahlen einschließlich 0. Weitere Hinweise auf die Realisierung dieser Klasse ergeben sich aus dem unten dargestellten Testablauf.

Realisieren Sie im Paket operator ebenfalls eine Klasse Addierer. Addition scheint nicht zum Konzept der Klasse Operator zu passen, denn die Methode wendeAn besitzt nur einen Parameter, wogegen man bei Addition an die Verknüpfung von zwei Zahlen denkt. Keine Sorge! Es passt, wenn man den Operator zur Addition bei der Erzeugung mit einem Parameter versieht. Durch new Addierer(2.5) erzeugt man einen Addierer, der bei wendeAn zum übergebenen Argument 2.5 addiert. Beispiel: new Addierer(2.5).wendeAn(1.3) liefert den Wert 3.8. Durch new Addierer(2.5) erzeugt man somit einen Addierer, der bei wendeAn immer 2.5 hinzuaddiert. Realisieren Sie in der Klasse Addierer einen entsprechenden Konstruktor.

Da man dieses Prinzip natürlich auch auf andere binäre Operatoren (Multiplikation, Division, ...) übertragen kann, realisieren Sie im Paket operator außerdem eine abstrakte Klasse BinaererOperator als direkte Unterklasse von Operator.

Die Klasse Addierer ist direkte Unterklasse von BinaererOperator.

Realisieren Sie im Paket operator ebenfalls eine Klasse Dividierer.

Realisieren Sie schließlich im gleichen Paket eine Klasse OperatorTest mit einer main-Methode.
