(ns ProblemSet2.minfree)
(use 'clojure.test)

(defn minfree [list]
  (first (filter #(not (contains? list %)) (range 0 (inc (count list))))))

(is (= 0 (minfree #{})))
(is (= 2 (minfree #{ 0, 1 })))
(is (= 2 (minfree #{ 1, 0 })))
(is (= 2 (minfree #{ 0, 1, 8, 9 })))
(is (= 0 (minfree #{ 1, 2, 3 })))
(is (= 15 (minfree #{ 8, 23, 9, 0, 12, 11, 1, 10, 13, 7, 41, 4, 14, 21, 5, 17, 3, 19, 2, 6 })))