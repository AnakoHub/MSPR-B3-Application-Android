CREATE TABLE `Client` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `pseudo` varchar(255),
  `mot_de_passe` varbinary,
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

CREATE TABLE `Client_Promotion` (
  `client_id` int,
  `promotion_id` int
);

ALTER TABLE `Client_Promotion` ADD FOREIGN KEY (`client_id`) REFERENCES `Client` (`id`);

ALTER TABLE `Client_Promotion` ADD FOREIGN KEY (`promotion_id`) REFERENCES `Promotion` (`id`);
