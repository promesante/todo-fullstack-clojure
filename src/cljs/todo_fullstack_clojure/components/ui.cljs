(ns todo-fullstack-clojure.components.ui
  (:require [com.stuartsierra.component :as component]
            [todo-fullstack-clojure.core :refer [render]]))

(defrecord UIComponent []
  component/Lifecycle
  (start [component]
    (render)
    component)
  (stop [component]
    component))

(defn new-ui-component []
  (map->UIComponent {}))
