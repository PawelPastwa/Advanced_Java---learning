package org.example;

import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SecretData<String, PrintStream> textWithOutputStreamSecretData
                = new SecretData<>("Dane tesktowe", System.out);

        SecretDataActions.writeToStream(textWithOutputStreamSecretData);
        SecretDataActions.printOnScreen(textWithOutputStreamSecretData);

        SecretData<Integer, Double> numericData = new SecretData<>(5, 2.2);

        SecretDataActions.printOnScreen(numericData);

        double sum = SecretDataActions.sumOfData(numericData);
        System.out.println("suma = " + sum);

        SecretDataWithPrintOnScreen<String, Integer> secretDataWithPrintOnScreen
                = new SecretDataWithPrintOnScreen<>("Opis ", 5);

        SecretDataActions.printOnScreen((HaveFunctionPrintOnScreen) secretDataWithPrintOnScreen);
        SecretDataActions.printOnScreen((SecretData<?,?>) secretDataWithPrintOnScreen );
    }
}