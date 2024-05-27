(ns dots.typescript.incomplete-type
  (:refer-clojure :exclude [type]))

(defn flags
  "**Returns:** `0 | TypeFlags`"
  ^js [incomplete-type]
  (.-flags ^js incomplete-type))

(defn set-flags!
  ^js [incomplete-type value]
  (set! (.-flags ^js incomplete-type) value))

(defn type
  "**Returns:** `Type`"
  ^js [incomplete-type]
  (.-type ^js incomplete-type))

(defn set-type!
  ^js [incomplete-type value]
  (set! (.-type ^js incomplete-type) value))
