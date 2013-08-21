;Write a function which multiplies two numbers and returns the result as a sequence of its digits.
;test not run	

(= (__ 1 1) [1])
test not run	

(= (__ 99 9) [8 9 1])
test not run	

(= (__ 999 99) [9 8 9 0 1])


;the solution:

(fn [a b]
  (map #(Integer/parseInt (str %))  (str (* a b))))

;(fn [x y] (map #(Integer/parseInt (.toString %)) (flatten (partition 1 (str (* x y))))))