(ns clojure-patterns.binary_search_tree_test
  (:use clojure.test
        clojure-patterns.binary-tree))

;So this is a sub-optimal set. I'm using it as an example only
(def value-list [2 1 5 4 9 18 23 16 22 33 31 34])
;After insertion we should get a list similar to this
(def in-order-list '(2 (1) (5 (4) (9 (18 (16) (23 (22) (33 (31) (34)))))) ))


; So when the values are inserted into the tree, this is what we're looking for
;            2
;           / \
;          1   5
;             /  \
;           4     9
;                  \
;                  18
;                 /  \
;               16    23
;                    /  \
;                  22    33
;                       /  \
;                     31    34


