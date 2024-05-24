(ns dots.typescript.server.protocol.get-edits-for-refactor-request
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [get-edits-for-refactor-request]
  (.-command ^js get-edits-for-refactor-request))

(defn set-command!
  ^js [get-edits-for-refactor-request value]
  (set! (.-command ^js get-edits-for-refactor-request) value))

(defn arguments
  ^js [get-edits-for-refactor-request]
  (.-arguments ^js get-edits-for-refactor-request))

(defn set-arguments!
  ^js [get-edits-for-refactor-request value]
  (set! (.-arguments ^js get-edits-for-refactor-request) value))

(defn type
  ^js [get-edits-for-refactor-request]
  (.-type ^js get-edits-for-refactor-request))

(defn set-type!
  ^js [get-edits-for-refactor-request value]
  (set! (.-type ^js get-edits-for-refactor-request) value))

(defn seq
  "Sequence number of the message"
  ^js [get-edits-for-refactor-request]
  (.-seq ^js get-edits-for-refactor-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-edits-for-refactor-request value]
  (set! (.-seq ^js get-edits-for-refactor-request) value))
