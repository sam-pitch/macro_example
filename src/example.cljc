(ns example
  #?(:cljs (:require-macros [example :refer [foo]]))
  (:require
   #?(:clj [clojure.java.io :as io])))

#?(:clj
   (defmacro foo []
     (slurp (io/file "short.txt"))))

(def bar
  (count (foo)))

bar
