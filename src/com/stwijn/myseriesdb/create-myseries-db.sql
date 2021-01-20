CREATE DATABASE  IF NOT EXISTS `myseries-db`;
USE `myseries-db`;

DROP TABLE IF EXISTS `serie`;

CREATE TABLE `serie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titel` varchar(45) DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `platform` varchar(45) DEFAULT NULL,
  `imdb` varchar(45) DEFAULT NULL,
  `mijnseries` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

LOCK TABLES `serie` WRITE;

INSERT INTO `serie` VALUES 
	(1,'Roadkill','drama/thriller','NPO Plus', 'https://www.imdb.com/title/tt10846250/', 'https://www.mijnserie.nl/roadkill-2020/', 'gezien'),
	(2,'Rectify','crime/thriller','Netflix', 'https://www.imdb.com/title/tt2183404/', 'https://www.mijnserie.nl/rectify/', 'tijdelijk van Netflix af'),
	(3,'Smeris','action','NPO Plus', 'https://www.imdb.com/title/tt3487478/', 'https://www.mijnserie.nl/smeris/', 'bij s2'),
	(4,'Prison Break','thriller','Netflix', 'https://www.imdb.com/title/tt0455275/', 'https://www.mijnserie.nl/prison_break/', 'laatste seizoen nog kijken'),
	(5,'The Crown','drama/bio','Netflix', 'https://www.imdb.com/title/tt4786824/', 'https://www.mijnserie.nl/the-crown/', ''),
	(6,'....','...','...', '', '...', '...'),
	(7,'...','...','....', '', '', 'add yours!');