(ns dots.typescript.combined-code-fix-scope
  (:refer-clojure :exclude [type]))

(defn type
  ^js [combined-code-fix-scope]
  (.-type ^js combined-code-fix-scope))

(defn set-type!
  ^js [combined-code-fix-scope value]
  (set! (.-type ^js combined-code-fix-scope) value))

(defn file-name
  ^js [combined-code-fix-scope]
  (.-fileName ^js combined-code-fix-scope))

(defn set-file-name!
  ^js [combined-code-fix-scope value]
  (set! (.-fileName ^js combined-code-fix-scope) value))
