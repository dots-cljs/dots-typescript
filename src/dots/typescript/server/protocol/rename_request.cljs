(ns dots.typescript.server.protocol.rename-request
  "Rename request; value of command field is \"rename\". Return
   response giving the file locations that reference the symbol
   found in file at location line, col. Also return full display
   name of the symbol so that client can print it unambiguously."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [rename-request]
  (.-command ^js rename-request))

(defn set-command!
  ^js [rename-request value]
  (set! (.-command ^js rename-request) value))

(defn arguments
  ^js [rename-request]
  (.-arguments ^js rename-request))

(defn set-arguments!
  ^js [rename-request value]
  (set! (.-arguments ^js rename-request) value))

(defn type
  ^js [rename-request]
  (.-type ^js rename-request))

(defn set-type!
  ^js [rename-request value]
  (set! (.-type ^js rename-request) value))

(defn seq
  "Sequence number of the message"
  ^js [rename-request]
  (.-seq ^js rename-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [rename-request value]
  (set! (.-seq ^js rename-request) value))
