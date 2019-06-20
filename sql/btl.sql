-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 20, 2019 lúc 11:47 AM
-- Phiên bản máy phục vụ: 10.1.38-MariaDB
-- Phiên bản PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `btl`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listenings_section1`
--

CREATE TABLE `listenings_section1` (
  `id` int(11) NOT NULL,
  `title` varchar(244) COLLATE utf8mb4_unicode_ci NOT NULL,
  `audio` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `suggestion` text COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `listenings_section1`
--

INSERT INTO `listenings_section1` (`id`, `title`, `audio`, `suggestion`) VALUES
(1, '0', 'Test01-part_1.mp3', 'You will hear four statements about a picture, after you must select the one statement that best describes what you see in the picture.'),
(2, '2', '2', ''),
(3, '3', '2', '2');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listenings_section1_answers`
--

CREATE TABLE `listenings_section1_answers` (
  `id` int(11) NOT NULL,
  `answer` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `value` tinyint(4) NOT NULL,
  `listenings_section1_question_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `listenings_section1_answers`
--

INSERT INTO `listenings_section1_answers` (`id`, `answer`, `value`, `listenings_section1_question_id`) VALUES
(1, 'She\'s closing the door', 0, 1),
(2, 'She\'s lying on the sofa', 0, 1),
(3, 'She\'s holding a piece of paper', 1, 1),
(4, 'She\'s writing a letter', 0, 1),
(5, 'There\'s a clock in the tower', 1, 2),
(6, 'There\'s a towel hanging outside', 0, 2),
(7, 'There\'s a person on the balcony', 0, 2),
(8, 'There\'s a watch next to the window', 0, 2),
(9, 'He\'s reading a magazine', 0, 3),
(10, 'He\'s putting up a display case', 0, 3),
(11, 'He\'s getting into a vehicle', 0, 3),
(12, 'He\'s looking at a sign', 1, 3),
(13, 'They\'re working together at a desk', 1, 4),
(14, 'They\'re helping each other move  a computer', 0, 4),
(15, 'They\'re hanging decorations', 0, 4),
(16, 'They\'re arranging some furinture in a room', 0, 4),
(17, 'He\'s parking a car', 0, 5),
(18, 'He\'s pushing a wheelbarrow', 1, 5),
(19, 'He\'s putting air into a tire', 0, 5),
(20, 'He\'s stacking boxes', 0, 5),
(21, 'They\'re walking on the path', 0, 6),
(22, 'They\'re cutting the grass', 0, 6),
(23, 'They\'re looking at their maps', 0, 6),
(24, ' They\'re sitting in a circle', 1, 6),
(25, 'He\'s installing bookshelves', 0, 7),
(26, 'He\'s storing his papers in boxes', 0, 7),
(27, 'He\'s taking a volume from shelf', 1, 7),
(28, 'He\'s wrapping a book in paper', 0, 7),
(29, 'Chairs have been stacked in the corner of the room', 0, 8),
(30, 'The silverware is being polished', 0, 8),
(31, 'Water is being poured into the glasses', 0, 8),
(32, 'The table has been set for a meal', 1, 8),
(33, 'He\'s shoveling the snow', 0, 9),
(34, 'He\'s riding on a sled', 0, 9),
(35, 'He\'s zipping up his jacket', 0, 9),
(36, 'He\'s wearing a hat ', 1, 9),
(37, 'A ship is passing under the bridge', 0, 10),
(38, 'Water is flowing out of a pipe', 0, 10),
(39, 'The bridge has many vehicles on it', 0, 10),
(40, 'Some people are standing on the bridge ', 1, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listenings_section1_question`
--

CREATE TABLE `listenings_section1_question` (
  `id` int(11) NOT NULL,
  `listening_section1_id` int(11) NOT NULL,
  `question` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `timeFinish` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `listenings_section1_question`
--

INSERT INTO `listenings_section1_question` (`id`, `listening_section1_id`, `question`, `timeFinish`) VALUES
(1, 1, 'test1-1.png', 10),
(2, 1, 'test1-2.png', 20),
(3, 1, 'test1-3.png', 30),
(4, 1, 'test1-4.png', 40),
(5, 1, 'test1-5.png', 60),
(6, 1, 'test1-6.png', 80),
(7, 1, 'test1-7.png', 100),
(8, 1, 'test1-8.png', 120),
(9, 1, 'test1-9.png', 140),
(10, 1, 'test1-10.png', 160);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listenings_section1_time`
--

CREATE TABLE `listenings_section1_time` (
  `id` int(11) NOT NULL,
  `begin` int(11) NOT NULL,
  `finish` int(11) NOT NULL,
  `listenings_section1_questionId` int(11) NOT NULL,
  `listenings_section1Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `listenings_section1_time`
--

INSERT INTO `listenings_section1_time` (`id`, `begin`, `finish`, `listenings_section1_questionId`, `listenings_section1Id`) VALUES
(1, 1, 10, 1, 1),
(2, 10, 20, 2, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listenings_section2`
--

CREATE TABLE `listenings_section2` (
  `id` int(11) NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `question` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `audio` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `suggestion` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `q1` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `q2` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `q3` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `q4` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `q5` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `listenings_section2`
--

INSERT INTO `listenings_section2` (`id`, `title`, `question`, `audio`, `suggestion`, `q1`, `q2`, `q3`, `q4`, `q5`) VALUES
(1, 'INTERCITY FLOWERS ORDER FORM', '2.06.png', 'Excercise2-06.mp3', 'Complete the form. Write NO MORE THAN THREE WORD/ OR A NUMBER for each answer. The recording is played once only', 'Trelawney', 'IF512WJ3', '31A, Molefield', '0741669861', '43.50'),
(2, 'BRITISH RAIL LOST PROPERTY REPORT FORM', '2.07.png', 'Exercise2-07.mp3', 'Complete the form. Write NO MORE THAN TWO WORD/ OR A NUMBER for each answer. The recording is played once only', 'Lazenby', 'Grover', '8498971PQ', 'red plastic', '3:42'),
(3, 'ZAPTASTIC DRY CLEANER’S', '2.08.png', 'Exercise2-08.mp3', 'Complete the form. Write NO MORE THAN ONE WORD/ OR A NUMBER for each answer. The recording is played once only', '2 shirts', 'Paxman', '42 Zinzan', '073485288', 'fifteenth March'),
(4, 'MESSAGE', '2.09.png', 'Exercise2-09.mp3', 'Complete the form. Write ONE WORD AND / OR A NUMBER for each answer. The recording is played once only', 'Stoole', 'Ms', '763 Barph', '0340647906', '2:00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listenings_section3`
--

CREATE TABLE `listenings_section3` (
  `id` int(11) NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `audio` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `suggestion` text COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `listenings_section3`
--

INSERT INTO `listenings_section3` (`id`, `title`, `audio`, `suggestion`) VALUES
(1, 'Christian and Brenda are in the office', 'Exercise4-01.mp3', 'Listen to the conversation and answer question 1-5. Write NO MORE THAN FOUR WORD/ OR A NUMBER for each answer. The recording is played once only'),
(2, 'A woman speaking to a group', 'Exercise4-03.mp3', 'You will hear a woman speaking to a group and  answer question 1-4. Write NO MORE THAN TWO WORD/ OR A NUMBER for each answer. The recording is played once only'),
(3, 'Football match', 'Exercise4-04.mp3', 'You will hear a conversation and answer question 1-4. Write NO MORE THAN TWO WORD/ OR A NUMBER for each answer. The recording is played once only'),
(4, 'Conversation about Sam', 'Exercise4-05.mp3', 'You will hear a conversation and answer question 1-5. Write NO MORE THAN THREE WORD/ OR A NUMBER for each answer. The recording is played once only');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listenings_section3_question`
--

CREATE TABLE `listenings_section3_question` (
  `id` int(11) NOT NULL,
  `listening_section3_id` int(11) NOT NULL,
  `question` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `answer` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `listenings_section3_question`
--

INSERT INTO `listenings_section3_question` (`id`, `listening_section3_id`, `question`, `answer`) VALUES
(1, 1, 'What time did Christian stop drinking?', '4:00 in the morning'),
(2, 1, 'What was Christian celebrating last night?', 'Jimmy\'s thirtieth birthday'),
(3, 1, 'What has Christian been drinking today?', 'coffe'),
(4, 1, 'What is Christian doing at the Christmas party?', 'playing music'),
(5, 1, 'Which park is the Holeton Hotel close to?', 'Green Park');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listenings_section4_question`
--

CREATE TABLE `listenings_section4_question` (
  `id` int(11) NOT NULL,
  `question` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `answer` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `listenings_section4_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `listenings_section_4`
--

CREATE TABLE `listenings_section_4` (
  `id` int(11) NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `audio` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `suggestion` text COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `readings_part1`
--

CREATE TABLE `readings_part1` (
  `id` int(11) NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `suggestion` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `paragraph` text COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `readings_part1_question`
--

CREATE TABLE `readings_part1_question` (
  `id` int(11) NOT NULL,
  `readings_part1_id` int(11) NOT NULL,
  `question` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `answer` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `readings_part2`
--

CREATE TABLE `readings_part2` (
  `id` int(11) NOT NULL,
  `title` int(11) NOT NULL,
  `suggestion` int(11) NOT NULL,
  `image` int(11) DEFAULT NULL,
  `paragraph` int(11) NOT NULL,
  `q1` int(11) NOT NULL,
  `q2` int(11) NOT NULL,
  `q3` int(11) NOT NULL,
  `q4` int(11) NOT NULL,
  `q5` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `readings_part3`
--

CREATE TABLE `readings_part3` (
  `id` int(11) NOT NULL,
  `title` int(11) NOT NULL,
  `suggestion` int(11) NOT NULL,
  `paragraph` int(11) NOT NULL,
  `box` int(11) NOT NULL,
  `q1` int(11) NOT NULL,
  `q2` int(11) NOT NULL,
  `q3` int(11) NOT NULL,
  `q4` int(11) NOT NULL,
  `q5` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `speakings`
--

CREATE TABLE `speakings` (
  `id` int(11) NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `question` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `sample` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `image` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `test`
--

CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `name` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `test`
--

INSERT INTO `test` (`id`, `name`) VALUES
(1, 'gà quá'),
(2, 'phương nam'),
(3, 'ddang nam'),
(4, 'ddang nam'),
(5, 'Ph??ng Nam'),
(6, 'Ph??ng Nam'),
(7, '??ng Ph??ng Nam 2'),
(8, '??ng 2 Ph??ng Nam 2'),
(9, '??ng 2 Ph??ng Nam 2');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `writings`
--

CREATE TABLE `writings` (
  `id` int(11) NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `question` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `sample` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `image` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `listenings_section1`
--
ALTER TABLE `listenings_section1`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `listenings_section1_answers`
--
ALTER TABLE `listenings_section1_answers`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `listenings_section1_question`
--
ALTER TABLE `listenings_section1_question`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `listenings_section1_time`
--
ALTER TABLE `listenings_section1_time`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `listenings_section2`
--
ALTER TABLE `listenings_section2`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `listenings_section3`
--
ALTER TABLE `listenings_section3`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `listenings_section3_question`
--
ALTER TABLE `listenings_section3_question`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `listenings_section4_question`
--
ALTER TABLE `listenings_section4_question`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `listenings_section_4`
--
ALTER TABLE `listenings_section_4`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `readings_part1`
--
ALTER TABLE `readings_part1`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `readings_part1_question`
--
ALTER TABLE `readings_part1_question`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `readings_part2`
--
ALTER TABLE `readings_part2`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `readings_part3`
--
ALTER TABLE `readings_part3`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `speakings`
--
ALTER TABLE `speakings`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `writings`
--
ALTER TABLE `writings`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `listenings_section1_answers`
--
ALTER TABLE `listenings_section1_answers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT cho bảng `listenings_section1_time`
--
ALTER TABLE `listenings_section1_time`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `listenings_section2`
--
ALTER TABLE `listenings_section2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `listenings_section3`
--
ALTER TABLE `listenings_section3`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `listenings_section3_question`
--
ALTER TABLE `listenings_section3_question`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `listenings_section_4`
--
ALTER TABLE `listenings_section_4`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `test`
--
ALTER TABLE `test`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `writings`
--
ALTER TABLE `writings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
