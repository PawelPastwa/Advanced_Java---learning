Zadanie polega na utworzeniu w projekcie pakietu tasks, który w momencie uruchomienia programu zostanie przeszukany.
Poszukiwane w nim będą klasy oznaczone adnotacją @Task i implementujące interface HaveRunMethod.
Dla wszystkich pasujących klas zostaną utworzone obiekty i następnie na każdym obiekcie zostanie uruchomiana metoda z zaimplementowanego interfejsu.
Dodatkowa adnotacja @Task będzie posiadała możliwość określenia ile razy ta metoda zostanie uruchomiona.