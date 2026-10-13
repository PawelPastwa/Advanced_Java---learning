Zdefiniuj interface funkcyjny MathOperation z metodą performOperationz parametrami double double i wartością zwracaną double.
Zdefiniuj klasę MathCalculator1, w której znajduje się metoda statyczna executeOperation. z parametrami double double MathOperation. Metoda zwraca wartość, która jest wynikiem wykonania funkcji przekazanej przez ostatni argument.
Utwórz klasę Main (lub App itp.) z metodą main,
W metodzie `main utwórz
Dwa obiekty typu MathOperation: dodawanie i mnożenie
Użyj tych obiektow z metodą MathCalculator1.executeOperation
Użyj formuły f(x,y)=sin(x)+cos(y) bezpośrednio w MathCalculator1.executeOperation
Zdefiniuj klasę MathCalculator2, która będzie analogiczna do MathCalculator1, ale będzie używać standardowego interfejsu funkcyjnego BiFunction<Double, Double, Double>. W metodzie main użyj metody executeOperation z klasy MathCalculator2.