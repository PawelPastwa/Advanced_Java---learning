Zadanie 1.1. Typy generyczne
Cel: Praktyczne użycie typów generycznych na prostych przykładach
Zdefiniuj klasę SecretData z polami prywatnymi data1 oraz data2. Oba pola mają być typu generycznego. Utwórz konstruktor z pełnym zestawem parametrów, settery oraz gettery.
Zdefiniuj interfejs HaveFunctionPrintOnScreen z metodą void printOnScreen().
Zdefiniuj klasę SecretDataWithPrintOnScreen, która dziedziczy po klasie SecretData oraz implementuje interface HaveFunctionPrintOnScreen. Zaimplementuj metodę interfejsu w taki sposób, aby pola data1 oraz data2 były wyświetlane na konsoli. (Klasa wymaga zdefiniowania konstruktora.)
Utwórz klasę SecretDataActions, w której będą metody do przetwarzania obiektów powyższych klas z typami generycznymi.
W klasie zdefiniuj statyczne metody:
    printOnScreen, która jako parametr przyjmuje obiekt klasy implementującej interface HaveFunctionPrintOnScreen. Metoda ta wywołuje metodę z interface.
    printOnScreen, która jako parametr przyjmuje obiekt klasy SecretData. Metoda ta wyświetla pola klasy na ekranie. (Może niech wyświetla w inny sposób, aby było widać różnicę.)
    sumOfData, która jako parametr przyjmuje obiekt klasy SecretData, ale tyko wtedy, gdy pola obiektu tej klasy są typu liczbowego. Metoda zwraca sumę tych pól.
    writeToStream, która jako parametr przyjmuje Obiekty klasy SecretData, ale tyko wtedy, gdy pierwsze pole jest typu String, a drugie obiektem klasy dziedziczącej po OutputStream. Metoda wpisuje pierwsze pole do strumienia (drugie pole). Metoda zwraca true, jeżeli zapis się udał, false, jeżeli się nie udał.
Utwórz klasę Main (lub App itp.) z metodą main, w której należy uruchomić wszystkie metody zdefiniowane w klasie ``SecretDataActions```. (Konieczne jest oczywiście stworzenie odpowiednich obiektów.)
Uruchom.