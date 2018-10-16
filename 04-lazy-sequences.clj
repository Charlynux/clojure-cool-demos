(require '[clj-time.core :as t])
(require '[clj-time.predicates :as p])

(def start-cycle (t/date-time 2017 02 11))
(def n 9)

(defn step-cycle [cycle] (t/plus cycle (t/hours 8)))
(defn working-day? [cycle] (not (p/sunday? cycle)))

(->>
    (iterate step-cycle start-cycle)
    (filter working-day?)
    (take n))

(->>
    (iterate step-cycle start-cycle)
    (filter working-day?)
    (drop n)
    (first))