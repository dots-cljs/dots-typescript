(ns dots.typescript.server.protocol.get-combined-code-fix-request
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [get-combined-code-fix-request]
  (.-command ^js get-combined-code-fix-request))

(defn set-command!
  ^js [get-combined-code-fix-request value]
  (set! (.-command ^js get-combined-code-fix-request) value))

(defn arguments
  ^js [get-combined-code-fix-request]
  (.-arguments ^js get-combined-code-fix-request))

(defn set-arguments!
  ^js [get-combined-code-fix-request value]
  (set! (.-arguments ^js get-combined-code-fix-request) value))

(defn type
  ^js [get-combined-code-fix-request]
  (.-type ^js get-combined-code-fix-request))

(defn set-type!
  ^js [get-combined-code-fix-request value]
  (set! (.-type ^js get-combined-code-fix-request) value))

(defn seq
  "Sequence number of the message"
  ^js [get-combined-code-fix-request]
  (.-seq ^js get-combined-code-fix-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-combined-code-fix-request value]
  (set! (.-seq ^js get-combined-code-fix-request) value))
