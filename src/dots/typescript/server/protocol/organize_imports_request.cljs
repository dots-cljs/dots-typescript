(ns dots.typescript.server.protocol.organize-imports-request
  "Organize imports by:
     1) Removing unused imports
     2) Coalescing imports from the same module
     3) Sorting imports"
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [organize-imports-request]
  (.-command ^js organize-imports-request))

(defn set-command!
  ^js [organize-imports-request value]
  (set! (.-command ^js organize-imports-request) value))

(defn arguments
  ^js [organize-imports-request]
  (.-arguments ^js organize-imports-request))

(defn set-arguments!
  ^js [organize-imports-request value]
  (set! (.-arguments ^js organize-imports-request) value))

(defn type
  ^js [organize-imports-request]
  (.-type ^js organize-imports-request))

(defn set-type!
  ^js [organize-imports-request value]
  (set! (.-type ^js organize-imports-request) value))

(defn seq
  "Sequence number of the message"
  ^js [organize-imports-request]
  (.-seq ^js organize-imports-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [organize-imports-request value]
  (set! (.-seq ^js organize-imports-request) value))
