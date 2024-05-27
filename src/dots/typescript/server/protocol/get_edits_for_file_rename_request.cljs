(ns dots.typescript.server.protocol.get-edits-for-file-rename-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.GetEditsForFileRename`"
  ^js [get-edits-for-file-rename-request]
  (.-command ^js get-edits-for-file-rename-request))

(defn set-command!
  ^js [get-edits-for-file-rename-request value]
  (set! (.-command ^js get-edits-for-file-rename-request) value))

(defn arguments
  "**Returns:** `GetEditsForFileRenameRequestArgs`"
  ^js [get-edits-for-file-rename-request]
  (.-arguments ^js get-edits-for-file-rename-request))

(defn set-arguments!
  ^js [get-edits-for-file-rename-request value]
  (set! (.-arguments ^js get-edits-for-file-rename-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [get-edits-for-file-rename-request]
  (.-type ^js get-edits-for-file-rename-request))

(defn set-type!
  ^js [get-edits-for-file-rename-request value]
  (set! (.-type ^js get-edits-for-file-rename-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [get-edits-for-file-rename-request]
  (.-seq ^js get-edits-for-file-rename-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-edits-for-file-rename-request value]
  (set! (.-seq ^js get-edits-for-file-rename-request) value))
