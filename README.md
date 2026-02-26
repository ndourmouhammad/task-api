#  Task API - Interface REST Web

Ce projet est la couche de présentation de l'application **Mini Task Manager**. Il expose les fonctionnalités de gestion de tâches via des endpoints REST. Il dépend du module métier `task-core` publié sur notre Nexus.

##  Endpoints Disponibles
L'API écoute par défaut sur le port `8085` :
* `POST /api/tasks` : Créer une nouvelle tâche.
* `GET /api/tasks` : Lister toutes les tâches.
* `PUT /api/tasks/{id}/status?status=...` : Mettre à jour le statut d'une tâche (TODO, IN_PROGRESS, DONE).
* `GET /api/tasks/done/count` : Récupérer le nombre de tâches terminées.

## Configuration
Pour des raisons de sécurité, le mot de passe de la base de données n'est pas stocké dans le code. Vous devez passer une variable d'environnement `DB_PASSWORD` avant de lancer l'application :

```powershell
# Exemple sous Windows (PowerShell)
$env:DB_PASSWORD="votre_mot_de_passe"
mvn spring-boot:run