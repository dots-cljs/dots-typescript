(ns dots.typescript.server.protocol.configure-plugin-request
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [configure-plugin-request]
  (.-command ^js configure-plugin-request))

(defn set-command!
  ^js [configure-plugin-request value]
  (set! (.-command ^js configure-plugin-request) value))

(defn arguments
  ^js [configure-plugin-request]
  (.-arguments ^js configure-plugin-request))

(defn set-arguments!
  ^js [configure-plugin-request value]
  (set! (.-arguments ^js configure-plugin-request) value))

(defn type
  ^js [configure-plugin-request]
  (.-type ^js configure-plugin-request))

(defn set-type!
  ^js [configure-plugin-request value]
  (set! (.-type ^js configure-plugin-request) value))

(defn seq
  "Sequence number of the message"
  ^js [configure-plugin-request]
  (.-seq ^js configure-plugin-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [configure-plugin-request value]
  (set! (.-seq ^js configure-plugin-request) value))
