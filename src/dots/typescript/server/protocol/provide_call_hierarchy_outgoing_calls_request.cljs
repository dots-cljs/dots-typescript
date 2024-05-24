(ns dots.typescript.server.protocol.provide-call-hierarchy-outgoing-calls-request
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [provide-call-hierarchy-outgoing-calls-request]
  (.-command ^js provide-call-hierarchy-outgoing-calls-request))

(defn set-command!
  ^js [provide-call-hierarchy-outgoing-calls-request value]
  (set! (.-command ^js provide-call-hierarchy-outgoing-calls-request) value))

(defn arguments
  ^js [provide-call-hierarchy-outgoing-calls-request]
  (.-arguments ^js provide-call-hierarchy-outgoing-calls-request))

(defn set-arguments!
  ^js [provide-call-hierarchy-outgoing-calls-request value]
  (set! (.-arguments ^js provide-call-hierarchy-outgoing-calls-request) value))

(defn type
  ^js [provide-call-hierarchy-outgoing-calls-request]
  (.-type ^js provide-call-hierarchy-outgoing-calls-request))

(defn set-type!
  ^js [provide-call-hierarchy-outgoing-calls-request value]
  (set! (.-type ^js provide-call-hierarchy-outgoing-calls-request) value))

(defn seq
  "Sequence number of the message"
  ^js [provide-call-hierarchy-outgoing-calls-request]
  (.-seq ^js provide-call-hierarchy-outgoing-calls-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [provide-call-hierarchy-outgoing-calls-request value]
  (set! (.-seq ^js provide-call-hierarchy-outgoing-calls-request) value))