(ns clojure-patterns.binary-tree)

(defrecord BTNode [val left right])

(defn insert-in-order [t val]
  (cond
    (nil? t)        (BTNode. val nil nil)
    (< val (:val t) (BTNode. (:val t) (insert-in-order (:left t) t)))
    :else           (BTNode. (:val t) (:left t) (insert-in-order (:right t) val))))

(defn load-tree [t]
  "Takes a sorted list and builds a tree"
  (if (list? t)
    (let [[val left right] t]
      (BTNode. val
                 (load-tree left)
                 (load-tree right)))
    t))


(defn walk-in-order [t]
  (when t
    (concat (walk-in-order (:left t)) [(:val t)] (walk-in-order (:right t)))))
