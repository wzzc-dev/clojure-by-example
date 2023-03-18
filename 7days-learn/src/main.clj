(ns main
  (:gen-class))

;; (defn fib-pair [[a b]] [b (+ a b)])
(defn fib-pair [[a b]] [b (+' a b)])

(defn factorial [n]
  (apply * (take n (iterate inc 1))))

(defn unless [test body] (if (not test) body))

(defn run [opts]
  (println (take 5 (interpose :and (cycle [:lather :rinse :repeat]))))
  (println (take 20 (interleave (cycle (range 2))(cycle (range 3)))))
  (println (take 5 (iterate inc 1)))
  (println (fib-pair [3 5]))
  (println (take 5
                 (map
                  first
                  (iterate fib-pair [1 1]))))
  (println (nth (map first (iterate fib-pair [1 1])) 500))
  (println (factorial 5))
  (println (unless true (println "Danger, danger Will Robinson")))
  (println (macroexpand ''something-we-do-not-want-interpreted))
  (println (macroexpand '#(count %))))


(defn -main [& args]
  (run ()))