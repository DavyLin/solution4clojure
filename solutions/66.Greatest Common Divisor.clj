;Greatest Common Divisor
 
;Difficulty:	Easy
;Topics:	


;Given two integers, write a function which returns the greatest common divisor.
;test not run	

(= (__ 2 4) 2)
test not run	

(= (__ 10 5) 5)
test not run	

(= (__ 5 7) 1)
test not run	

(= (__ 1023 858) 33)




;the solution :
(fn [v1 v2]
  (apply max
         (filter #(and (zero? (mod v1 %))
                       (zero? (mod v2 %)))
                 (range 1 (max v1 v2)))))
                 
;the others solution:
(fn [a b]
  (let [get-divisor (fn [n] (into #{}
                              (filter #(zero? (rem n %))
                                      (range 1 (inc n)))
                              ))
        a-divisor (get-divisor a)
        b-divisor (get-divisor b)
        commom-divisor (clojure.set/intersection a-divisor b-divisor)]
    (apply max commom-divisor)))

(fn [x y] (apply max (filter #(= 0 (mod x %) (mod y %)) (range 1 (+ 1 (max (/ x 2) (/ y 2)))))))