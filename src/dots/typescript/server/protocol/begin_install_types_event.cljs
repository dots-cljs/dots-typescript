(ns dots.typescript.server.protocol.begin-install-types-event
  (:refer-clojure :exclude [seq type]))

(defn event
  ^js [begin-install-types-event]
  (.-event ^js begin-install-types-event))

(defn set-event!
  ^js [begin-install-types-event value]
  (set! (.-event ^js begin-install-types-event) value))

(defn body
  ^js [begin-install-types-event]
  (.-body ^js begin-install-types-event))

(defn set-body!
  ^js [begin-install-types-event value]
  (set! (.-body ^js begin-install-types-event) value))

(defn type
  ^js [begin-install-types-event]
  (.-type ^js begin-install-types-event))

(defn set-type!
  ^js [begin-install-types-event value]
  (set! (.-type ^js begin-install-types-event) value))

(defn seq
  "Sequence number of the message"
  ^js [begin-install-types-event]
  (.-seq ^js begin-install-types-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [begin-install-types-event value]
  (set! (.-seq ^js begin-install-types-event) value))
