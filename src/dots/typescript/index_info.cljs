(ns dots.typescript.index-info
  (:refer-clojure :exclude [type]))

(defn key-type
  ^js [index-info]
  (.-keyType ^js index-info))

(defn set-key-type!
  ^js [index-info value]
  (set! (.-keyType ^js index-info) value))

(defn type
  ^js [index-info]
  (.-type ^js index-info))

(defn set-type!
  ^js [index-info value]
  (set! (.-type ^js index-info) value))

(defn readonly?
  ^js [index-info]
  (.-isReadonly ^js index-info))

(defn set-is-readonly!
  ^js [index-info value]
  (set! (.-isReadonly ^js index-info) value))

(defn declaration
  ^js [index-info]
  (.-declaration ^js index-info))

(defn set-declaration!
  ^js [index-info value]
  (set! (.-declaration ^js index-info) value))
