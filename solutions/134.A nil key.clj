;Write a function which, given a key and map, returns true iff the map contains an entry with that key and its value is nil.
(true?  (__ :a {:a nil :b 2}))
(false? (__ :b {:a nil :b 2}))
(false? (__ :c {:a nil :b 2}))

;solution :

(fn [k,m] (if (contains? m k) 
             (nil? (m k)) 
             false )) 
             
; This is find internet!