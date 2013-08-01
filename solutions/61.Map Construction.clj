﻿;Map Construction
 
;Difficulty:	Easy
;Topics:	core-functions


;Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;test not run	

(= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
test not run	

(= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
test not run	

(= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})

;the solution : #(into {} (map vector %1 %2))