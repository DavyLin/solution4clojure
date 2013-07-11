;Write a function which returns the first X fibonacci numbers.
	

(= (__ 3) '(1 1 2))
	

(= (__ 6) '(1 1 2 3 5 8))
	

(= (__ 8) '(1 1 2 3 5 8 13 21))

;solution: 

#(take % (map last(iterate (fn [[x y]] [y (+ x y)]) [0 1])))

;see the solution at qiuxiafei/4clojure