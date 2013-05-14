(ns ProblemSet2.core-test
  (:use clojure.test
        ProblemSet2.core))

(deftest a-test
  (testing "Hist_Test"
    (is (= {}
       (build-histogram "")))
(is (= {\a 1, \b 1, \c 1})
    (build-histogram "cba"))
(is (= {\x 3})
    (build-histogram "xxx"))
(is (= {\space 3, \a 1, \c 2, \e 3, \h 1, \i 3, \, 2, \M 3, \N 1, \n 2, \o 2, \P 1, \r 2, \s 2, \t 1} 
       (build-histogram "Nic McPhee, Morris, Minnesota")))