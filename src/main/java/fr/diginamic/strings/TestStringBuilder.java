package fr.diginamic.strings;

import static fr.diginamic.strings.StringUtils.append;

public class TestStringBuilder {

    int age = 15;
    String nom = "Lee";

    StringBuilder builder = new StringBuilder();

    String resultat2 = append("Bonjour M.", nom, ". Vous avez ", age);
}
