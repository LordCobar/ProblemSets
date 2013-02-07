(defn histogram [coll]
   (let [gp (group-by identity coll)] 
      (zipmap (keys gp) (map #(count (second %)) gp))))