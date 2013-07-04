(= _ ((fn add-five [x] (+ x 5)) 3))

(= _ ((fn [x] (+ x 5)) 3))

(= _ (#(+ % 5) 3))

(= _ ((partial + 5) 3))

;solution : 8