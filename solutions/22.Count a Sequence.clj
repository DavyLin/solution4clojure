;Write a function which returns the total number of elements in a sequence.
	

(= (__ '(1 2 3 3 1)) 5)
	

(= (__ "Hello World") 11)
	

(= (__ [[1 2] [3 4] [5 6]]) 3)
	

(= (__ '(13)) 1)
	

(= (__ '(:a :b :c)) 3)


;solution:
;; see qiuxiafei's answer
#(loop [result 0 c %]
    (if(empty? c) result
    (recur (inc result) (rest c))))
;; others' excellent anser
#(reduce (fn [x y] (inc x)) 0 %)