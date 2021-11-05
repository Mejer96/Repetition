package com.company;

public class Octane extends ApexLegend {
    // eftersom superklassen ikke implementerede de resterende metoder fra interface, laves de i sub klassen.
    @Override
    public void tacticalAbility() {
        // metoden har adgang til fields fra super klassen Apex Legend.
        // metoder fra super klassen kan også anvendes og kaldes gennem eksempelvis: object.methodsFromSuperClass
        // endvidere kan methods fra super klassen og 'overrides' af sub klassen, hvis man ønsker det.
        // dermed opnås polymorphism, hvor metoder man samme navn har forskellige funktioner, at efter hvilket objekt
        // som kalder dem.
        setRunSpeed(25);
        setHealthPoints(20);
    }

    @Override
    public void ultimateAbility() {
        System.out.println("Throwing launch pad.");
    }

    @Override
    public void run() {
        // method fra super klassen 'overrides' af sub klassen.
        // polymorphism:
        System.out.println("Octane is now running");
    }
}
