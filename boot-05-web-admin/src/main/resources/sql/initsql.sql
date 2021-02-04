-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.4.13-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- 导出 db_account 的数据库结构
CREATE DATABASE IF NOT EXISTS `db_account` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_account`;

-- 导出  表 db_account.account_tbl 结构
CREATE TABLE IF NOT EXISTS `account_tbl` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `user_id` varchar(255) DEFAULT NULL COMMENT '用户id',
    `money` int(11) DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 正在导出表  db_account.account_tbl 的数据：~2 rows (大约)
DELETE FROM `account_tbl`;
/*!40000 ALTER TABLE `account_tbl` DISABLE KEYS */;
INSERT INTO `account_tbl` (`id`, `user_id`, `money`) VALUES
(1, '1001', 9995),
(2, '1002', 10000);
/*!40000 ALTER TABLE `account_tbl` ENABLE KEYS */;

-- 导出  表 db_account.city 结构
CREATE TABLE IF NOT EXISTS `city` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    `state` varchar(255) DEFAULT NULL,
    `country` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- 正在导出表  db_account.city 的数据：~0 rows (大约)
DELETE FROM `city`;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` (`id`, `name`, `state`, `country`) VALUES
(1, 'changsha', 'hunan', 'China'),
(2, 'wuhan', 'hubei', 'China'),
(3, 'zhengzhou', 'henan', 'China'),
(4, 'shijiazhuang', 'hebei', 'China');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
