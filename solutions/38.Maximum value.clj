;Maximum value
 
;Write a function which takes a variable number of parameters and returns the maximum value.
	

(= (__ 1 8 3 4) 8)
	

(= (__ 30 20) 30)
	

(= (__ 45 67 11) 67)

;the solution : 

(fn max2([x] x)
   ([x y] (if (> x y) x y))  
   ([x y & more] (reduce max2 (max2 x y) more)))