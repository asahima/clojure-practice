(defn fizzbuzz [x]
  (cond
   (= (mod x 15) 0) "FizzBuzz"
   (= (mod x 5) 0) "Buzz"
   (= (mod x 3) 0) "fizz"
   :else x))

(take 15 (map fizzbuzz (iterate inc 1)))
