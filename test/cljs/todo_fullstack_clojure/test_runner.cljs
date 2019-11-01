(ns todo-fullstack-clojure.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [todo-fullstack-clojure.core-test]
   [todo-fullstack-clojure.common-test]))

(enable-console-print!)

(doo-tests 'todo-fullstack-clojure.core-test
           'todo-fullstack-clojure.common-test)
