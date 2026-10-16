Dane surowe:

"ID-30492-a", "ID-60492-a", "key-330345-C","kEy-333594-a", "key-330494-c", "Id-30262-c",
"key-333594-a", "key-330494-c", "KEY-550494-A", "uid-304911-a", "key-550494-a", "uid-304911-A",
"uid-304944-a", "key-660494-b", "ID-30435-B", "ID-99435-b", "id-30435-b", "uid-304923-b",
"uid-304234-b", "id-60492-a", "ID-38462-c", "uid-364984-A", "uid-304944-c", "uid-304923-b",
"KEY-330494-c", "uid-304944-C","key-330494-a", "Key-340494-a", "key-330494-b", "kEy-550494-a",
"key-660494-B","keY-660494-b"


Utwórz listę statyczną zawierającą powyższe łańcuchy znaków
Opracuj metodę clean, która:
    - zamieni wszystkie litery na wielkie
    - usunie duplikaty danych
    - wykona sortowanie
    - zwróci wynik jako listę
Opracuj metodę filterByPrefix, która:
    - przefiltruje dane wg zadanego prefiksu np. "key"
    - filtrowanie ma być niewrażliwe na wielkość liter
    - przefiltrowane dane mają być zachowane w oryginale, tzn. bez zmiany wielkości liter
    - zwróć wynik jako listę
Przyjmijmy, że sufiks to litera po ostatnim myślniku. Przyjmijmy, że wielkość tej litery nie ma znaczenia, czyli a oraz A to te same sufiksy. Opracuj metodę countBySuffix, która:
    - znajdzie wszystkie sufiksy
    - dla każdego sufiksu policzy ile jest danych z tym sufiksem
    - wynik zwróci w postaci mapy
Uruchom metody wyświetl wyniki