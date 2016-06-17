#--SQL Script to create the game's database

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: Lorann
DROP DATABASE IF EXISTS Lorann;
Create DATABASE Lorann;
Use Lorann;

-- --------------------------------------------------------

--
-- Element's structure
--

CREATE TABLE IF NOT EXISTS Element (
          idElement     int(11) NOT NULL AUTO_INCREMENT,
          url           varchar(255) DEFAULT NULL,
          name          varchar(25) DEFAULT NULL,
          PRIMARY KEY (idElement)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- ElementByMap's structure
--

CREATE TABLE IF NOT EXISTS ElementByMap (
        idElementByMap  int(11) NOT NULL AUTO_INCREMENT,
        idElement       int(11) DEFAULT NULL,
        idMap           int(11) DEFAULT NULL,
        x               int(11) DEFAULT NULL,
        y               int(11) DEFAULT NULL,
        PRIMARY KEY (idElementByMap),
        KEY FK_ElementByMap_idElement (idElement),
        KEY FK_ElementByMap_idMap (idMap)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- LorannMap's structure
--

CREATE TABLE IF NOT EXISTS LorannMap (
        idMap       int(11) NOT NULL AUTO_INCREMENT,
        MapName     varchar(25) DEFAULT NULL,
        Width       int(11) DEFAULT NULL,
        Height      int(11) DEFAULT NULL,
        PRIMARY KEY (idMap)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


--
-- Adding constraint
--
ALTER TABLE ElementByMap
  ADD CONSTRAINT FK_ElementByMap_idMap FOREIGN KEY (idMap) REFERENCES LorannMap (idMap),
  ADD CONSTRAINT FK_ElementByMap_idElement FOREIGN KEY (idElement) REFERENCES Element (idElement);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

#---------------------
#--Inserting Maps, elements and elements by map
#---------------------


INSERT INTO Element (idElement, url, name) VALUES
(1, "sprite/floor.png", "Floor"),
(2, "sprite/gate_closed.png", "Door"),
(3, "sprite/bone.png", "CWall"),
(4, "sprite/horizontal_bone.png", "HWall"),
(5, "sprite/vertical_bone.png", "VWall"),
(6, "sprite/crystal_ball.png", "CrystalBubble"),
(7, "sprite/purse.png", "Coins"),
(8, "sprite/monster_1.png", "Monster1"),
(9, "sprite/monster_2.png", "Monster2"),
(10, "sprite/monster_3.png", "Monster3"),
(11, "sprite/monster_4.png", "Monster4"),
(12, "sprite/lorann_u.png", "Lorann");


INSERT INTO LorannMap (idMap, Mapname, Width, Height) VALUES
(1, "Level1", 20, 12),
(2, "Level2", 20, 12),
(3, "Level3", 20, 12),
(4, "Level4", 20, 12),
(5, "Level5", 20, 12);

INSERT INTO ElementByMap (idElement, idMap, x, y) VALUES
#--map1
(1, 1, 0, 0),
(1, 1, 1, 0),
(1, 1, 2, 0),
(1, 1, 3, 0),
(1, 1, 4, 0),
(1, 1, 5, 0),
(3, 1, 6, 0),
(4, 1, 7, 0),
(3, 1, 8, 0),
(4, 1, 9, 0),
(4, 1, 10, 0),
(4, 1, 11, 0),
(4, 1, 12, 0),
(4, 1, 13, 0),
(4, 1, 14, 0),
(4, 1, 15, 0),
(4, 1, 16, 0),
(4, 1, 17, 0),
(3, 1, 18, 0),
(1, 1, 19, 0),
(1, 1, 0, 1),
(1, 1, 1, 1),
(1, 1, 2, 1),
(3, 1, 3, 1),
(4, 1, 4, 1),
(4, 1, 5, 1),
(3, 1, 6, 1),
(7, 1, 7, 1),
(5, 1, 8, 1),
(1, 1, 9, 1),
(1, 1, 10, 1),
(1, 1, 11, 1),
(1, 1, 12, 1),
(1, 1, 13, 1),
(1, 1, 14, 1),
(1, 1, 15, 1),
(1, 1, 16, 1),
(1, 1, 17, 1),
(3, 1, 18, 1),
(3, 1, 19, 1),
(1, 1, 0, 2),
(1, 1, 1, 2),
(3, 1, 2, 2),
(3, 1, 3, 2),
(1, 1, 4, 2),
(1, 1, 5, 2),
(7, 1, 6, 2),
(1, 1, 7, 2),
(5, 1, 8, 2),
(1, 1, 9, 2),
(1, 1, 10, 2),
(1, 1, 11, 2),
(1, 1, 12, 2),
(1, 1, 13, 2),
(1, 1, 14, 2),
(1, 1, 15, 2),
(1, 1, 16, 2),
(1, 1, 17, 2),
(1, 1, 18, 2),
(5, 1, 19, 2),
(3, 1, 0, 3),
(4, 1, 1, 3),
(3, 1, 2, 3),
(1, 1, 3, 3),
(1, 1, 4, 3),
(1, 1, 5, 3),
(1, 1, 6, 3),
(1, 1, 7, 3),
(5, 1, 8, 3),
(1, 1, 9, 3),
(1, 1, 10, 3),
(1, 1, 11, 3),
(7, 1, 12, 3),
(1, 1, 13, 3),
(1, 1, 14, 3),
(1, 1, 15, 3),
(1, 1, 16, 3),
(1, 1, 17, 3),
(1, 1, 18, 3),
(5, 1, 19, 3),
(5, 1, 0, 4),
(1, 1, 1, 4),
(7, 1, 2, 4),
(1, 1, 3, 4),
(3, 1, 4, 4),
(4, 1, 5, 4),
(4, 1, 6, 4),
(4, 1, 7, 4),
(3, 1, 8, 4),
(4, 1, 9, 4),
(4, 1, 10, 4),
(4, 1, 11, 4),
(4, 1, 12, 4),
(4, 1, 13, 4),
(3, 1, 14, 4),
(1, 1, 15, 4),
(1, 1, 16, 4),
(1, 1, 17, 4),
(1, 1, 18, 4),
(3, 1, 19, 4),
(5, 1, 0, 5),
(7, 1, 1, 5),
(1, 1, 2, 5),
(1, 1, 3, 5),
(7, 1, 4, 5),
(8, 1, 5, 5),
(1, 1, 6, 5),
(1, 1, 7, 5),
(1, 1, 8, 5),
(1, 1, 9, 5),
(1, 1, 10, 5),
(1, 1, 11, 5),
(6, 1, 12, 5),
(1, 1, 13, 5),
(1, 1, 14, 5),
(1, 1, 15, 5),
(1, 1, 16, 5),
(12, 1, 17, 5),
(1, 1, 18, 5),
(2, 1, 19, 5),
(5, 1, 0, 6),
(1, 1, 1, 6),
(7, 1, 2, 6),
(1, 1, 3, 6),
(3, 1, 4, 6),
(4, 1, 5, 6),
(4, 1, 6, 6),
(4, 1, 7, 6),
(3, 1, 8, 6),
(4, 1, 9, 6),
(4, 1, 10, 6),
(4, 1, 11, 6),
(4, 1, 12, 6),
(4, 1, 13, 6),
(3, 1, 14, 6),
(1, 1, 15, 6),
(1, 1, 16, 6),
(1, 1, 17, 6),
(1, 1, 18, 6),
(3, 1, 19, 6),
(3, 1, 0, 7),
(4, 1, 1, 7),
(3, 1, 2, 7),
(1, 1, 3, 7),
(1, 1, 4, 7),
(1, 1, 5, 7),
(1, 1, 6, 7),
(1, 1, 7, 7),
(5, 1, 8, 7),
(1, 1, 9, 7),
(1, 1, 10, 7),
(1, 1, 11, 7),
(7, 1, 12, 7),
(1, 1, 13, 7),
(1, 1, 14, 7),
(1, 1, 15, 7),
(1, 1, 16, 7),
(1, 1, 17, 7),
(1, 1, 18, 7),
(5, 1, 19, 7),
(1, 1, 0, 8),
(1, 1, 1, 8),
(3, 1, 2, 8),
(3, 1, 3, 8),
(1, 1, 4, 8),
(1, 1, 5, 8),
(7, 1, 6, 8),
(1, 1, 7, 8),
(5, 1, 8, 8),
(1, 1, 9, 8),
(1, 1, 10, 8),
(1, 1, 11, 8),
(1, 1, 12, 8),
(1, 1, 13, 8),
(1, 1, 14, 8),
(1, 1, 15, 8),
(1, 1, 16, 8),
(1, 1, 17, 8),
(1, 1, 18, 8),
(5, 1, 19, 8),
(1, 1, 0, 9),
(1, 1, 1, 9),
(1, 1, 2, 9),
(3, 1, 3, 9),
(4, 1, 4, 9),
(4, 1, 5, 9),
(3, 1, 6, 9),
(7, 1, 7, 9),
(5, 1, 8, 9),
(1, 1, 9, 9),
(1, 1, 10, 9),
(1, 1, 11, 9),
(1, 1, 12, 9),
(1, 1, 13, 9),
(1, 1, 14, 9),
(1, 1, 15, 9),
(1, 1, 16, 9),
(1, 1, 17, 9),
(3, 1, 18, 9),
(3, 1, 19, 9),
(1, 1, 0, 10),
(1, 1, 1, 10),
(1, 1, 2, 10),
(1, 1, 3, 10),
(1, 1, 4, 10),
(1, 1, 5, 10),
(3, 1, 6, 10),
(4, 1, 7, 10),
(3, 1, 8, 10),
(4, 1, 9, 10),
(4, 1, 10, 10),
(4, 1, 11, 10),
(4, 1, 12, 10),
(4, 1, 13, 10),
(4, 1, 14, 10),
(4, 1, 15, 10),
(4, 1, 16, 10),
(4, 1, 17, 10),
(3, 1, 18, 10),
(1, 1, 19, 10),
(1, 1, 0, 11),
(1, 1, 1, 11),
(1, 1, 2, 11),
(1, 1, 3, 11),
(1, 1, 4, 11),
(1, 1, 5, 11),
(1, 1, 6, 11),
(1, 1, 7, 11),
(1, 1, 8, 11),
(1, 1, 9, 11),
(1, 1, 10, 11),
(1, 1, 11, 11),
(1, 1, 12, 11),
(1, 1, 13, 11),
(1, 1, 14, 11),
(1, 1, 15, 11),
(1, 1, 16, 11),
(1, 1, 17, 11),
(1, 1, 18, 11),
(1, 1, 19, 11),


#--map2
(1, 2, 0, 0),
(1, 2, 1, 0),
(3, 2, 2, 0),
(4, 2, 3, 0),
(4, 2, 4, 0),
(4, 2, 5, 0),
(4, 2, 6, 0),
(4, 2, 7, 0),
(4, 2, 8, 0),
(4, 2, 9, 0),
(4, 2, 10, 0),
(4, 2, 11, 0),
(4, 2, 12, 0),
(3, 2, 13, 0),
(1, 2, 14, 0),
(1, 2, 15, 0),
(1, 2, 16, 0),
(3, 2, 17, 0),
(4, 2, 18, 0),
(3, 2, 19, 0),
(3, 2, 0, 1),
(4, 2, 1, 1),
(3, 2, 2, 1),
(1, 2, 3, 1),
(1, 2, 4, 1),
(1, 2, 5, 1),
(1, 2, 6, 1),
(1, 2, 7, 1),
(1, 2, 8, 1),
(1, 2, 9, 1),
(1, 2, 10, 1),
(1, 2, 11, 1),
(1, 2, 12, 1),
(5, 2, 13, 1),
(1, 2, 14, 1),
(1, 2, 15, 1),
(1, 2, 16, 1),
(5, 2, 17, 1),
(6, 2, 18, 1),
(5, 2, 19, 1),
(5, 2, 0, 2),
(2, 2, 1, 2),
(5, 2, 2, 2),
(1, 2, 3, 2),
(1, 2, 4, 2),
(3, 2, 5, 2),
(4, 2, 6, 2),
(3, 2, 7, 2),
(1, 2, 8, 2),
(1, 2, 9, 2),
(1, 2, 10, 2),
(1, 2, 11, 2),
(1, 2, 12, 2),
(3, 2, 13, 2),
(4, 2, 14, 2),
(4, 2, 15, 2),
(4, 2, 16, 2),
(3, 2, 17, 2),
(1, 2, 18, 2),
(5, 2, 19, 2),
(5, 2, 0, 3),
(1, 2, 1, 3),
(5, 2, 2, 3),
(1, 2, 3, 3),
(1, 2, 4, 3),
(1, 2, 5, 3),
(7, 2, 6, 3),
(5, 2, 7, 3),
(1, 2, 8, 3),
(1, 2, 9, 3),
(1, 2, 10, 3),
(1, 2, 11, 3),
(1, 2, 12, 3),
(1, 2, 13, 3),
(8, 2, 14, 3),
(1, 2, 15, 3),
(1, 2, 16, 3),
(1, 2, 17, 3),
(1, 2, 18, 3),
(5, 2, 19, 3),
(5, 2, 0, 4),
(1, 2, 1, 4),
(3, 2, 2, 4),
(4, 2, 3, 4),
(4, 2, 4, 4),
(4, 2, 5, 4),
(4, 2, 6, 4),
(3, 2, 7, 4),
(7, 2, 8, 4),
(3, 2, 9, 4),
(4, 2, 10, 4),
(3, 2, 11, 4),
(7, 2, 12, 4),
(3, 2, 13, 4),
(4, 2, 14, 4),
(4, 2, 15, 4),
(4, 2, 16, 4),
(4, 2, 17, 4),
(4, 2, 18, 4),
(3, 2, 19, 4),
(5, 2, 0, 5),
(1, 2, 1, 5),
(1, 2, 2, 5),
(1, 2, 3, 5),
(1, 2, 4, 5),
(1, 2, 5, 5),
(1, 2, 6, 5),
(1, 2, 7, 5),
(1, 2, 8, 5),
(1, 2, 9, 5),
(1, 2, 10, 5),
(1, 2, 11, 5),
(1, 2, 12, 5),
(1, 2, 13, 5),
(1, 2, 14, 5),
(1, 2, 15, 5),
(1, 2, 16, 5),
(1, 2, 17, 5),
(12, 2, 18, 5),
(5, 2, 19, 5),
(5, 2, 0, 6),
(1, 2, 1, 6),
(1, 2, 2, 6),
(1, 2, 3, 6),
(3, 2, 4, 6),
(1, 2, 5, 6),
(1, 2, 6, 6),
(3, 2, 7, 6),
(1, 2, 8, 6),
(1, 2, 9, 6),
(1, 2, 10, 6),
(1, 2, 11, 6),
(1, 2, 12, 6),
(1, 2, 13, 6),
(1, 2, 14, 6),
(1, 2, 15, 6),
(1, 2, 16, 6),
(1, 2, 17, 6),
(1, 2, 18, 6),
(5, 2, 19, 6),
(3, 2, 0, 7),
(4, 2, 1, 7),
(4, 2, 2, 7),
(3, 2, 3, 7),
(1, 2, 4, 7),
(3, 2, 5, 7),
(3, 2, 6, 7),
(1, 2, 7, 7),
(3, 2, 8, 7),
(1, 2, 9, 7),
(1, 2, 10, 7),
(1, 2, 11, 7),
(1, 2, 12, 7),
(1, 2, 13, 7),
(3, 2, 14, 7),
(7, 2, 15, 7),
(4, 2, 16, 7),
(4, 2, 17, 7),
(4, 2, 18, 7),
(3, 2, 19, 7),
(5, 2, 0, 8),
(1, 2, 1, 8),
(1, 2, 2, 8),
(1, 2, 3, 8),
(3, 2, 4, 8),
(7, 2, 5, 8),
(3, 2, 6, 8),
(1, 2, 7, 8),
(1, 2, 8, 8),
(1, 2, 9, 8),
(1, 2, 10, 8),
(1, 2, 11, 8),
(1, 2, 12, 8),
(1, 2, 13, 8),
(5, 2, 14, 8),
(1, 2, 15, 8),
(1, 2, 16, 8),
(1, 2, 17, 8),
(1, 2, 18, 8),
(5, 2, 19, 8),
(5, 2, 0, 9),
(11, 2, 1, 9),
(1, 2, 2, 9),
(1, 2, 3, 9),
(1, 2, 4, 9),
(1, 2, 5, 9),
(1, 2, 6, 9),
(1, 2, 7, 9),
(1, 2, 8, 9),
(1, 2, 9, 9),
(1, 2, 10, 9),
(1, 2, 11, 9),
(1, 2, 12, 9),
(1, 2, 13, 9),
(5, 2, 14, 9),
(1, 2, 15, 9),
(1, 2, 16, 9),
(9, 2, 17, 9),
(1, 2, 18, 9),
(5, 2, 19, 9),
(5, 2, 0, 10),
(1, 2, 1, 10),
(1, 2, 2, 10),
(1, 2, 3, 10),
(1, 2, 4, 10),
(1, 2, 5, 10),
(1, 2, 6, 10),
(1, 2, 7, 10),
(1, 2, 8, 10),
(1, 2, 9, 10),
(1, 2, 10, 10),
(1, 2, 11, 10),
(1, 2, 12, 10),
(1, 2, 13, 10),
(5, 2, 14, 10),
(1, 2, 15, 10),
(1, 2, 16, 10),
(1, 2, 17, 10),
(1, 2, 18, 10),
(5, 2, 19, 10),
(3, 2, 0, 11),
(4, 2, 1, 11),
(4, 2, 2, 11),
(4, 2, 3, 11),
(4, 2, 4, 11),
(4, 2, 5, 11),
(4, 2, 6, 11),
(4, 2, 7, 11),
(4, 2, 8, 11),
(4, 2, 9, 11),
(4, 2, 10, 11),
(4, 2, 11, 11),
(4, 2, 12, 11),
(4, 2, 13, 11),
(3, 2, 14, 11),
(4, 2, 15, 11),
(4, 2, 16, 11),
(4, 2, 17, 11),
(4, 2, 18, 11),
(3, 2, 19, 11),


#--map3
(3, 3, 0, 0),
(4, 3, 1, 0),
(4, 3, 2, 0),
(4, 3, 3, 0),
(4, 3, 4, 0),
(4, 3, 5, 0),
(4, 3, 6, 0),
(4, 3, 7, 0),
(4, 3, 8, 0),
(4, 3, 9, 0),
(4, 3, 10, 0),
(4, 3, 11, 0),
(4, 3, 12, 0),
(4, 3, 13, 0),
(4, 3, 14, 0),
(4, 3, 15, 0),
(4, 3, 16, 0),
(4, 3, 17, 0),
(4, 3, 18, 0),
(3, 3, 19, 0),
(5, 3, 0, 1),
(1, 3, 1, 1),
(1, 3, 2, 1),
(1, 3, 3, 1),
(1, 3, 4, 1),
(7, 3, 5, 1),
(1, 3, 6, 1),
(1, 3, 7, 1),
(1, 3, 8, 1),
(1, 3, 9, 1),
(1, 3, 10, 1),
(7, 3, 11, 1),
(1, 3, 12, 1),
(1, 3, 13, 1),
(1, 3, 14, 1),
(1, 3, 15, 1),
(1, 3, 16, 1),
(1, 3, 17, 1),
(7, 3, 18, 1),
(5, 3, 19, 1),
(5, 3, 0, 2),
(1, 3, 1, 2),
(1, 3, 2, 2),
(3, 3, 3, 2),
(4, 3, 4, 2),
(4, 3, 5, 2),
(4, 3, 6, 2),
(3, 3, 7, 2),
(1, 3, 8, 2),
(3, 3, 9, 2),
(4, 3, 10, 2),
(3, 3, 11, 2),
(7, 3, 12, 2),
(1, 3, 13, 2),
(3, 3, 14, 2),
(4, 3, 15, 2),
(4, 3, 16, 2),
(3, 3, 17, 2),
(1, 3, 18, 2),
(5, 3, 19, 2),
(5, 3, 0, 3),
(1, 3, 1, 3),
(1, 3, 2, 3),
(5, 3, 3, 3),
(1, 3, 4, 3),
(3, 3, 5, 3),
(4, 3, 6, 3),
(3, 3, 7, 3),
(1, 3, 8, 3),
(3, 3, 9, 3),
(3, 3, 10, 3),
(1, 3, 11, 3),
(3, 3, 12, 3),
(1, 3, 13, 3),
(3, 3, 14, 3),
(1, 3, 15, 3),
(1, 3, 16, 3),
(1, 3, 17, 3),
(1, 3, 18, 3),
(5, 3, 19, 3),
(5, 3, 0, 4),
(1, 3, 1, 4),
(1, 3, 2, 4),
(5, 3, 3, 4),
(1, 3, 4, 4),
(5, 3, 5, 4),
(7, 3, 6, 4),
(1, 3, 7, 4),
(1, 3, 8, 4),
(1, 3, 9, 4),
(5, 3, 10, 4),
(1, 3, 11, 4),
(5, 3, 12, 4),
(1, 3, 13, 4),
(5, 3, 14, 4),
(1, 3, 15, 4),
(1, 3, 16, 4),
(1, 3, 17, 4),
(1, 3, 18, 4),
(5, 3, 19, 4),
(5, 3, 0, 5),
(1, 3, 1, 5),
(1, 3, 2, 5),
(5, 3, 3, 5),
(1, 3, 4, 5),
(5, 3, 5, 5),
(1, 3, 6, 5),
(1, 3, 7, 5),
(1, 3, 8, 5),
(1, 3, 9, 5),
(5, 3, 10, 5),
(1, 3, 11, 5),
(5, 3, 12, 5),
(1, 3, 13, 5),
(5, 3, 14, 5),
(1, 3, 15, 5),
(1, 3, 16, 5),
(1, 3, 17, 5),
(1, 3, 18, 5),
(5, 3, 19, 5),
(3, 3, 0, 6),
(3, 3, 1, 6),
(1, 3, 2, 6),
(3, 3, 3, 6),
(3, 3, 4, 6),
(5, 3, 5, 6),
(1, 3, 6, 6),
(1, 3, 7, 6),
(1, 3, 8, 6),
(1, 3, 9, 6),
(3, 3, 10, 6),
(4, 3, 11, 6),
(3, 3, 12, 6),
(1, 3, 13, 6),
(3, 3, 14, 6),
(4, 3, 15, 6),
(3, 3, 16, 6),
(1, 3, 17, 6),
(1, 3, 18, 6),
(5, 3, 19, 6),
(5, 3, 0, 7),
(8, 3, 1, 7),
(1, 3, 2, 7),
(9, 3, 3, 7),
(5, 3, 4, 7),
(5, 3, 5, 7),
(1, 3, 6, 7),
(1, 3, 7, 7),
(1, 3, 8, 7),
(7, 3, 9, 7),
(5, 3, 10, 7),
(1, 3, 11, 7),
(1, 3, 12, 7),
(1, 3, 13, 7),
(1, 3, 14, 7),
(1, 3, 15, 7),
(5, 3, 16, 7),
(1, 3, 17, 7),
(1, 3, 18, 7),
(5, 3, 19, 7),
(5, 3, 0, 8),
(1, 3, 1, 8),
(6, 3, 2, 8),
(1, 3, 3, 8),
(5, 3, 4, 8),
(3, 3, 5, 8),
(4, 3, 6, 8),
(4, 3, 7, 8),
(4, 3, 8, 8),
(4, 3, 9, 8),
(3, 3, 10, 8),
(1, 3, 11, 8),
(1, 3, 12, 8),
(2, 3, 13, 8),
(1, 3, 14, 8),
(1, 3, 15, 8),
(5, 3, 16, 8),
(1, 3, 17, 8),
(1, 3, 18, 8),
(5, 3, 19, 8),
(5, 3, 0, 9),
(1, 3, 1, 9),
(1, 3, 2, 9),
(1, 3, 3, 9),
(5, 3, 4, 9),
(1, 3, 5, 9),
(1, 3, 6, 9),
(1, 3, 7, 9),
(1, 3, 8, 9),
(1, 3, 9, 9),
(5, 3, 10, 9),
(1, 3, 11, 9),
(1, 3, 12, 9),
(1, 3, 13, 9),
(1, 3, 14, 9),
(1, 3, 15, 9),
(5, 3, 16, 9),
(1, 3, 17, 9),
(1, 3, 18, 9),
(5, 3, 19, 9),
(5, 3, 0, 10),
(10, 3, 1, 10),
(1, 3, 2, 10),
(11, 3, 3, 10),
(5, 3, 4, 10),
(1, 3, 5, 10),
(1, 3, 6, 10),
(1, 3, 7, 10),
(1, 3, 8, 10),
(1, 3, 9, 10),
(5, 3, 10, 10),
(1, 3, 11, 10),
(1, 3, 12, 10),
(1, 3, 13, 10),
(1, 3, 14, 10),
(1, 3, 15, 10),
(5, 3, 16, 10),
(12, 3, 17, 10),
(1, 3, 18, 10),
(5, 3, 19, 10),
(3, 3, 0, 11),
(4, 3, 1, 11),
(4, 3, 2, 11),
(4, 3, 3, 11),
(3, 3, 4, 11),
(4, 3, 5, 11),
(4, 3, 6, 11),
(4, 3, 7, 11),
(4, 3, 8, 11),
(4, 3, 9, 11),
(3, 3, 10, 11),
(4, 3, 11, 11),
(4, 3, 12, 11),
(4, 3, 13, 11),
(4, 3, 14, 11),
(4, 3, 15, 11),
(3, 3, 16, 11),
(4, 3, 17, 11),
(4, 3, 18, 11),
(3, 3, 19, 11),


#--map4
(1, 4, 0, 0),
(1, 4, 1, 0),
(1, 4, 2, 0),
(1, 4, 3, 0),
(1, 4, 4, 0),
(1, 4, 5, 0),
(3, 4, 6, 0),
(4, 4, 7, 0),
(3, 4, 8, 0),
(1, 4, 9, 0),
(1, 4, 10, 0),
(1, 4, 11, 0),
(1, 4, 12, 0),
(1, 4, 13, 0),
(1, 4, 14, 0),
(1, 4, 15, 0),
(1, 4, 16, 0),
(1, 4, 17, 0),
(1, 4, 18, 0),
(1, 4, 19, 0),
(1, 4, 0, 1),
(1, 4, 1, 1),
(1, 4, 2, 1),
(1, 4, 3, 1),
(1, 4, 4, 1),
(1, 4, 5, 1),
(5, 4, 6, 1),
(7, 4, 7, 1),
(5, 4, 8, 1),
(1, 4, 9, 1),
(1, 4, 10, 1),
(1, 4, 11, 1),
(1, 4, 12, 1),
(1, 4, 13, 1),
(1, 4, 14, 1),
(1, 4, 15, 1),
(1, 4, 16, 1),
(1, 4, 17, 1),
(1, 4, 18, 1),
(1, 4, 19, 1),
(3, 4, 0, 2),
(4, 4, 1, 2),
(4, 4, 2, 2),
(4, 4, 3, 2),
(4, 4, 4, 2),
(4, 4, 5, 2),
(3, 4, 6, 2),
(1, 4, 7, 2),
(5, 4, 8, 2),
(3, 4, 9, 2),
(4, 4, 10, 2),
(3, 4, 11, 2),
(1, 4, 12, 2),
(1, 4, 13, 2),
(1, 4, 14, 2),
(1, 4, 15, 2),
(1, 4, 16, 2),
(1, 4, 17, 2),
(1, 4, 18, 2),
(1, 4, 19, 2),
(5, 4, 0, 3),
(8, 4, 1, 3),
(1, 4, 2, 3),
(1, 4, 3, 3),
(1, 4, 4, 3),
(1, 4, 5, 3),
(1, 4, 6, 3),
(1, 4, 7, 3),
(3, 4, 8, 3),
(3, 4, 9, 3),
(12, 4, 10, 3),
(3, 4, 11, 3),
(4, 4, 12, 3),
(3, 4, 13, 3),
(4, 4, 14, 3),
(3, 4, 15, 3),
(1, 4, 16, 3),
(1, 4, 17, 3),
(1, 4, 18, 3),
(1, 4, 19, 3),
(5, 4, 0, 4),
(1, 4, 1, 4),
(1, 4, 2, 4),
(1, 4, 3, 4),
(1, 4, 4, 4),
(1, 4, 5, 4),
(1, 4, 6, 4),
(1, 4, 7, 4),
(1, 4, 8, 4),
(1, 4, 9, 4),
(1, 4, 10, 4),
(1, 4, 11, 4),
(1, 4, 12, 4),
(5, 4, 13, 4),
(6, 4, 14, 4),
(5, 4, 15, 4),
(1, 4, 16, 4),
(1, 4, 17, 4),
(1, 4, 18, 4),
(1, 4, 19, 4),
(5, 4, 0, 5),
(1, 4, 1, 5),
(7, 4, 2, 5),
(1, 4, 3, 5),
(1, 4, 4, 5),
(1, 4, 5, 5),
(1, 4, 6, 5),
(1, 4, 7, 5),
(1, 4, 8, 5),
(1, 4, 9, 5),
(1, 4, 10, 5),
(1, 4, 11, 5),
(1, 4, 12, 5),
(5, 4, 13, 5),
(1, 4, 14, 5),
(5, 4, 15, 5),
(1, 4, 16, 5),
(1, 4, 17, 5),
(1, 4, 18, 5),
(1, 4, 19, 5),
(3, 4, 0, 6),
(4, 4, 1, 6),
(4, 4, 2, 6),
(3, 4, 3, 6),
(1, 4, 4, 6),
(1, 4, 5, 6),
(7, 4, 6, 6),
(1, 4, 7, 6),
(1, 4, 8, 6),
(1, 4, 9, 6),
(1, 4, 10, 6),
(1, 4, 11, 6),
(2, 4, 12, 6),
(5, 4, 13, 6),
(1, 4, 14, 6),
(3, 4, 15, 6),
(4, 4, 16, 6),
(4, 4, 17, 6),
(4, 4, 18, 6),
(3, 4, 19, 6),
(5, 4, 0, 7),
(1, 4, 1, 7),
(10, 4, 2, 7),
(5, 4, 3, 7),
(1, 4, 4, 7),
(1, 4, 5, 7),
(1, 4, 6, 7),
(1, 4, 7, 7),
(1, 4, 8, 7),
(1, 4, 9, 7),
(3, 4, 10, 7),
(4, 4, 11, 7),
(4, 4, 12, 7),
(3, 4, 13, 7),
(1, 4, 14, 7),
(5, 4, 15, 7),
(7, 4, 16, 7),
(1, 4, 17, 7),
(9, 4, 18, 7),
(5, 4, 19, 7),
(5, 4, 0, 8),
(1, 4, 1, 8),
(3, 4, 2, 8),
(3, 4, 3, 8),
(1, 4, 4, 8),
(1, 4, 5, 8),
(1, 4, 6, 8),
(1, 4, 7, 8),
(1, 4, 8, 8),
(1, 4, 9, 8),
(5, 4, 10, 8),
(1, 4, 11, 8),
(11, 4, 12, 8),
(1, 4, 13, 8),
(1, 4, 14, 8),
(5, 4, 15, 8),
(1, 4, 16, 8),
(1, 4, 17, 8),
(1, 4, 18, 8),
(5, 4, 19, 8),
(5, 4, 0, 9),
(1, 4, 1, 9),
(1, 4, 2, 9),
(1, 4, 3, 9),
(1, 4, 4, 9),
(1, 4, 5, 9),
(1, 4, 6, 9),
(1, 4, 7, 9),
(1, 4, 8, 9),
(1, 4, 9, 9),
(3, 4, 10, 9),
(1, 4, 11, 9),
(1, 4, 12, 9),
(1, 4, 13, 9),
(1, 4, 14, 9),
(3, 4, 15, 9),
(4, 4, 16, 9),
(3, 4, 17, 9),
(1, 4, 18, 9),
(5, 4, 19, 9),
(5, 4, 0, 10),
(1, 4, 1, 10),
(1, 4, 2, 10),
(1, 4, 3, 10),
(1, 4, 4, 10),
(1, 4, 5, 10),
(1, 4, 6, 10),
(1, 4, 7, 10),
(1, 4, 8, 10),
(1, 4, 9, 10),
(7, 4, 10, 10),
(1, 4, 11, 10),
(1, 4, 12, 10),
(1, 4, 13, 10),
(1, 4, 14, 10),
(1, 4, 15, 10),
(1, 4, 16, 10),
(1, 4, 17, 10),
(1, 4, 18, 10),
(5, 4, 19, 10),
(3, 4, 0, 11),
(4, 4, 1, 11),
(4, 4, 2, 11),
(4, 4, 3, 11),
(4, 4, 4, 11),
(4, 4, 5, 11),
(4, 4, 6, 11),
(4, 4, 7, 11),
(4, 4, 8, 11),
(4, 4, 9, 11),
(4, 4, 10, 11),
(4, 4, 11, 11),
(4, 4, 12, 11),
(4, 4, 13, 11),
(4, 4, 14, 11),
(4, 4, 15, 11),
(4, 4, 16, 11),
(4, 4, 17, 11),
(4, 4, 18, 11),
(3, 4, 19, 11),


#--map5
(3, 5, 0, 0),
(4, 5, 1, 0),
(4, 5, 2, 0),
(4, 5, 3, 0),
(3, 5, 4, 0),
(1, 5, 5, 0),
(1, 5, 6, 0),
(1, 5, 7, 0),
(3, 5, 8, 0),
(4, 5, 9, 0),
(4, 5, 10, 0),
(4, 5, 11, 0),
(4, 5, 12, 0),
(4, 5, 13, 0),
(3, 5, 14, 0),
(1, 5, 15, 0),
(1, 5, 16, 0),
(1, 5, 17, 0),
(1, 5, 18, 0),
(1, 5, 19, 0),
(5, 5, 0, 1),
(2, 5, 1, 1),
(1, 5, 2, 1),
(1, 5, 3, 1),
(5, 5, 4, 1),
(1, 5, 5, 1),
(3, 5, 6, 1),
(4, 5, 7, 1),
(3, 5, 8, 1),
(1, 5, 9, 1),
(1, 5, 10, 1),
(1, 5, 11, 1),
(1, 5, 12, 1),
(10, 5, 13, 1),
(5, 5, 14, 1),
(1, 5, 15, 1),
(1, 5, 16, 1),
(1, 5, 17, 1),
(1, 5, 18, 1),
(1, 5, 19, 1),
(5, 5, 0, 2),
(1, 5, 1, 2),
(1, 5, 2, 2),
(1, 5, 3, 2),
(3, 5, 4, 2),
(4, 5, 5, 2),
(3, 5, 6, 2),
(1, 5, 7, 2),
(1, 5, 8, 2),
(1, 5, 9, 2),
(3, 5, 10, 2),
(4, 5, 11, 2),
(3, 5, 12, 2),
(1, 5, 13, 2),
(3, 5, 14, 2),
(4, 5, 15, 2),
(3, 5, 16, 2),
(1, 5, 17, 2),
(1, 5, 18, 2),
(1, 5, 19, 2),
(3, 5, 0, 3),
(3, 5, 1, 3),
(1, 5, 2, 3),
(1, 5, 3, 3),
(1, 5, 4, 3),
(1, 5, 5, 3),
(1, 5, 6, 3),
(1, 5, 7, 3),
(11, 5, 8, 3),
(7, 5, 9, 3),
(5, 5, 10, 3),
(1, 5, 11, 3),
(5, 5, 12, 3),
(1, 5, 13, 3),
(1, 5, 14, 3),
(1, 5, 15, 3),
(3, 5, 16, 3),
(4, 5, 17, 3),
(4, 5, 18, 3),
(3, 5, 19, 3),
(1, 5, 0, 4),
(3, 5, 1, 4),
(4, 5, 2, 4),
(4, 5, 3, 4),
(4, 5, 4, 4),
(4, 5, 5, 4),
(4, 5, 6, 4),
(4, 5, 7, 4),
(4, 5, 8, 4),
(4, 5, 9, 4),
(3, 5, 10, 4),
(1, 5, 11, 4),
(5, 5, 12, 4),
(1, 5, 13, 4),
(1, 5, 14, 4),
(1, 5, 15, 4),
(1, 5, 16, 4),
(1, 5, 17, 4),
(1, 5, 18, 4),
(5, 5, 19, 4),
(3, 5, 0, 5),
(3, 5, 1, 5),
(1, 5, 2, 5),
(1, 5, 3, 5),
(1, 5, 4, 5),
(1, 5, 5, 5),
(1, 5, 6, 5),
(1, 5, 7, 5),
(1, 5, 8, 5),
(12, 5, 9, 5),
(1, 5, 10, 5),
(1, 5, 11, 5),
(3, 5, 12, 5),
(4, 5, 13, 5),
(4, 5, 14, 5),
(4, 5, 15, 5),
(3, 5, 16, 5),
(1, 5, 17, 5),
(1, 5, 18, 5),
(5, 5, 19, 5),
(5, 5, 0, 6),
(7, 5, 1, 6),
(7, 5, 2, 6),
(7, 5, 3, 6),
(1, 5, 4, 6),
(3, 5, 5, 6),
(4, 5, 6, 6),
(4, 5, 7, 6),
(4, 5, 8, 6),
(3, 5, 9, 6),
(1, 5, 10, 6),
(3, 5, 11, 6),
(4, 5, 12, 6),
(4, 5, 13, 6),
(4, 5, 14, 6),
(4, 5, 15, 6),
(3, 5, 16, 6),
(1, 5, 17, 6),
(1, 5, 18, 6),
(5, 5, 19, 6),
(5, 5, 0, 7),
(7, 5, 1, 7),
(7, 5, 2, 7),
(7, 5, 3, 7),
(1, 5, 4, 7),
(3, 5, 5, 7),
(1, 5, 6, 7),
(1, 5, 7, 7),
(1, 5, 8, 7),
(5, 5, 9, 7),
(1, 5, 10, 7),
(5, 5, 11, 7),
(6, 5, 12, 7),
(1, 5, 13, 7),
(1, 5, 14, 7),
(1, 5, 15, 7),
(1, 5, 16, 7),
(1, 5, 17, 7),
(3, 5, 18, 7),
(3, 5, 19, 7),
(3, 5, 0, 8),
(4, 5, 1, 8),
(4, 5, 2, 8),
(3, 5, 3, 8),
(1, 5, 4, 8),
(1, 5, 5, 8),
(1, 5, 6, 8),
(1, 5, 7, 8),
(1, 5, 8, 8),
(5, 5, 9, 8),
(7, 5, 10, 8),
(5, 5, 11, 8),
(1, 5, 12, 8),
(9, 5, 13, 8),
(1, 5, 14, 8),
(1, 5, 15, 8),
(3, 5, 16, 8),
(4, 5, 17, 8),
(3, 5, 18, 8),
(1, 5, 19, 8),
(1, 5, 0, 9),
(1, 5, 1, 9),
(1, 5, 2, 9),
(5, 5, 3, 9),
(1, 5, 4, 9),
(1, 5, 5, 9),
(8, 5, 6, 9),
(1, 5, 7, 9),
(1, 5, 8, 9),
(3, 5, 9, 9),
(4, 5, 10, 9),
(3, 5, 11, 9),
(1, 5, 12, 9),
(1, 5, 13, 9),
(1, 5, 14, 9),
(1, 5, 15, 9),
(5, 5, 16, 9),
(1, 5, 17, 9),
(1, 5, 18, 9),
(1, 5, 19, 9),
(1, 5, 0, 10),
(1, 5, 1, 10),
(1, 5, 2, 10),
(3, 5, 3, 10),
(4, 5, 4, 10),
(3, 5, 5, 10),
(1, 5, 6, 10),
(1, 5, 7, 10),
(1, 5, 8, 10),
(1, 5, 9, 10),
(1, 5, 10, 10),
(1, 5, 11, 10),
(1, 5, 12, 10),
(1, 5, 13, 10),
(1, 5, 14, 10),
(1, 5, 15, 10),
(3, 5, 16, 10),
(1, 5, 17, 10),
(1, 5, 18, 10),
(1, 5, 19, 10),
(1, 5, 0, 11),
(1, 5, 1, 11),
(1, 5, 2, 11),
(1, 5, 3, 11),
(1, 5, 4, 11),
(3, 5, 5, 11),
(4, 5, 6, 11),
(4, 5, 7, 11),
(4, 5, 8, 11),
(4, 5, 9, 11),
(4, 5, 10, 11),
(4, 5, 11, 11),
(4, 5, 12, 11),
(4, 5, 13, 11),
(4, 5, 14, 11),
(4, 5, 15, 11),
(3, 5, 16, 11),
(1, 5, 17, 11),
(1, 5, 18, 11),
(1, 5, 19, 11);

#-----------------
#--Creating procedure
#-----------------


DELIMITER |

CREATE PROCEDURE ElementByMap (IN LevelMap INT)
BEGIN

SELECT ElementByMap.idElement, ElementByMap.x, ElementByMap.y, Element.url

FROM ElementByMap JOIN Element ON ElementByMap.idElement = Element.idElement JOIN LorannMap ON ElementByMap.idMap = LorannMap.idMap  

WHERE ElementByMap.idMap = LevelMap ORDER BY ElementByMap.y, ElementByMap.x ASC;

END|
DELIMITER ;