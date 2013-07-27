;Write a function which flattens a sequence.
	

(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
	

(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
	

(= (__ '((((:a))))) '(:a))

;the solution:#(filter (complement sequential?) (tree-seq sequential? identity %))