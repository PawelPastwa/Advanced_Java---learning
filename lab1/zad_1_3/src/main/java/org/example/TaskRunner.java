package org.example;

import org.reflections.Reflections;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class TaskRunner {

    public void scanPackageAndRun(String packageName) {

        System.out.println(" -> Skanuje pakiet: " + packageName);

        Reflections reflections = new Reflections(packageName);

        //Wszystkie klasy pakietu, które implementują interfejs
        Set<Class<? extends HaveRunMethod>> classes
                = reflections.getSubTypesOf(HaveRunMethod.class);

        //Mapa instancji taskow do uruchomienia
        Map<HaveRunMethod, Integer> tasksWithCounters = new HashMap<>();

        for(Class<? extends HaveRunMethod> cls : classes){

            if(!cls.isAnnotationPresent(Task.class)) continue;

            Task annotation = cls.getAnnotation(Task.class);

            try {

                HaveRunMethod instance = cls.getDeclaredConstructor().newInstance();

                tasksWithCounters.put(instance, annotation.numberOfRepetition());

            } catch (Exception e) {
                //ignore
            }
        }

        //Wykonanie tasków z kreśloną liczbą razy
        tasksWithCounters.forEach((taskInstance, numberOfRepetitions) -> {

            for (int i = 0; i < numberOfRepetitions; i++) taskInstance.run();

        });

        System.out.println(" -> Wszystkie taski wykonane");
    }
}
