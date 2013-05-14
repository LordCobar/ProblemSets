(ns ProblemSet2.Histogram)
(use 'clojure.test)

(defn histogram [coll]
   (let [gp (group-by identity coll)] 
      (zipmap (keys gp) (map #(count (second %)) gp))))

(is (= {}
       (histogram "")))
(is (= {\a 1, \b 1, \c 1})
    (histogram "cba"))
(is (= {\x 3})
    (histogram "xxx"))
(is (= {\space 3, \a 1, \c 2, \e 3, \h 1, \i 3, \, 2, \M 3, \N 1, \n 2, \o 2, \P 1, \r 2, \s 2, \t 1} 
       (histogram "Nic McPhee, Morris, Minnesota")))