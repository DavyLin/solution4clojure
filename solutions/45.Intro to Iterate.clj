;45.Intro to Iterate.clj
(= _ (take 5 (iterate #(+ 3 %) 1)))


;solution: '(1 4 7 10 13)