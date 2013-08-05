;Write a function which takes a variable number of booleans. Your function should return true if some of the parameters are true, but not all of the parameters are true. Otherwise your function should return false.
;test not run	

(= false (__ false false))
test not run	

(= true (__ true false))
test not run	

(= false (__ true))
test not run	

(= true (__ false true false))
test not run	

(= false (__ true true true))
test not run	

(= true (__ true true true false))



;the solution: 

#(true? 
  (and
    (some true? %&)
    (some false? %&)))