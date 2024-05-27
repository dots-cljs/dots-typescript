(ns dots.typescript.server.protocol.project-info-request
  "A request to get the project information of the current file."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.ProjectInfo`"
  ^js [project-info-request]
  (.-command ^js project-info-request))

(defn set-command!
  ^js [project-info-request value]
  (set! (.-command ^js project-info-request) value))

(defn arguments
  "**Returns:** `ProjectInfoRequestArgs`"
  ^js [project-info-request]
  (.-arguments ^js project-info-request))

(defn set-arguments!
  ^js [project-info-request value]
  (set! (.-arguments ^js project-info-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [project-info-request]
  (.-type ^js project-info-request))

(defn set-type!
  ^js [project-info-request value]
  (set! (.-type ^js project-info-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [project-info-request]
  (.-seq ^js project-info-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [project-info-request value]
  (set! (.-seq ^js project-info-request) value))
