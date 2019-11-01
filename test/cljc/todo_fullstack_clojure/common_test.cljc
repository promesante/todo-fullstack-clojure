(ns todo-fullstack-clojure.common-test
  #? (:cljs (:require-macros [cljs.test :refer (is deftest testing)]))
  (:require [todo-fullstack-clojure.common :as sut]
            #?(:clj [clojure.test :refer :all]
               :cljs [cljs.test])))

(deftest example-passing-test-cljc
  (is (= 1 1)))
