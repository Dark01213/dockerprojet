# Commandes faites pour lancer l'appli 
## par *Cédric HU*

Voici les commandes faites pour installer l'appli du début à la fin : 

### première étape : 

    - faire un git clone du projet :
        -   git clone https://github.com/charroux/ingnum.git
    - puis faire git remote remove origin pour enlever l'origin 
    - pour finir la première étape faire :
        - git remote add origin git@github.com:Dark01213/dockerproject.git 
    pour ajouter une origin , mais la notre .
### Etape Deux :
    - faire un cd dans le dossier , précisément dans RentalService 
    
    - Faire un /gradlew build 

    - et tester le projet avec : 
        - java -jar build/libs/RentalService-0.0.1-SNAPSHOT.jar
    
    - Pour finir il faut vérifier en cliquant sur le lien suivant : 
        - http://localhost:8080/bonjour ( Cela marche :) ) 

### Etape Trois : 

    -Créer un dossier dockerfile dans le dossier RentalService en faisant :
        
        - Touch dockerfile

        Ou :

            - Le créer avec créer un créer fichier dans vscode ( ce que j'ai fais)

        ou (dernière option) : 

            - créer en faisant code dockerfile 
    
    - Puis il faut coller ce code : 
    ``` 
        FROM eclipse-temurin:21

        VOLUME /tmp

        EXPOSE 8080

        ADD ./build/libs/RentalService-0.0.1-SNAPSHOT.jar app.jar

        ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
    ```

    - et enregistrer .
### Etape Quatre : 

    - lancer la création de l'image avec :

        - docker build –t rentalserviceimage . ( en supprimant le - et en le remettant soi-même , puis en ne mettant aucune majuscule .)
    
    puis vérifier en lançant la run de docker avec : 

        - docker run –p 8080:8080 rentalserviceimage ( en faisant la même chose , supprimer le - et le remettre )

### Dernière étape : 
    
    - faire un commit avec :

        - docker login -u ch2314 , puis mot de passe

        - docker tag d2634fa55428  ch2314/rentalservicedocker:1

        - faire un docker push ch2314/rentalservicedocker:1

        

