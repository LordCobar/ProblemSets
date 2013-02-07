(ns ProblemSet2.Surpassers)
(use 'clojure.test)

(defn num-surpassers [list]
  (count (filter #(< (int (first list)) (int %)) (rest list))))


(is (= 5 (num-surpassers "generating")))
(is (= 6 (num-surpassers "enerating")))
(is (= 2 (num-surpassers "nerating")))
(is (= 5 (num-surpassers "erating")))

(defn max-surpasser-count [list]
  (apply max (map num-surpassers list)))

(is (= 0 (max-surpasser-count [5])))
(is (= 0 (max-surpasser-count [\a])))
(is (= 0 (max-surpasser-count [1 0])))
(is (= 1 (max-surpasser-count [0 1])))
; The first \e has six larger characters to its right
(is (= 6 (max-surpasser-count [\g \e \n \e \r \a \t \i \n \g])))
(is (= 6 (max-surpasser-count "generating")))