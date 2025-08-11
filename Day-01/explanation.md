Chessboard Square Color Checker – Java



This program determines whether a given chessboard square is Black or White based on standard chessboard coloring.



Logic Explanation:



\- Chessboard squares alternate colors starting with a1 = Black.

\- Files (a to h) and ranks (1 to 8) are used to identify positions like a1, b2, etc.

\- The color of a square depends on:

&nbsp; - The letter (file) – column

&nbsp; - The number (rank) – row



&nbsp;How it works:



\- Columns a, c, e, g:

&nbsp; - Even-numbered rows → White

&nbsp; - Odd-numbered rows → Black

\- Columns b, d, f, h:

&nbsp; - Even-numbered rows → Black

&nbsp; - Odd-numbered rows → White

&nbsp;Input Format:

\- A 2-character string like a1, h8, c4, etc.



&nbsp;Sample Input \& Output:



Input:  a1 → Output: Black  

Input:  c6 → Output: White  

Input:  f7 → Output: White



