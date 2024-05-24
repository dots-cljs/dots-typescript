(ns dots.typescript.server.protocol.get-applicable-refactors-request
  "Request refactorings at a given position or selection area."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [get-applicable-refactors-request]
  (.-command ^js get-applicable-refactors-request))

(defn set-command!
  ^js [get-applicable-refactors-request value]
  (set! (.-command ^js get-applicable-refactors-request) value))

(defn arguments
  ^js [get-applicable-refactors-request]
  (.-arguments ^js get-applicable-refactors-request))

(defn set-arguments!
  ^js [get-applicable-refactors-request value]
  (set! (.-arguments ^js get-applicable-refactors-request) value))

(defn type
  ^js [get-applicable-refactors-request]
  (.-type ^js get-applicable-refactors-request))

(defn set-type!
  ^js [get-applicable-refactors-request value]
  (set! (.-type ^js get-applicable-refactors-request) value))

(defn seq
  "Sequence number of the message"
  ^js [get-applicable-refactors-request]
  (.-seq ^js get-applicable-refactors-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-applicable-refactors-request value]
  (set! (.-seq ^js get-applicable-refactors-request) value))
