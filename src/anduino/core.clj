(ns anduino.core)

(defn device
  "Device definition"
  [device-name & params]
  (let [ports   (filter #(= :port (:type %)) params)
        actions (filter #(= :action (:type %)) params)]
  {:name     device-name
   :ports    ports
   :actions  actions}))

(defn in-port
  "Create an input port"
  [port-name port-number]
  {:type  :port
   :dir   :input
   :name   port-name
   :port   port-number})

(defn out-port
  "Create a output port"
  [port-name port-number]
  {:type :port
   :dir  :output
   :name port-name
   :port port-number})

(defn action
  "Create an action"
  [action-name & params]
  {:type  :action
   :name   action-name
   :params params})
