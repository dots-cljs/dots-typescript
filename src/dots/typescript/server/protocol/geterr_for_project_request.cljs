(ns dots.typescript.server.protocol.geterr-for-project-request
  "GeterrForProjectRequest request; value of command field is
   \"geterrForProject\". It works similarly with 'Geterr', only
   it request for every file in this project."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.GeterrForProject`"
  ^js [geterr-for-project-request]
  (.-command ^js geterr-for-project-request))

(defn set-command!
  ^js [geterr-for-project-request value]
  (set! (.-command ^js geterr-for-project-request) value))

(defn arguments
  "**Returns:** `GeterrForProjectRequestArgs`"
  ^js [geterr-for-project-request]
  (.-arguments ^js geterr-for-project-request))

(defn set-arguments!
  ^js [geterr-for-project-request value]
  (set! (.-arguments ^js geterr-for-project-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [geterr-for-project-request]
  (.-type ^js geterr-for-project-request))

(defn set-type!
  ^js [geterr-for-project-request value]
  (set! (.-type ^js geterr-for-project-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [geterr-for-project-request]
  (.-seq ^js geterr-for-project-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [geterr-for-project-request value]
  (set! (.-seq ^js geterr-for-project-request) value))
