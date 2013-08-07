;Re-implement Iterate
 
;Difficulty:	Easy
;Topics:	seqs core-functions


;Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
;test not run	

(= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
test not run	

(= (take 100 (__ inc 0)) (take 100 (range)))
test not run	

(= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

(fn it [f x]
  (lazy-seq (cons x (it f (f x)))))