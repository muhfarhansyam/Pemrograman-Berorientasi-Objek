-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 01 Jun 2021 pada 10.12
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `13020190005`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `jerseyshop`
--

CREATE TABLE `jerseyshop` (
  `no_jersey` varchar(20) NOT NULL,
  `nama_jersey` varchar(50) NOT NULL,
  `merk` varchar(20) NOT NULL,
  `ukuran` varchar(3) NOT NULL,
  `jumlah` varchar(20) NOT NULL,
  `harga_satuan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `jerseyshop`
--

INSERT INTO `jerseyshop` (`no_jersey`, `nama_jersey`, `merk`, `ukuran`, `jumlah`, `harga_satuan`) VALUES
('1FCB', 'Jersey Barca Home', 'Nike', 'L', '10 lembar', '100000');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `jerseyshop`
--
ALTER TABLE `jerseyshop`
  ADD PRIMARY KEY (`no_jersey`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
