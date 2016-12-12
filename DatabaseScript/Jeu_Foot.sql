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
        PRIMARY KEY (id_joueur )
)ENGINE=InnoDB;

INSERT INTO Joueur VALUES

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



#------------------------------------------------------------
# Table: Club
#------------------------------------------------------------

CREATE TABLE Club(
        id_club      int (11) Auto_increment  NOT NULL ,
        name         Varchar (25) ,
        club_money        Decimal(16,2) ,
        id_selection Int ,
        PRIMARY KEY (id_club )
)ENGINE=InnoDB;


INSERT INTO Club VALUES (1,'Stade rennais',50000000, 5), (2,'Olympique Lyonnais',170000000, 10);



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

INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (1,"vulputate dui,",1,27,31),(2,"netus et",11,28,36),(3,"Sed congue,",8,22,34),(4,"in, dolor.",13,26,43),(5,"ante blandit",4,24,32),(6,"lacus vestibulum",7,25,31),(7,"arcu. Nunc",7,27,43),(8,"Nunc quis",6,26,43),(9,"egestas. Fusce",12,22,46),(10,"velit justo",9,25,46);
INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (11,"dui. Fusce",2,27,30),(12,"dui augue",14,24,42),(13,"pede. Nunc",17,27,39),(14,"erat vel",20,28,44),(15,"felis purus",9,26,31),(16,"consectetuer adipiscing",12,21,41),(17,"nunc est,",15,22,37),(18,"faucibus id,",15,21,45),(19,"Phasellus nulla.",11,28,50),(20,"diam lorem,",8,26,31);
INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (21,"nulla. Integer",15,24,50),(22,"gravida molestie",20,21,45),(23,"elit, pretium",2,27,38),(24,"vitae, orci.",18,28,48),(25,"Integer sem",1,24,32),(26,"ultrices posuere",14,22,33),(27,"faucibus orci",10,28,36),(28,"convallis in,",4,26,43),(29,"augue malesuada",19,28,46),(30,"elementum purus,",18,28,30);
INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (31,"pede ac",16,28,38),(32,"penatibus et",7,24,43),(33,"mauris sit",6,25,47),(34,"luctus lobortis.",15,28,45),(35,"sapien imperdiet",17,22,33),(36,"lectus quis",6,25,39),(37,"turpis egestas.",13,25,31),(38,"libero. Integer",5,25,40),(39,"Sed nulla",2,24,49),(40,"nisl. Nulla",18,27,40);
INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (41,"vitae sodales",19,22,39),(42,"magna. Nam",15,25,31),(43,"eu, ligula.",5,27,42),(44,"in faucibus",9,26,38),(45,"ornare. In",6,21,44),(46,"iaculis enim,",4,22,39),(47,"luctus et",5,24,36),(48,"eget massa.",4,27,41),(49,"vestibulum. Mauris",9,27,44),(50,"lacus. Mauris",4,22,33);
INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (51,"vel arcu",14,26,33),(52,"molestie sodales.",2,26,41),(53,"et magnis",7,23,33),(54,"et, euismod",17,22,36),(55,"ullamcorper magna.",20,28,40),(56,"non justo.",12,24,30),(57,"Sed nunc",13,25,47),(58,"nec, cursus",5,25,42),(59,"nisl. Nulla",1,27,45),(60,"amet risus.",2,27,44);
INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (61,"sem ut",3,24,31),(62,"nisl. Nulla",6,26,34),(63,"non leo.",8,28,32),(64,"id magna",10,21,44),(65,"urna convallis",17,26,34),(66,"at risus.",18,21,32),(67,"magna a",7,28,35),(68,"cubilia Curae;",8,21,32),(69,"consequat enim",17,21,47),(70,"Donec consectetuer",2,25,47);
INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (71,"nec ante.",15,28,42),(72,"Sed id",14,25,33),(73,"mi. Duis",4,22,30),(74,"a, scelerisque",13,23,38),(75,"urna suscipit",14,25,47),(76,"amet luctus",17,27,41),(77,"convallis in,",2,25,41),(78,"ac metus",18,24,44),(79,"congue. In",4,24,33),(80,"ligula. Aenean",20,23,45);
INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (81,"id ante",7,28,32),(82,"ornare lectus",20,24,34),(83,"In ornare",12,27,38),(84,"semper auctor.",8,21,39),(85,"metus facilisis",10,22,37),(86,"sit amet",10,22,44),(87,"eget lacus.",14,23,39),(88,"hendrerit. Donec",10,28,37),(89,"Aenean eget",10,24,32),(90,"dis parturient",9,28,39);
INSERT INTO `MatchGame` (`id_match`,`name_match`,`id_selection_interieur`,`id_saison`,`id_selection_exterieur`) VALUES (91,"massa. Integer",15,25,43),(92,"orci luctus",2,25,50),(93,"tellus. Nunc",17,28,47),(94,"Quisque porttitor",9,25,41),(95,"Duis cursus,",19,26,44),(96,"elit. Nulla",13,23,35),(97,"Nullam suscipit,",18,28,45),(98,"lobortis mauris.",8,28,32),(99,"ut eros",20,21,40),(100,"Duis cursus,",9,23,41);



