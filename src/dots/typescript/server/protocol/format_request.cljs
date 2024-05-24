(ns dots.typescript.server.protocol.format-request
  "Format request; value of command field is \"format\".  Return
   response giving zero or more edit instructions.  The edit
   instructions will be sorted in file order.  Applying the edit
   instructions in reverse to file will result in correctly
   reformatted text."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [format-request]
  (.-command ^js format-request))

(defn set-command!
  ^js [format-request value]
  (set! (.-command ^js format-request) value))

(defn arguments
  ^js [format-request]
  (.-arguments ^js format-request))

(defn set-arguments!
  ^js [format-request value]
  (set! (.-arguments ^js format-request) value))

(defn type
  ^js [format-request]
  (.-type ^js format-request))

(defn set-type!
  ^js [format-request value]
  (set! (.-type ^js format-request) value))

(defn seq
  "Sequence number of the message"
  ^js [format-request]
  (.-seq ^js format-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [format-request value]
  (set! (.-seq ^js format-request) value))
