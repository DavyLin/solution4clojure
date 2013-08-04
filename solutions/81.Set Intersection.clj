;Set Intersection
 
;Difficulty:	Easy
;Topics:	set-theory


;Write a function which returns the intersection of two sets. The intersection is the sub-set of items that each set has in common.
;test not run	

(= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3})
test not run	

(= (__ #{0 1 2} #{3 4 5}) #{})
test not run	

(= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})