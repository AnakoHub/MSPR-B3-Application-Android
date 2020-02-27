# MSPR-B3-Application-Android
L'objectif de ce projet est de créer une application de couponing pour la boutique de vêtement GoStyle, permettant de lier les clients a des offres promotionnelles personnalisées.

Implémentation de la solution suivant le modèle MVC et l’architecture multi-couches (N-Tiers).

Les éléments ont été implémentés suivant le modèle MVC :
- le DAO qui permet l'accès aux données de la base de données, et la persistance
  -> récupération des données concernant les promotions et les clients
- les services contiennent la logique métier.
- les controleurs qui gèrent les flux de données entre le modèle, la vue, et le service
- le modèle qui contient les données et la logique métier:
  - les classes contiennent les données métier
 
Grâce à cette architecture multicouche, qui permet de bien séparer le code, l'application est plus facilement modulable, souple, évolutive et testable.

Retrouvez un schéma de la base de données dans ./Base de donnée/MSPRApplicationAndroid.jpg
