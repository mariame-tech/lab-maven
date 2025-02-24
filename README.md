# 📌 Projet Maven Multi-Modules : Commandes

Ce projet est un projet Maven multi-modules structuré en plusieurs parties pour assurer une séparation claire des responsabilités et faciliter la gestion du code.

## 1️⃣ Modules Maven : Avec Spring Boot

Dans cette configuration, nous avons créé un projet Maven multi-modules avec Spring Boot sur IntelliJ IDEA. Le projet parent est un projet Spring Boot contenant les modules suivants :

- **services** : Gère la logique métier de l'application.
- **web** : Contient les contrôleurs et l'interface utilisateur.
- **start** : Module de démarrage de l'application.

### 📌 Création du Projet sur IntelliJ IDEA

1. Ouvrir IntelliJ IDEA et créer un **nouveau projet Maven** nommé `commandes`.
2. Cocher l'option **Créer un projet à partir de l'archétype Maven** et sélectionner `maven-archetype-quickstart`.
3. Ajouter les modules `services`, `web` et `start` en cliquant sur **Fichier > Nouveau > Module** et choisir **Maven**.
<img width="247" alt="image" src="https://github.com/user-attachments/assets/4076dbc6-7477-4fda-9a1a-08c9d4119d38" />


4. Modifier le `pom.xml` du projet parent pour inclure les modules :
<img width="527" alt="image" src="https://github.com/user-attachments/assets/70af0d1f-8aaf-4e97-85dc-519bf88f1ae6" />

### 📌 Configuration des Modules

- **services** :
  - Ajouter `spring-boot-starter-data-jpa` pour la gestion des entités et bases de données.
  - Configurer une source de données dans `application.properties`.
  
- **web** :
  - Ajouter `spring-boot-starter-web` pour exposer les API REST.
  - Ajouter des contrôleurs pour gérer les requêtes.
  - <img width="475" alt="image" src="https://github.com/user-attachments/assets/2a18d572-9c72-4bb4-b39d-bdc936891243" />

  
- **start** :
  - Ajouter `spring-boot-starter` et spécifier `services` et `web` comme dépendances.

## 2️⃣ Modules Maven : Applications Web

Nous avons structuré un projet Maven multi-modules où le projet parent est un simple projet Maven, et les modules suivants :

- **services** : Gère la logique métier.
- **web** : Application web déployée sur Tomcat.
- **batch** : Module Spring Boot pour les traitements batch.

### 📌 Création du Projet sur IntelliJ IDEA

1. Créer un **projet Maven vide** nommé `commandes`.
2. Ajouter les modules `services`, `web` et `batch` via **Fichier > Nouveau > Module**.
3. Configurer `web` avec Tomcat :
   - Ajouter `maven-war-plugin` dans le `pom.xml`.
   <img width="404" alt="image" src="https://github.com/user-attachments/assets/65d73e11-05c0-469d-bd1a-62b535fdd9d9" />

   - Ajouter un fichier `web.xml` pour la configuration.
     <img width="900" alt="image" src="https://github.com/user-attachments/assets/a9d6b000-ff0d-4507-833a-92a362ceec4a" />

## 3️⃣ Modules Maven : Gestion des Plugins

Dans cette configuration, nous avons un projet Maven multi-modules avec Angular comme interface utilisateur :

- **services** : Gère la logique métier.
- **web** : Application Angular.

### 📌 Création du Projet sur IntelliJ IDEA

1. Créer un **projet Maven vide** nommé `commandes`.
2. Ajouter les modules `services` et `web` via **Fichier > Nouveau > Module**.
3. Configurer `web` comme une application Angular :
   - Créer un projet Angular avec `ng new web`.
   - Modifier le `pom.xml` pour inclure `frontend-maven-plugin`.
   - <img width="421" alt="image" src="https://github.com/user-attachments/assets/415d8508-f3df-4e12-8ce0-6b446a6d38f7" />

   - Ajouter `npm install` et `ng build` dans le cycle de build.

✅ Tests et Vérification
- Exécuter les tests unitaires :
  mvn test


