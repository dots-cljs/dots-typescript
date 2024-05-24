(ns dots.typescript.server.protocol.navto-request
  "Navto request message; value of command field is \"navto\".
   Return list of objects giving file locations and symbols that
   match the search term given in argument 'searchTerm'.  The
   context for the search is given by the named file."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [navto-request]
  (.-command ^js navto-request))

(defn set-command!
  ^js [navto-request value]
  (set! (.-command ^js navto-request) value))

(defn arguments
  ^js [navto-request]
  (.-arguments ^js navto-request))

(defn set-arguments!
  ^js [navto-request value]
  (set! (.-arguments ^js navto-request) value))

(defn type
  ^js [navto-request]
  (.-type ^js navto-request))

(defn set-type!
  ^js [navto-request value]
  (set! (.-type ^js navto-request) value))

(defn seq
  "Sequence number of the message"
  ^js [navto-request]
  (.-seq ^js navto-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [navto-request value]
  (set! (.-seq ^js navto-request) value))
