(ns anduino.gen)

(def count-if
  (comp count filter))

(defn attr-is?
  [k v]
  #(= v (k %)))

(defn gen-state-proto
  "Generate Arduino state layout"
  [device]
  (let [out-ports (filter (attr-is? :dir :input) (:ports device))]
    {:bytes-count (count out-ports)
     :layout      (map-indexed (fn [index item] {:offset index :name (:name item)})
                               out-ports)
     }))

(defn gen-action-proto
  "Generate proto"
  ;; TODO: Finish action proto)
  ;; TODO: Happy new year!
  )

(defn gen-proto
  "Generate proto data (eg. data layout)"
  [device]
  {:state-proto (gen-state-proto device)
   :action-proto (gen-action-proto device)})


