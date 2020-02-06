CREATE TABLE `Utilisateur` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `pseudo` varchar(255),
  `mot_de_passe` varchar(255),
  `prenom` varchar(255),
  `nom` varchar(255),
  `email` varchar(255),
  `adresse` varchar(255)
);

CREATE TABLE `Promotion` (
  `id` int PRIMARY KEY,
  `code` varchar(255),
  `description` varchar(255),
  `lien` varchar(255)
);

CREATE TABLE `Utilisateur_Promotion` (
  `utilisateur_id` int,
  `promotion_id` int
);

ALTER TABLE `Utilisateur_Promotion` ADD FOREIGN KEY (`utilisateur_id`) REFERENCES `Utilisateur` (`id`);

ALTER TABLE `Utilisateur_Promotion` ADD FOREIGN KEY (`promotion_id`) REFERENCES `Promotion` (`id`);
