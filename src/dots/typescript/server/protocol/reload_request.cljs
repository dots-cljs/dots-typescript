(ns dots.typescript.server.protocol.reload-request
  "Reload request message; value of command field is \"reload\".
   Reload contents of file with name given by the 'file' argument
   from temporary file with name given by the 'tmpfile' argument.
   The two names can be identical."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [reload-request]
  (.-command ^js reload-request))

(defn set-command!
  ^js [reload-request value]
  (set! (.-command ^js reload-request) value))

(defn arguments
  ^js [reload-request]
  (.-arguments ^js reload-request))

(defn set-arguments!
  ^js [reload-request value]
  (set! (.-arguments ^js reload-request) value))

(defn type
  ^js [reload-request]
  (.-type ^js reload-request))

(defn set-type!
  ^js [reload-request value]
  (set! (.-type ^js reload-request) value))

(defn seq
  "Sequence number of the message"
  ^js [reload-request]
  (.-seq ^js reload-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [reload-request value]
  (set! (.-seq ^js reload-request) value))
