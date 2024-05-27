(ns dots.typescript.server.protocol.get-move-to-refactoring-file-suggestions-request
  "Request refactorings at a given position or selection area to move to an existing file."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.GetMoveToRefactoringFileSuggestions`"
  ^js [get-move-to-refactoring-file-suggestions-request]
  (.-command ^js get-move-to-refactoring-file-suggestions-request))

(defn set-command!
  ^js [get-move-to-refactoring-file-suggestions-request value]
  (set! (.-command ^js get-move-to-refactoring-file-suggestions-request) value))

(defn arguments
  "**Returns:** `GetMoveToRefactoringFileSuggestionsRequestArgs`"
  ^js [get-move-to-refactoring-file-suggestions-request]
  (.-arguments ^js get-move-to-refactoring-file-suggestions-request))

(defn set-arguments!
  ^js [get-move-to-refactoring-file-suggestions-request value]
  (set! (.-arguments ^js get-move-to-refactoring-file-suggestions-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [get-move-to-refactoring-file-suggestions-request]
  (.-type ^js get-move-to-refactoring-file-suggestions-request))

(defn set-type!
  ^js [get-move-to-refactoring-file-suggestions-request value]
  (set! (.-type ^js get-move-to-refactoring-file-suggestions-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [get-move-to-refactoring-file-suggestions-request]
  (.-seq ^js get-move-to-refactoring-file-suggestions-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-move-to-refactoring-file-suggestions-request value]
  (set! (.-seq ^js get-move-to-refactoring-file-suggestions-request) value))
