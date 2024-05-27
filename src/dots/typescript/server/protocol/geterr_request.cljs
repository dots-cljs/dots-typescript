(ns dots.typescript.server.protocol.geterr-request
  "Geterr request; value of command field is \"geterr\". Wait for
   delay milliseconds and then, if during the wait no change or
   reload messages have arrived for the first file in the files
   list, get the syntactic errors for the file, field requests,
   and then get the semantic errors for the file.  Repeat with a
   smaller delay for each subsequent file on the files list.  Best
   practice for an editor is to send a file list containing each
   file that is currently visible, in most-recently-used order."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Geterr`"
  ^js [geterr-request]
  (.-command ^js geterr-request))

(defn set-command!
  ^js [geterr-request value]
  (set! (.-command ^js geterr-request) value))

(defn arguments
  "**Returns:** `GeterrRequestArgs`"
  ^js [geterr-request]
  (.-arguments ^js geterr-request))

(defn set-arguments!
  ^js [geterr-request value]
  (set! (.-arguments ^js geterr-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [geterr-request]
  (.-type ^js geterr-request))

(defn set-type!
  ^js [geterr-request value]
  (set! (.-type ^js geterr-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [geterr-request]
  (.-seq ^js geterr-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [geterr-request value]
  (set! (.-seq ^js geterr-request) value))
