# Praktische Aufgabe Nr. 11: Zahlenfolge

Endliche Folgen ganzer Zahlen könnte man durch Objekte des Typs List<Integer> oder int[] repräsentieren. Aber wie sieht es mit unendlichen Folgen aus?

Eine elegante Möglichkeit, endliche und unendliche Folgen gleichermaßen zu repräsentieren, besteht in Klassen, die eine Schnittstelle Zahlenfolge implementieren. Zahlenfolge soll folgende Methoden deklarieren:

• Eine Methode boolean hatNaechstes(), die genau dann true liefert, wenn die Zahlenfolge noch ein weiteres Element enthält.

• Eine Methode int gibNaechstes() throws NoSuchElementException, die das nächste Element liefert oder eine Ausnahme wirft, wenn die Folge kein Element mehr enthält.

(Damit ist die Schnittstelle Zahlenfolge vergleichbar der Schnittstelle Enumeration, jedoch eingeschränkt auf Werte des Typs int.)

Definieren Sie im Paket zahlenfolge die Schnittstelle Zahlenfolge und realisieren Sie im gleichen Paket folgende Klassen, die diese Schnittstelle implementieren:

• Eine Klasse EndlicheFolge mit einem Konstruktor EndlicheFolge(int[]). Ein Objekt dieser Klasse repräsentiert eine endliche Folge, deren Werte beim Erzeugen explizit angegeben werden.

• Eine Klasse FibonacciFolge mit einem Konstruktor FibonacciFolge(). Ein Objekt dieser Klasse repräsentiert die Folge der Fibonacci-Zahlen.

• Eine Klasse Mischfolge mit einem Konstruktor Mischfolge(Zahlenfolge, Zahlenfolge). Ein Objekt dieser Klasse repräsentiert die Folge, die aus den gemeinsamen Werten zweier Folgen besteht. Sind diese beiden Folgen sortiert, ist die Mischfolge ebenfalls sortiert. (Ansonsten kann die Mischfolge die Elemente in einer beliebigen Reihenfolge liefern. Dies bedeutet, Sie können sich bei der Realisierung auf den Fall der sortierten Folgen konzentrieren und müssen lediglich dafür sorgen, dass im anderen Fall kein Element „unter den Tisch“ fällt.)

Das „Dilemma“ bei dieser Klasse ist, dass Sie für die Methode gibNaechstes nie im Vorhinein wissen, in welcher Folge sich das nächstkleinste Element befindet. Also werden Sie wohl auf beide Folgen zugreifen müssen. Was passiert aber mit dem größeren der beiden Elemente?

Statt hier eine spezielle „Das-Element-merke-ich-mir-für-später-Strategie“ zu implementieren, könnten Sie eine Strategie anwenden, die bei Eingabeströmen, aus denen man wie bei unseren Zahlenfolgen ebenfalls nur „vorwärts“ lesen kann, angewandt wird. Dort gibt es Klassen PushBackInputStream und PushBackReader, die ermöglichen, Bytes oder Zeichen in den Eingabestrom zurückzuschreiben. Realisieren Sie deshalb ...

• Eine Klasse PushBackFolge mit einem Konstruktor PushBackFolge(Zahlenfolge). Ein Objekt dieser Klasse basiert auf einer Zahlenfolge und ergänzt diese um die Fähigkeit, Werte „zurückzuschreiben“. Dazu dient die Methode schreibeZurueck(int). Wird mit dieser Methode die Zahl n zurückgeschrieben, liefert die nächste Anwendung der Methode gibNaechstes den Wert n.

• Eine Klasse EindeutigeFolge mit einem Konstruktor EindeutigeFolge(Zahlenfolge). Ein Objekt dieser Klasse basiert auf einer Zahlenfolge und repräsentiert deren Werte ohne doppelte Elemente. Es wird davon ausgegangen, dass die übergebene Folge sortiert ist.

Zum Testen und für die genaue Semantik der Methoden sind Ihnen für jede der angegebenen Klassen Testklassen vorgegeben.
