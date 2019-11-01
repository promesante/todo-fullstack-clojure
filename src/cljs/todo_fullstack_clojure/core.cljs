(ns todo-fullstack-clojure.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as re-frame]
            [todo-fullstack-clojure.events]
            [todo-fullstack-clojure.subs]
            [todo-fullstack-clojure.views :as views]
            [todo-fullstack-clojure.config :as config]))

(enable-console-print!)

(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn render []
  (re-frame/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
