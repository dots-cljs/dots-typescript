(ns dots.typescript.server.protocol.get-combined-code-fix-scope
  (:refer-clojure :exclude [type]))

(defn type
  "**Returns:** `\"file\"`"
  ^js [get-combined-code-fix-scope]
  (.-type ^js get-combined-code-fix-scope))

(defn set-type!
  ^js [get-combined-code-fix-scope value]
  (set! (.-type ^js get-combined-code-fix-scope) value))

(defn args
  "**Returns:** `FileRequestArgs`"
  ^js [get-combined-code-fix-scope]
  (.-args ^js get-combined-code-fix-scope))

(defn set-args!
  ^js [get-combined-code-fix-scope value]
  (set! (.-args ^js get-combined-code-fix-scope) value))
