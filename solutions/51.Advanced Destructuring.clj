;Advanced Destructuring
 
;Difficulty:	Easy
;Topics:	destructuring


;Here is an example of some more sophisticated destructuring.
;test not run	

(= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))

;the solution: [1 2 3 4 5]