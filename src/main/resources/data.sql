/* ----------------------------------
    	Classes
   ---------------------------------- */
INSERT INTO classes (id, cycle, name) VALUES
(1, "Cycle 3", "6_G1"),
(2, "Cycle 3", "6_G2"),
(3, "Cycle 3", "6_G3"),
(4, "Cycle 3", "6_G4"),
(5, "Cycle 3", "6_G5"),
(6, "Cycle 4", "5_G3"),
(7, "Cycle 4", "5_G4"),
(8, "Cycle 4", "301"),
(9, "Cycle 4", "302"),
(10, "Cycle 4", "303"),
(12, "Cycle 4", "304");

/* ----------------------------------
 	Eleves
  ---------------------------------- */
-- eleves de la classe 6_G5
INSERT INTO eleves (first_name, last_name, classe_id) VALUES
("ALBERT", "Maël", 5),
("BELINGAND - - DURAN", "Pierre", 5),
("CARPENTIER", "Maïana", 5),
("CATALA - BAILLY", "Iloni", 5),
("CATALA-CARRIE", "Rose", 5),
("CHABBERT", "Simon", 5),
("COMBES", "Anaïs", 5),
("CROS - - CASANOVA", "Léa", 5),
("JAUZION", "Nicolas", 5),
("JOUSSERAND", "Julian", 5),
("LE CAM", "Eliot", 5),
("LOEILLET-CABANIS", "Eva", 5),
("NOEL", "Arsène", 5),
("POUSTHOMIS", "Sarah", 5),
("ROCACHER", "Lola", 5),
("SANS", "Célène", 5),
("SENEGAS", "Zia", 5),
("WINDEL", "Camille", 5),
("ZNIBER", "Maïa", 5);

/* ----------------------------------
	Domaines - Compétence
  ---------------------------------- */
-- Domaine 1
INSERT INTO domaines (id, ref, description, cycle) VALUES
(1, "D1", "les langages mathématiques, scientifiques et informatique pour penser et communiquer.", "Cycle 3");
-- Competences domaine 1
INSERT INTO competences (id, ref, description, cycle, abstract_domaine_id) VALUES
(2, "CT 1.1", "Savoir décrire des observations, expériences, hypothèses, conclusions en utilisant un vocabulaire précis.", "Cycle 3", 1),
(3, "CT 1.2", "Savoir exploiter un document constitué de divers supports (texte, schéma, graphique, tableau, algorithme simple).", "Cycle 3", 1),
(4, "CT 1.3", "Utiliser différents modes de représentation (texte, schéma, graphique, tableau, algorithme simple).", "Cycle 3", 1),
(5, "CT 1.4", "Expliquer un phénomène à l’oral et / ou à l’écrit.", "Cycle 3", 1),
(6, "CT 1.5", "Savoir créer un programme de construction.", "Cycle 3", 1),
(7, "CT 1.6", "Se repérer et se déplacer dans l’espace en utilisant ou en élaborant des représentations.", "Cycle 3", 1);

-- Domaine 2
INSERT INTO domaines (id, ref, description, cycle) VALUES
(8, "D2", "les méthodes et outils pour apprendre", "Cycle 3");
-- Competences domaine 2
INSERT INTO competences (id, ref, description, cycle, abstract_domaine_id) VALUES
(9, "CT 2.1", "Utiliser des outils numériques pour communiquer des résultats en respectant les règles de base, enregistrement, intégration de médias, collaboration.", "Cycle 3", 8),
(10, "CT 2.2", "Utiliser des outils numériques pour simuler des phénomènes.", "Cycle 3", 8),
(11, "CT 2.3", "Utiliser des outils numériques pour représenter des objets techniques.", "Cycle 3", 8),
(12, "CT 2.4", "Choisir ou utiliser le matériel adapté pour mener une observation, effectuer une mesure, réaliser une expérience ou une production.  Utiliser les bonnes unités.", "Cycle 3", 8),
(13, "CT 2.5", "Organiser seul ou en groupe un espace de réalisation expérimentale.", "Cycle 3", 8),
(14, "CT 2.6", "Extraire les informations pertinentes d’un document et les mettre en relation pour répondre à une question.", "Cycle 3", 8),
(15, "CT 2.7", "Utiliser les outils mathématiques adaptés.", "Cycle 3", 8);

-- Domaine 3
INSERT INTO domaines (id, ref, description, cycle) VALUES
(16, "D3", "La formation de la personne et du citoyen", "Cycle 3");
-- Competences domaine 3
INSERT INTO competences (id, ref, description, cycle, abstract_domaine_id) VALUES
(17, "CT 3.1", "Exprimer des émotions ressenties. Formuler une opinion, prendre de la distance avec celle-ci, la confronter à celle d'autrui et en discuter.", "Cycle 3", 16),
(18, "CT 3.2", "Relier des connaissances acquises en sciences et technologie à des questions de santé, de sécurité et d’environnement.", "Cycle 3", 16);

-- Domaine 4
INSERT INTO domaines (id, ref, description, cycle) VALUES
(19, "D4", "les systèmes naturels et les systèmes techniques", "Cycle 3");
-- Sous-domaine 1
INSERT INTO domaines (id, ref, description, cycle, abstract_domaine_id) VALUES
(20, "D4", "Pratiquer des démarches scientifiques et technologiques", "Cycle 3",19);
-- Competences domaine 4-sousdomaine 1
INSERT INTO competences (id, ref, description, cycle, abstract_domaine_id) VALUES
(21, "CT 3.1", "Exprimer des émotions ressenties. Formuler une opinion, prendre de la distance avec celle-ci, la confronter à celle d'autrui et en discuter.", "Cycle 3", 19),
(22, "CT 3.2", "Relier des connaissances acquises en sciences et technologie à des questions de santé, de sécurité et d’environnement.", "Cycle 3", 19);