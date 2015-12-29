(ns anduino.core-test
  (:require [clojure.test :refer :all]
            [anduino.core :refer :all]))

(def sample-device 
  (device "A device"
          (in-port  "UserInput" 13)
          (out-port "LedPort"   20)
          (action "setLedInput" :input)))

(deftest device-test
  (testing "device"
    (is (some? sample-device))
    (is (= "A device" (:name sample-device)))
    (is (= 2 (-> sample-device :ports count)))
    (is (= 1 (-> sample-device :actions count)))
    ))
