
# Gestion des Personnes et Villes

Ce projet illustre la gestion d’**objets Person** et **City** en Java.  
Il permet de créer des personnes avec des informations telles que nom, prénom, âge, adresse et ville de naissance, ainsi que de filtrer ou afficher des données selon certains critères.

## Table des matières
1.  Installation
2.  Utilisation
3.  Structure du projet
4.  Fonctionnalités
----------

## Installation
1.  Assurez-vous d’avoir **Java 11** ou plus installé sur votre machine.
2.  Téléchargez le projet et ouvrez-le dans votre IDE favori (Eclipse, IntelliJ, NetBeans, etc.).
3.  Compilez le projet pour générer les classes.
4.  Vous pouvez exécuter la classe de test directement depuis l’IDE ou via le terminal.

**Exemple pour compiler et exécuter depuis le terminal :**

```
javac -d bin src/fr/fms/javaoopex1/*.java 
java -cp bin fr.fms.javaoopex1.TestPerson` 
```
----------

## Utilisation
1.  **TestPerson**
    -   Crée une liste de personnes avec différentes informations.
    -   Chaque personne possède un nom, prénom, âge, adresse et une ville de naissance.
    -   Filtre les personnes qui sont nées en France ou qui habitent à Paris.
    -   Affiche les personnes correspondant au filtre.
Sarkozy,  Nicolas,  66  ans,  habitant  Paris,  ville de naissance :  Ville  de  Paris  en/au  France  ayant  2000000  habitants
``` 

----------

## Structure du projet
    -   `TestPerson` : classe de test pour créer, filtrer et afficher les personnes.
-   Support des villes avec ou sans population spécifiée.
-   Exemple pratique de programmation orientée objet avec **constructeurs, getters/setters et listes**.
----------
Ce projet constitue une bonne introduction à la manipulation des objets et à la gestion de collections en Java, tout en illustrant l’utilisation de filtres simples sur les données.----------
-   Filtrage des personnes selon la ville de résidence ou le pays de naissance.
-   Affichage clair et lisible des informations de chaque personne.

## Fonctionnalités
-   Création de **personnes** et **villes** avec différentes informations.
-   **fr.fms.javaoopex1** : package contenant toutes les classes.
    -   `City` : représente une ville avec nom, pays et nombre d’habitants.
    -   `Person` : représente une personne avec nom, prénom, âge, adresse et ville de naissance.
**Exemple de sortie possible :**

Macron,  Emmanuel,  43  ans,  habitant  l'Elisée  à  Paris,  ville de naissance :  Ville  de  Amiens  en/au  France 

