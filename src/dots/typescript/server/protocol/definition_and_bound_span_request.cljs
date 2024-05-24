(ns dots.typescript.server.protocol.definition-and-bound-span-request
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [definition-and-bound-span-request]
  (.-command ^js definition-and-bound-span-request))

(defn arguments
  ^js [definition-and-bound-span-request]
  (.-arguments ^js definition-and-bound-span-request))

(defn set-arguments!
  ^js [definition-and-bound-span-request value]
  (set! (.-arguments ^js definition-and-bound-span-request) value))

(defn type
  ^js [definition-and-bound-span-request]
  (.-type ^js definition-and-bound-span-request))

(defn set-type!
  ^js [definition-and-bound-span-request value]
  (set! (.-type ^js definition-and-bound-span-request) value))

(defn seq
  "Sequence number of the message"
  ^js [definition-and-bound-span-request]
  (.-seq ^js definition-and-bound-span-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [definition-and-bound-span-request value]
  (set! (.-seq ^js definition-and-bound-span-request) value))
