(ns dots.typescript.incomplete-type
  (:refer-clojure :exclude [type]))

(defn flags
  ^js [incomplete-type]
  (.-flags ^js incomplete-type))

(defn set-flags!
  ^js [incomplete-type value]
  (set! (.-flags ^js incomplete-type) value))

(defn type
  ^js [incomplete-type]
  (.-type ^js incomplete-type))

(defn set-type!
  ^js [incomplete-type value]
  (set! (.-type ^js incomplete-type) value))
