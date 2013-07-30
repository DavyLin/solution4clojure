;Split a sequence
 
;Difficulty:	Easy
;Topics:	seqs core-functions

;Write a function which will split a sequence into two parts.
	

(= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
	

(= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
	

(= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])


;the solution: 
#(vector 
       (vec (take %1 %2)) 
       (vec (drop %1 %2)))