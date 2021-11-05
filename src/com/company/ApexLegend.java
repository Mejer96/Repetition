package com.company;

abstract class ApexLegend implements PlayerActions  {
    // klassen defineres abstract, så det ikke er muligt at lave objekt, da det i ikke denne kontekst ikke er
    // hensigtsmæssigt, da super klassen er for abstrakt.

    // Klassen implementer en interface for at sørge for, at de nødvendige methods er tilstede i enten super klassen eller sub klassen.

    // fields og methods laves samt getters og setters, så fields er modificerbare og tilgængelige.
    // disse fields og methods er tilgængelige for klassen 'octane'.


    private int healthPoints = 100;
    private int runSpeed = 100;

    public void run() {
        System.out.println("Running");
    }

    public void loot() {
        System.out.println("looting");
    }

    public void shoot() {
        System.out.println("shooting");
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setHealthPoints(int healthModifier) {
        healthPoints += healthModifier;
    }

    public void setRunSpeed(int runModifier) {
        runSpeed += runModifier;
    }

}
