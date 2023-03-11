(ns hello
  (:gen-class))

(defn run [opts]
  (println "Hello World"))

(defn -main []
  (run ()))