#------------------------------------------------------------
# Table: Attribut
#------------------------------------------------------------

CREATE TABLE Attribut(
        id_attribut   int (11) Auto_increment  NOT NULL ,
        name_attribut Varchar (25) ,
        PRIMARY KEY (id_attribut )
)ENGINE=InnoDB;


INSERT INTO Attribut VALUES (1,'reflexes'), (2,'communication'), (3,'concentration'), (4,'agilité'), (5,'tacles'), (6,'tête'), (7,'détermination'), (8,'sang_froid'), (9,'placement'), (10,'courage'), (11,'marquage'), (12,'endurance'), (13,'vitesse'), (14,'passes'), (15,'accélération'), (16,'finition'), (17,'appels balle'), (18,'dribble'), (19,'puissance'), (20,'contrôle de balle'), (21,'technique');




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

INSERT INTO `Saison` (`id_saison`,`name`) VALUES (21,"amet ante."),(49,"Proin vel"),(77,"arcu et"),(105,"augue scelerisque"),(133,"Suspendisse ac"),(161,"nostra, per"),(189,"imperdiet ullamcorper."),(217,"augue scelerisque"),(245,"pede ac"),(273,"velit. Pellentesque");
INSERT INTO `Saison` (`id_saison`,`name`) VALUES (301,"volutpat ornare,"),(329,"tempus risus."),(357,"euismod ac,"),(385,"Integer sem"),(413,"Cras dictum"),(441,"at auctor"),(469,"consequat enim"),(497,"est. Mauris"),(525,"consequat purus."),(553,"magnis dis");
INSERT INTO `Saison` (`id_saison`,`name`) VALUES (581,"nec, cursus"),(609,"magna sed"),(637,"Duis a"),(665,"diam lorem,"),(693,"est. Nunc"),(721,"vehicula et,"),(749,"arcu vel"),(777,"amet ante."),(805,"Quisque libero"),(833,"lobortis tellus");
INSERT INTO `Saison` (`id_saison`,`name`) VALUES (861,"molestie tortor"),(889,"ultrices. Duis"),(917,"massa. Suspendisse"),(945,"fringilla. Donec"),(973,"lobortis quam"),(1001,"vitae, aliquet"),(1029,"arcu. Vivamus"),(1057,"velit. Sed"),(1085,"lobortis risus."),(1113,"turpis non");
INSERT INTO `Saison` (`id_saison`,`name`) VALUES (1141,"arcu. Sed"),(1169,"at pretium"),(1197,"magna et"),(1225,"nibh lacinia"),(1253,"ante. Nunc"),(1281,"dui. Cras"),(1309,"ipsum ac"),(1337,"malesuada ut,"),(1365,"ut aliquam"),(1393,"sagittis. Nullam");
INSERT INTO `Saison` (`id_saison`,`name`) VALUES (1421,"ac nulla."),(1449,"euismod est"),(1477,"leo, in"),(1505,"mattis. Cras"),(1533,"mauris, rhoncus"),(1561,"mi felis,"),(1589,"dictum placerat,"),(1617,"Lorem ipsum"),(1645,"dictum eleifend,"),(1673,"fringilla est.");
INSERT INTO `Saison` (`id_saison`,`name`) VALUES (1701,"tristique pharetra."),(1729,"fermentum vel,"),(1757,"imperdiet non,"),(1785,"ullamcorper viverra."),(1813,"at, iaculis"),(1841,"lobortis. Class"),(1869,"eu lacus."),(1897,"lacus vestibulum"),(1925,"Vivamus euismod"),(1953,"suscipit, est");
INSERT INTO `Saison` (`id_saison`,`name`) VALUES (1981,"nec, leo."),(2009,"eget mollis"),(2037,"convallis est,"),(2065,"Fusce aliquam,"),(2093,"velit. Quisque"),(2121,"pede et"),(2149,"arcu et"),(2177,"Pellentesque ut"),(2205,"Integer tincidunt"),(2233,"Nullam nisl.");
INSERT INTO `Saison` (`id_saison`,`name`) VALUES (2261,"dolor. Nulla"),(2289,"dignissim lacus."),(2317,"egestas, urna"),(2345,"sit amet"),(2373,"nec urna"),(2401,"amet nulla."),(2429,"Sed diam"),(2457,"ipsum. Phasellus"),(2485,"pede. Nunc"),(2513,"libero at");
INSERT INTO `Saison` (`id_saison`,`name`) VALUES (2541,"ac facilisis"),(2569,"diam lorem,"),(2597,"lorem ac"),(2625,"at augue"),(2653,"dictum. Proin"),(2681,"tristique senectus"),(2709,"pede sagittis"),(2737,"habitant morbi"),(2765,"enim consequat"),(2793,"vehicula et,");


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
ALTER TABLE Club ADD CONSTRAINT FK_Club_id_selection FOREIGN KEY (id_selection) REFERENCES Selection(id_selection);

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

