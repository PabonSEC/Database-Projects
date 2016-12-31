-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 11, 2016 at 09:22 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `billing`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`email`, `password`) VALUES
('Sumaiya', '123'),
('Toma', '123');

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE IF NOT EXISTS `details` (
  `code` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `catagory` varchar(100) NOT NULL,
  `price` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`code`, `name`, `catagory`, `price`) VALUES
('1', 'Peanut Butter', 'Food', '100'),
('2', 'Milk', 'Beverage', '75'),
('3', 'Tea', 'Beverage', '125'),
('4', 'Butter', 'Food', '90'),
('5', 'Butter Nan', 'Food', '30'),
('6', 'Green Tea', 'Beverage', '150'),
('7', 'Chocolate Coffee', 'Drinks', '55'),
('8', 'Beef Burgar', 'Fast Food', '90');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE IF NOT EXISTS `members` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`name`, `email`, `address`, `password`) VALUES
('Pabon', 'pbn93', 'Sylhet', '123'),
('Toufiq', 'as', 'as', '12');

-- --------------------------------------------------------

--
-- Table structure for table `takeorder`
--

CREATE TABLE IF NOT EXISTS `takeorder` (
  `email` varchar(100) NOT NULL,
  `id` varchar(100) NOT NULL,
  `total` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `takeorder`
--

INSERT INTO `takeorder` (`email`, `id`, `total`) VALUES
('pbn93', '2', '225');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
