package fr.diginamic.jdr;

import java.util.Random;

public class Character {

    int minStrength = 12;
    int maxStrength = 18;
    int minHealth = 20;
    int maxHealth = 50;

    int strength = new Random().nextInt((maxStrength - minStrength) + 1) + minStrength;
    int health = new Random().nextInt((maxHealth - minHealth) + 1) + minHealth;;
    int score = 0;
}
