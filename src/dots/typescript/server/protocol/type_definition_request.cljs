(ns dots.typescript.server.protocol.type-definition-request
  "Go to type request; value of command field is
   \"typeDefinition\". Return response giving the file locations that
   define the type for the symbol found in file at location line, col."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [type-definition-request]
  (.-command ^js type-definition-request))

(defn set-command!
  ^js [type-definition-request value]
  (set! (.-command ^js type-definition-request) value))

(defn arguments
  ^js [type-definition-request]
  (.-arguments ^js type-definition-request))

(defn set-arguments!
  ^js [type-definition-request value]
  (set! (.-arguments ^js type-definition-request) value))

(defn type
  ^js [type-definition-request]
  (.-type ^js type-definition-request))

(defn set-type!
  ^js [type-definition-request value]
  (set! (.-type ^js type-definition-request) value))

(defn seq
  "Sequence number of the message"
  ^js [type-definition-request]
  (.-seq ^js type-definition-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [type-definition-request value]
  (set! (.-seq ^js type-definition-request) value))
