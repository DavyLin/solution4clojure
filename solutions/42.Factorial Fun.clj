;Write a function which calculates factorials.
	

(= (__ 1) 1)
	

(= (__ 3) 6)
	

(= (__ 5) 120)
	

(= (__ 8) 40320)

;solution: #(reduce * (range 1 (inc %)))