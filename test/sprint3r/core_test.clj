(ns sprint3r.core-test
  (:require [clojure.test :refer :all]
            [sprint3r.main :as m]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest plus-test
  (testing "plus."
    (is (= 2 (m/plus 1 2)))))