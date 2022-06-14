--TOTAL_MONEY (BILL)
SELECT BILL_ID, SUM(AMOUNT*SALE_PRICE*(1+ROUND(VAT/100, 2)))
FROM BILL_DETAILS BD, PRODUCT P
WHERE BD.PRODUCT_ID = P.PRODUCT_ID
GROUP BY BILL_ID
ORDER BY BILL_ID;

SELECT BILL_ID, SUM(AMOUNT*SALE_PRICE*(1+VAT/100)*(1-0.05))
FROM BILL_DETAILS BD, PRODUCT P
WHERE BD.PRODUCT_ID = P.PRODUCT_ID
GROUP BY BILL_ID
ORDER BY BILL_ID;

--POINT(STUDENT)
SELECT STUDENT_ID,SUM(TRUNC(TOTAL_MONEY/100000))
FROM BILL
GROUP BY STUDENT_ID
ORDER BY STUDENT_ID;
--SPENT MONEY(STUDENT)
SELECT STUDENT_ID, SUM(TOTAL_MONEY)
FROM BILL
GROUP BY STUDENT_ID
ORDER BY STUDENT_ID;
--REMAINING (PRODUCT)
SELECT P.PRODUCT_ID, IMPORTED_QUANTITY, SUM(AMOUNT), IMPORTED_QUANTITY - SUM(AMOUNT)
FROM PRODUCT P, BILL_DETAILS BD
WHERE P.PRODUCT_ID = BD.PRODUCT_ID
GROUP BY P.PRODUCT_ID,IMPORTED_QUANTITY
ORDER BY P.PRODUCT_ID;
