DROP DATABASE IF EXISTS Jeu_Foot;

CREATE DATABASE Jeu_Foot;

USE Jeu_Foot;


#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Joueur
#------------------------------------------------------------

CREATE TABLE Joueur(
        id_joueur        int (11) Auto_increment  NOT NULL ,
        firstname_joueur Varchar (25) ,
        lastname_joueur  Varchar (25) ,
        surname_joueur   Varchar (25) ,
        price            Decimal(11,2) ,
        id_club          Int ,
        PRIMARY KEY (id_joueur)
)ENGINE=InnoDB;



#------------------------------------------------------------
# Table: Club
#------------------------------------------------------------

CREATE TABLE Club(
        id_club      int (11) Auto_increment  NOT NULL ,
        name         Varchar (25) ,
        club_money        Decimal(16,2) ,
        PRIMARY KEY (id_club )
)ENGINE=InnoDB;



#------------------------------------------------------------
# Table: Match
#------------------------------------------------------------

CREATE TABLE MatchGame(
        id_match               int (11) Auto_increment  NOT NULL ,
        name_match             Varchar (25) ,
        id_selection_interieur Int ,
        id_saison              Int ,
        id_selection_exterieur Int ,
        PRIMARY KEY (id_match)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Attribut
#------------------------------------------------------------

CREATE TABLE Attribut(
        id_attribut   int (11) Auto_increment  NOT NULL ,
        name_attribut Varchar (25) ,
        PRIMARY KEY (id_attribut )
)ENGINE=InnoDB;



#------------------------------------------------------------
# Table: But
#------------------------------------------------------------

CREATE TABLE But(
        id_but    int (11) Auto_increment  NOT NULL ,
        atTime    DateTime ,
        id_joueur Int ,
        id_match  Int ,
        PRIMARY KEY (id_but )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Saison
#------------------------------------------------------------

CREATE TABLE Saison(
        id_saison int (11) Auto_increment  NOT NULL ,
        name      Varchar (25) ,
        PRIMARY KEY (id_saison )
)ENGINE=InnoDB;



#------------------------------------------------------------
# Table: Entraineur
#------------------------------------------------------------

CREATE TABLE Entraineur(
        id_entraineur        int (11) Auto_increment  NOT NULL ,
        firstname_entraineur Varchar (25) ,
        lastname_entraineur  Varchar (25) ,
        id_club              Int ,
        PRIMARY KEY (id_entraineur )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Selection
#------------------------------------------------------------

CREATE TABLE Selection(
        id_selection   int (11) Auto_increment  NOT NULL ,
        id_match       Int ,
        id_club        Int ,
        PRIMARY KEY (id_selection )
)ENGINE=InnoDB;

#------------------------------------------------------------
# Table: posseder
#------------------------------------------------------------

CREATE TABLE Posseder(
        valeur      Int ,
        id_joueur   Int NOT NULL ,
        id_attribut Int NOT NULL ,
        PRIMARY KEY (id_joueur ,id_attribut )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: faire_parti
#------------------------------------------------------------

CREATE TABLE Faire_parti(
        id_joueur    Int NOT NULL ,
        id_selection Int NOT NULL ,
        PRIMARY KEY (id_joueur ,id_selection )
)ENGINE=InnoDB;


ALTER TABLE Joueur ADD CONSTRAINT FK_Joueur_id_club FOREIGN KEY (id_club) REFERENCES Club(id_club);

ALTER TABLE MatchGame ADD CONSTRAINT FK_Match_id_selection_interieur FOREIGN KEY (id_selection_interieur) REFERENCES Selection(id_selection);
ALTER TABLE MatchGame ADD CONSTRAINT FK_Match_id_saison FOREIGN KEY (id_saison) REFERENCES Saison(id_saison);
ALTER TABLE MatchGame ADD CONSTRAINT FK_Match_id_selection_exterieur FOREIGN KEY (id_selection_exterieur) REFERENCES Selection(id_selection);

ALTER TABLE But ADD CONSTRAINT FK_But_id_joueur FOREIGN KEY (id_joueur) REFERENCES Joueur(id_joueur);
ALTER TABLE But ADD CONSTRAINT FK_But_id_match FOREIGN KEY (id_match) REFERENCES MatchGame(id_match);
ALTER TABLE Entraineur ADD CONSTRAINT FK_Entraineur_id_club FOREIGN KEY (id_club) REFERENCES Club(id_club);
ALTER TABLE Selection ADD CONSTRAINT FK_Selection_id_match FOREIGN KEY (id_match) REFERENCES MatchGame(id_match);
ALTER TABLE Selection ADD CONSTRAINT FK_Selection_id_club FOREIGN KEY (id_club) REFERENCES Club(id_club);
ALTER TABLE Posseder ADD CONSTRAINT FK_Posseder_id_joueur FOREIGN KEY (id_joueur) REFERENCES Joueur(id_joueur);
ALTER TABLE Posseder ADD CONSTRAINT FK_Posseder_id_attribut FOREIGN KEY (id_attribut) REFERENCES Attribut(id_attribut);
ALTER TABLE Faire_parti ADD CONSTRAINT FK_Faire_parti_id_joueur FOREIGN KEY (id_joueur) REFERENCES Joueur(id_joueur);

ALTER TABLE Faire_parti ADD CONSTRAINT FK_Faire_parti_id_selection FOREIGN KEY (id_selection) REFERENCES Selection(id_selection);



INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (1,"Rooney","Akeem Steele","velit",14850324),(2,"Preston","Jasper Levy","Curabitur",8247684),(3,"Adam","Hoyt Knapp","Nullam",12191861),(4,"Wesley","Oren Warner","feugiat",8302087),(5,"Merrill","Amir Reese","et",11900247),(6,"Benjamin","Hedley Browning","et,",4252135),(7,"Drew","Cedric Oneal","non,",4046497),(8,"Buckminster","Yuli Hansen","nibh.",1692629),(9,"Lewis","Isaac Lindsey","ultrices.",3559064),(10,"Abraham","Kuame Bean","dignissim.",8136852);
INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (11,"Davis","Axel Sheppard","cursus",7521952),(12,"Donovan","Reese Nunez","pellentesque",2685935),(13,"Thane","Phelan Jennings","lacinia",7609881),(14,"Elliott","Hector Maldonado","Fusce",4524227),(15,"Kato","Salvador Burks","Etiam",4663649),(16,"Geoffrey","Brandon Ballard","risus",11455184),(17,"Leroy","Adam Gomez","nec",12921937),(18,"Alden","Jesse Zamora","amet",11302840),(19,"Sean","Kadeem Little","enim.",5660933),(20,"Grady","Steel Whitfield","amet,",9526090);
INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (21,"Timon","Michael Hahn","bibendum",13434898),(22,"Carl","Eric Cole","sit",3443537),(23,"Herrod","Carter Nixon","dui",9259237),(24,"Bradley","Fritz Alexander","vel,",14817148),(25,"Thane","Colorado Shaw","sociis",1451094),(26,"Adam","Fuller Cantu","lectus",1362520),(27,"Clark","Stewart Reeves","eu",10980054),(28,"Burke","Elmo Rodriguez","rutrum",13214266),(29,"Harlan","Daniel Perez","magna",8094773),(30,"Ezra","Cairo Pruitt","fringilla",4769278);
INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (31,"Timon","Donovan Dominguez","Ut",1119288),(32,"Cade","Ezra Irwin","faucibus",1297534),(33,"Solomon","Amir Hampton","Nunc",3758350),(34,"Wade","Lawrence Mullins","in,",834232),(35,"Gregory","Blaze Bowman","cursus",5636452),(36,"Bevis","Nissim Mcfarland","Phasellus",3818332),(37,"Norman","Lawrence Woods","ornare",5382942),(38,"Hyatt","Melvin Bauer","ornare",666252),(39,"Baker","Carl Franco","ipsum",637273),(40,"Elton","Slade Bradford","eu",4925172);
INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (41,"Ezra","Benjamin Melton","facilisi.",1276328),(42,"Merritt","Derek Joyner","augue",7141306),(43,"Arsenio","Linus Carter","nec",3711872),(44,"Peter","Galvin Grant","Donec",7826889),(45,"Wayne","Theodore Warren","elementum",5436525),(46,"Graham","Samuel Rodgers","in",11852600),(47,"Beau","Hop Romero","parturient",13761693),(48,"Luke","Nasim Goodman","adipiscing",6184744),(49,"Finn","Yoshio Gonzalez","aliquet",13894435),(50,"Emmanuel","Ahmed Farley","eleifend",8195752);
INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (51,"Kibo","James Mills","Fusce",14104959),(52,"Denton","Hamilton French","tellus",13738969),(53,"Reese","Martin Page","lacinia.",13852349),(54,"Neil","Carter Justice","Proin",14702442),(55,"Kaseem","Amos Vang","erat",4064353),(56,"Griffith","Edward Rowe","Mauris",12143976),(57,"Barry","Cody Roach","odio.",14243628),(58,"Plato","Holmes Mercado","neque",13219130),(59,"Dylan","Chester Lyons","auctor",11137782),(60,"Allen","Stone Lindsay","arcu.",14019526);
INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (61,"Acton","Hayes Pittman","placerat.",11532557),(62,"Thomas","Neville Hunter","nunc",9077266),(63,"Arthur","Phelan Daugherty","sed",11666764),(64,"Colton","Jelani Pollard","ac",9585741),(65,"Hu","Kyle Stokes","nisl.",510539),(66,"Upton","Malcolm Moran","leo,",10485249),(67,"Steel","Elijah Long","vulputate",14002291),(68,"Theodore","Octavius Ramsey","ullamcorper,",4324272),(69,"Ralph","Oleg Rollins","dignissim",12362952),(70,"Gil","Lester Conley","eros.",13678313);
INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (71,"Dorian","Stephen Green","Cras",1515844),(72,"Porter","Andrew Wiggins","Proin",9022172),(73,"Benedict","Donovan Gomez","lacus.",9110649),(74,"Raja","Ishmael Carr","eget",7522365),(75,"Dorian","Gage Shepard","arcu.",7258116),(76,"Uriel","Myles Mills","a",14057273),(77,"Kenyon","Craig Blair","luctus",1153918),(78,"Amir","Nissim Britt","fringilla",11128245),(79,"Reese","Dylan Bass","mi",14731538),(80,"Tate","Ronan Bender","velit.",7718999);
INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (81,"Nathaniel","Rooney Pruitt","vitae,",9305521),(82,"Zeus","Thomas Hines","sed",4230216),(83,"Jackson","Clarke Burris","sed",1465391),(84,"Preston","Kennedy Cruz","vestibulum,",12530153),(85,"Garrison","Nissim Sparks","sit",3339739),(86,"Wing","Plato Abbott","placerat.",6459263),(87,"Murphy","Leo Merritt","a",9634361),(88,"Stone","Channing Barry","lobortis",13749233),(89,"Dustin","Hashim Buck","sociosqu",14370963),(90,"Baker","Paki Skinner","nibh.",13154391);
INSERT INTO `Joueur` (`id_joueur`,`firstname_joueur`,`lastname_joueur`,`surname_joueur`,`price`) VALUES (91,"Steel","Keegan Wilkins","vitae,",5017934),(92,"Brian","Arsenio Donovan","dolor.",7361419),(93,"Rooney","Ignatius Riddle","lectus,",5540334),(94,"Todd","Rudyard Nielsen","nunc",9894328),(95,"Colby","Drake Foster","consectetuer",14392604),(96,"Levi","Kelly Munoz","lacinia.",11152656),(97,"Vaughan","Colt Simmons","tristique",1626828),(98,"Graham","Dante Kent","imperdiet",390589),(99,"Conan","Tanek Kramer","justo.",11935756),(100,"Dominic","Herrod Skinner","egestas.",9821571);


INSERT INTO Attribut VALUES (1,'reflexes'), (2,'communication'), (3,'concentration'), (4,'agilité'), (5,'tacles'), (6,'tête'), (7,'détermination'), (8,'sang_froid'), (9,'placement'), (10,'courage'), (11,'marquage'), (12,'endurance'), (13,'vitesse'), (14,'passes'), (15,'accélération'), (16,'finition'), (17,'appels balle'), (18,'dribble'), (19,'puissance'), (20,'contrôle de balle'), (21,'technique');


INSERT INTO `Saison` (`id_saison`,`name`) VALUES (25,"amet ante."),(29,"Proin vel"),(28,"arcu et"),(10,"augue scelerisque"),(13,"Suspendisse ac"),(16,"nostra, per"),(18,"imperdiet ullamcorper."),(21,"augue scelerisque"),(24,"pede ac"),(27,"velit. Pellentesque");


INSERT INTO Club VALUES (1,'Stade rennais',50000000),(2,'Olympique Lyonnais',170000000);


INSERT INTO Selection VALUES (1,NULL,1),(2,NULL,2),(3,NULL,1),(4,NULL,2);


INSERT INTO `Faire_parti` (`id_joueur`,`id_selection`) VALUES (1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,1),(8,1),(9,1),(10,1);
INSERT INTO `Faire_parti` (`id_joueur`,`id_selection`) VALUES (11,1),(12,1),(13,1),(14,1),(15,1),(16,1),(17,1),(18,1),(19,1),(20,1);
INSERT INTO `Faire_parti` (`id_joueur`,`id_selection`) VALUES (21,2),(22,2),(23,2),(24,2),(25,2),(26,2),(27,2),(28,2),(29,2),(30,2);
INSERT INTO `Faire_parti` (`id_joueur`,`id_selection`) VALUES (31,2),(32,2),(33,2),(34,2),(35,2),(36,2),(37,2),(38,2),(39,2),(40,2);
INSERT INTO `Faire_parti` (`id_joueur`,`id_selection`) VALUES (1,3),(2,3),(3,3),(4,3),(5,3),(6,3),(7,3),(8,3),(9,3),(10,3);
INSERT INTO `Faire_parti` (`id_joueur`,`id_selection`) VALUES (11,3),(12,3),(13,3),(14,3),(15,3),(16,3),(17,3),(18,3),(19,3),(20,3);
INSERT INTO `Faire_parti` (`id_joueur`,`id_selection`) VALUES (21,4),(22,4),(23,4),(24,4),(25,4),(26,4),(27,4),(28,4),(29,4),(30,4);
INSERT INTO `Faire_parti` (`id_joueur`,`id_selection`) VALUES (31,4),(32,4),(33,4),(34,4),(35,4),(36,4),(37,4),(38,4),(39,4),(40,4);


INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (1,"vulputate dui,",1,27,3),(2,"netus et",2,28,4);


UPDATE Selection SET id_match= 1 WHERE id_selection=1;
UPDATE Selection SET id_match= 1 WHERE id_selection=2;
UPDATE Selection SET id_match= 2 WHERE id_selection=3;
UPDATE Selection SET id_match= 2 WHERE id_selection=4;


INSERT INTO `But` (`id_but`,`atTime`,`id_joueur`,`id_match`) VALUES (1,"2017-06-13 11:57:16",23,1),(2,"2017-06-10 03:38:43",29,1),(3,"2017-06-02 19:51:51",3,2);


INSERT INTO `Entraineur` (`id_entraineur`,`firstname_entraineur`,`lastname_entraineur`,`id_club`) VALUES (70,"Ashton","Palmer",2),(155,"Thor","Raphael",1),(240,"Sylvester","Mohammad",2),(325,"Yasir","Hunter",2),(410,"Kamal","Elliott",1),(495,"Theodore","Hashim",1),(580,"Murphy","Justin",2),(665,"Wayne","Brian",1),(750,"Thaddeus","Jeremy",2),(835,"Reed","Beck",2);


INSERT INTO `Posseder` (`valeur`,`id_joueur`,`id_attribut`) VALUES (3,10,6),(5,16,8),(5,18,2),(3,40,16),(12,29,9),(18,38,19),(14,94,17),(4,84,14),(5,19,7),(16,77,8);
INSERT INTO `Posseder` (`valeur`,`id_joueur`,`id_attribut`) VALUES (9,60,8),(15,29,11),(19,52,12),(8,74,8),(2,90,21),(9,14,12),(9,56,21),(11,40,20),(2,96,3),(1,19,17);
INSERT INTO `Posseder` (`valeur`,`id_joueur`,`id_attribut`) VALUES (17,89,3),(6,66,12),(14,87,11),(17,16,9),(9,24,9),(6,23,19),(20,37,5),(6,45,6),(11,61,16),(3,66,6);
INSERT INTO `Posseder` (`valeur`,`id_joueur`,`id_attribut`) VALUES (4,93,3),(9,59,19),(10,97,12),(14,56,12),(17,86,11),(10,51,19),(17,94,14),(5,33,12),(20,53,9),(14,33,1);
INSERT INTO `Posseder` (`valeur`,`id_joueur`,`id_attribut`) VALUES (18,2,16),(12,48,11),(13,56,15),(11,79,10),(10,17,12),(18,28,14),(15,98,17),(15,69,6),(16,62,2),(9,32,7);
INSERT INTO `Posseder` (`valeur`,`id_joueur`,`id_attribut`) VALUES (14,3,17),(19,4,3),(15,53,20),(20,4,9),(5,75,15),(9,100,13),(13,18,13),(14,49,9),(10,64,10),(10,25,9);
INSERT INTO `Posseder` (`valeur`,`id_joueur`,`id_attribut`) VALUES (18,3,21),(3,67,18),(14,85,9),(14,61,2),(15,64,2),(9,43,14),(17,70,2),(5,63,17),(18,21,11),(7,53,18);


