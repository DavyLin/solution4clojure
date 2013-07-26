;Interpose a Seq
 
;Difficulty:	Easy
;Topics:	seqs core-functions


;Write a function which separates the items of a sequence by an arbitrary value.
	

(= (__ 0 [1 2 3]) [1 0 2 0 3])
	

(= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
	

(= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

;the solution: #(drop 1 (interleave (repeat %1) %2))