# TP1 - Injection des dependances

## description
ce tp on a vu comment faire l'injection des dependances en java avec spring

## ce qu'on a fait

**partie 1 :**

1. creer l'interface IDao avec la methode getData
2. creer DaoImpl qui implemente IDao
3. creer l'interface IMetier avec la methode calcul
4. creer MetierImpl avec couplage faible (utilise IDao pas DaoImpl directement)
5. injection des dependances :
   - par instanciation statique : on fait new directement dans le main
   - par instanciation dynamique : on utilise Class.forName() avec un fichier config.txt
   - spring version xml : on configure les beans dans config.xml
   - spring version annotations : on utilise @Component et @Autowired

**partie 2 :**

mini framework d'injection des dependances similaire a spring IOC
- version xml avec JAXB
- version annotations
- injection par constructeur, setter et attribut

## technologies
- Java
- Spring Framework
- Maven

## lancer le projet
```
mvn clean install
mvn exec:java -Dexec.mainClass="ma.projet.presentation.PresentationSpringAnnotations"
```