INSERT INTO PUBLIC.USERS(ID, DATETIME, NAME) VALUES
(1, TIMESTAMP WITH TIME ZONE '2018-08-20 18:27:30.915+00', 'Ashutosh'),
(2, TIMESTAMP WITH TIME ZONE '2018-08-20 18:27:30.955+00', 'Ashutosh Sahoo');

INSERT INTO PUBLIC.ADDRESSES(ID, ADDR1, ADDR2, CITY, COUNTRY, ZIP, USER_ID) VALUES
(1, 'addr1', 'addr2', 'city', 'country', 102340, 1),
(2, 'A-167', 'sector-1089', 'noida', 'INDIA', 201301, 1),
(3, 'addr1', 'addr2', 'city', 'country', 102343, 2),
(4, 'HIG-210', 'BJB Nagar', 'BBSR', 'INDIA', 751012, 2);

INSERT INTO PUBLIC.PRODUCTS(ID, ADDED_DATE, COLOR, NAME, PRICE) VALUES
(11197, TIMESTAMP '2014-07-16 14:08:13', 'white', 'tea', 31.5),
(11219, TIMESTAMP '2014-05-16 14:15:21', 'black', 'coffee', 40.5),
(11220, TIMESTAMP '2014-09-16 14:15:21', 'brown', 'tea', 45.5),
(11221, TIMESTAMP '2014-06-16 14:15:21', 'white', 'milk', 31.5);
