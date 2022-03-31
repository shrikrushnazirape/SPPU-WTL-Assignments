CREATE DATABASE wtlLab;
use wtlLab;
create table ebookshop( 
	book_id varchar(100) not null unique,
    book_title varchar(100) not null, 
    book_author varchar(100) not null, 
    book_price int not null, 
    quantity int not null
	);


insert into ebookshop (book_id, book_title, book_author, book_price, quantity) values 
('1', 'Sabarimala Vijnaanakosham', 'KS Vijayanath', 100, 2),
('2', 'Vahana Masterclass', 'Alfredo Coveli', 352, 1),
('3', 'Right Under Our Nose', 'R. Giridharan', 254, 5),
('4', 'India’s 71-Year Test: The Journey to Triumph in Australia', 'R. Kaushik', 488,5),
('5', 'Making of a General-A Himalayan Echo', 'Lt. Gen. Konsam Himalay Singh', 587,9),
('6', 'Gazing Eastwards: Of Buddhist Monks and Revolutionaries in China, 1957', 'Romila Thapar', 350,5),
('7', 'The Population Myth: Islam, Family Planning and Politics in India', 'S Y Quraishi', 458,9),
('8', 'Unscripted: Conversations on Life and Cinema', 'Vidhu Vinod Chopra and Abhijat Josh', 199,8),
('9', 'The Commonwealth of Cricket', 'Ramachandra Guha', 149,2),
('10', 'Manohar Parrikar-Off the Record', 'Waman Subha Prabhu', 117,8);



