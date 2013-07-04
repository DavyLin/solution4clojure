(= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

;solution: '(5 4 3 2 1)